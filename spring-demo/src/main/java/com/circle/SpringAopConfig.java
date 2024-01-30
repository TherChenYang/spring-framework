package com.circle;

import org.springframework.context.annotation.*;

/**
 * @author: CY.Ma
 * @date: 2023/10/19 10:20
 * @description:
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = {"com.circle"})
public class SpringAopConfig {

	@Bean
	public SimpleBean simpleBean() {
		return new SimpleBean();
	}

//	@Bean
	public SimpleUserB b() {
		SimpleBean simpleBean = this.simpleBean();
		SimpleBean simpleBean1 = this.simpleBean();
		System.out.println(simpleBean1 == simpleBean);
		return new SimpleUserB();
	}
}
