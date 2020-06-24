package com.greywolf.demo;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class SwaggerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwaggerApplication.class, args);
	}

	@Bean
	public HttpMessageConverters fastJsonHttpMessageConverters() {
		FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();
		FastJsonConfig fastJsonConfig = new FastJsonConfig();
//		fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);
		fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat, SerializerFeature.WriteNullListAsEmpty,
				SerializerFeature.WriteNullStringAsEmpty);
		fastConverter.setFastJsonConfig(fastJsonConfig);
		//解决中文乱码
		List<MediaType> fastMediaTypes = new ArrayList<>();
		fastMediaTypes.add(MediaType.APPLICATION_JSON_UTF8);
		fastConverter.setSupportedMediaTypes(fastMediaTypes);
		HttpMessageConverter<?> converter = fastConverter;
		return new HttpMessageConverters(converter);
	}

//	@Bean
//	public HttpMessageConverter httpSmileJackson2MessageConverter() {
//		return new AbstractJackson2HttpMessageConverter(
//				new ObjectMapper(new SmileFactory()).registerModule(new AfterburnerModule()),
//				new MediaType("application", "x-jackson-smile")) {
//		};
//	}

}
