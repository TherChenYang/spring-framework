package com.yang.domain;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @author: CY.Ma
 * @date: 2023/8/11 13:29
 * @description:
 */
@Configuration
@ComponentScan(basePackages = {"com.yang"})
public class MyComponentScan {

	@Component
	class innerClass{

	}
}
