package com.yang;

import com.yang.domain.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

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
}
