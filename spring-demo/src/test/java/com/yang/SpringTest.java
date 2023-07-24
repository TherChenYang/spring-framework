package com.yang;

import com.yang.domain.UserService;
import com.yang.factory.CustomXmlApplicationContext;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: CY.Ma
 * @date: 2023/7/18 11:08
 * @description:
 */
public class SpringTest {

	@Test
	public void test01() {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext("com.yang");
		UserService userService = ac.getBean("userService", UserService.class);
		System.out.println(userService);
	}

	@Test
	public void test02() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring-${user}.xml");
		UserService userService = ac.getBean("userService", UserService.class);
		System.out.println(userService);
	}

	@Test
	public void test03() {
		ApplicationContext ac = new CustomXmlApplicationContext("spring-${user}.xml");
		UserService userService = ac.getBean("userService", UserService.class);
		System.out.println(userService);
	}


}
