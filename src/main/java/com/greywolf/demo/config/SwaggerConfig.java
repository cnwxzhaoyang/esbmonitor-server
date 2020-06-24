package com.greywolf.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Author GreyWolf
 * @Date 2020/6/15 13:35
 * @Version 1.0
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig extends WebMvcConfigurerAdapter {

    //日志
    @Bean
    public Docket docket(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(new ApiInfoBuilder()
                        .title("应用开发软件接口消息中间件可视化平台后端接口文档")
                        .description("本文档遵循swagger2接口规范，由工具生成")
                        .license("Apache 2.0")
                        .contact(new Contact("GreyWolf", "http:/test-url.com", "cnwxzhaoyang@163.com"))
                        .licenseUrl("http://www.apache.org/licenses/LICENSE-2.0.html")
                        .version("1.0.0")
                        .build())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.greywolf.demo.esbmonitor.controller"))
                .paths(PathSelectors.any())
                .build();
    }

//    //系统管理
//    @Bean
//    public Docket systemDocket(){
//        return new Docket(DocumentationType.SWAGGER_2)
////                .groupName("角色-用户-权限")
//                .groupName("system")
//                .apiInfo(new ApiInfoBuilder()
//                        .title("系统管理")
//                        .license("Apache 2.0")
//                        .licenseUrl("http://www.apache.org/licenses/LICENSE-2.0.html")
//                        .description("系统管理-用户，角色以及权限的管理")
//                        .version("1.0.0")
//                        .build())
//                .select()
//                .apis(RequestHandlerSelectors.basePackage("com.greywolf.demo.esbmonitor.controller"))
//                .paths(PathSelectors.any())
//                .paths(PathSelectors.ant("/system/**"))
//                .build();
//    }
//
//    //服务管理
//    @Bean
//    public Docket serviceDocket(){
//        return new Docket(DocumentationType.SWAGGER_2)
////                .groupName("服务查询")
//                .groupName("service")
//                .apiInfo(new ApiInfoBuilder()
//                        .title("服务管理")
//                        .license("Apache 2.0")
//                        .licenseUrl("http://www.apache.org/licenses/LICENSE-2.0.html")
//                        .description("在本系统中注册的服务")
//                        .version("1.0.0")
//                        .build())
//                .select()
//                .apis(RequestHandlerSelectors.basePackage("com.greywolf.demo.esbmonitor.controller"))
//                .paths(PathSelectors.any())
//                .paths(PathSelectors.ant("/service/**"))
//                .build();
//    }
//
//    //统计数据查询接口
//    @Bean
//    public Docket statsDocket(){
//        return new Docket(DocumentationType.SWAGGER_2)
////                .groupName("统计数据查询接口")
//                .groupName("statistic")
//                .apiInfo(new ApiInfoBuilder()
//                        .title("统计")
//                        .license("Apache 2.0")
//                        .licenseUrl("http://www.apache.org/licenses/LICENSE-2.0.html")
//                        .version("1.0.0")
//                        .build())
//                .select()
//                .apis(RequestHandlerSelectors.basePackage("com.greywolf.demo.esbmonitor.controller"))
//                .paths(PathSelectors.any())
//                .paths(PathSelectors.ant("/stats/**"))
//                .build();
//    }
}

