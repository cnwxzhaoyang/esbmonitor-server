package com.greywolf.demo.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;

/**
 * @Author GreyWolf
 * @Date 2020/6/22 16:50
 * @Version 1.0
 */
public class BeanUtil {


    /**
     * 把一个bean中的属性转化到map中
     *
     * @param bean       bean对象
     */
    public static Map<String,Object> beanToMap(Object bean)
    {
        Map<String,Object> properties = new HashMap<>();
        if (bean == null){
            return null;
        }
        try{
            Map<String,String> map = BeanUtils.describe(bean);
            map.remove("class");
            for(Iterator iter=map.keySet().iterator();iter.hasNext();)
            {
                String key = (String)iter.next();
                Object value = map.get(key);
                properties.put(key,value);
            }
            return properties;
        }catch (Exception ex){
            System.out.println("读取bean属性出错");
            ex.printStackTrace();
        }
        return null;
    }

    /**
     * 把一个map中的所有属性值设置到bean中
     *
     * @param properties 含有属性的map对象
     * @param bean       需要被设置属性的对象
     */
    public static void mapToBean(Map properties, Object bean)
    {
        if (properties == null || bean == null)
        {
            return;
        }
        try
        {
            for (Iterator iter = properties.keySet().iterator(); iter.hasNext();)
            {
                String key = (String) iter.next();
                Object value = properties.get(key);
                BeanUtils.setProperty(bean, key, value);
            }
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }
}
