package com.beanAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * @author: CY.Ma
 * @date: 2023/10/18 09:43
 * @description:
 */
@Configuration
public class BeanConfig {

	@Bean
	public SimpleBean handle() {
		return new SimpleBean();
	}
}
