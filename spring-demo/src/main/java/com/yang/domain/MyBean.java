package com.yang.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author: CY.Ma
 * @date: 2023/8/11 15:01
 * @description:
 */
@Component
public class MyBean {

	@Bean
	public User userConfig() {
		return new User();
	}
}
