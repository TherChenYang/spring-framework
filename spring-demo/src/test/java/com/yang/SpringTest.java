package com.yang;

import com.importRegister.config.SpringConfiguration;
import com.importRegister.domain.User;
import com.importRegister.im.UserImported;
import com.importRegister.sel.CustomClass;
import com.yang.domain.Person;
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

	@Test
	public void test04() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring-${user}.xml");
		Person person = ac.getBean("person", Person.class);
		System.out.println(person);
	}

	/**
	 * 测试@Import注解中Registar中导入的类，又有@Import注解导入别的类
	 */
	@Test
	public void test05() {
		ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		for (String beanDefinitionName : ac.getBeanDefinitionNames()) {
			System.out.println(beanDefinitionName);
		}
		User user = ac.getBean("user", User.class);
		UserImported userImported = ac.getBean(UserImported.class);
		CustomClass bean = ac.getBean(CustomClass.class);

		System.out.println(user);
		System.out.println(userImported);
		System.out.println(bean);
	}


}
