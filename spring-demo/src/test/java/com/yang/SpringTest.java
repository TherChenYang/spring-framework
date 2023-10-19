package com.yang;

import com.beanAnnotation.SimpleBean;
import com.circle.SimperUser;
import com.circle.SpringAopConfig;
import com.common.Account;
import com.construct.Report;
import com.factoryBean.CustomSmartFactoryBean;
import com.importRegister.config.SpringConfiguration;
import com.importRegister.domain.User;
import com.importRegister.im.UserImported;
import com.importRegister.sel.CustomClass;
import com.circle.Job;
import com.sub.event.CustomEvent;
import com.sub.source.CustomEventSource;
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

	/**
	 * 测试事件订阅与发布
	 */
	@Test
	public void test06() {
		ApplicationContext ac = new AnnotationConfigApplicationContext("com.sub");
		CustomEventSource eventSource = ac.getBean(CustomEventSource.class);

		CustomEvent event = new CustomEvent(this, "测试Message");
		eventSource.publish(event);
	}

	/**
	 * 测试FactoryBean接口
	 */
	@Test
	public void test07() {
		ApplicationContext ac = new AnnotationConfigApplicationContext("com.factoryBean");

		Account user = (Account) ac.getBean("customFactoryBean");
		System.out.println("-----------------------");
		System.out.println(user);
		System.out.println(user.getName());

		Account user1 = (Account) ac.getBean("customFactoryBean");
		System.out.println("-----------------------");
		System.out.println(user1);
		System.out.println(user1.getName());


		com.common.Person person = (com.common.Person) ac.getBean("customSmartFactoryBean");
		CustomSmartFactoryBean customSmartFactoryBean = (CustomSmartFactoryBean) ac.getBean("&customSmartFactoryBean");
		System.out.println(person);
		System.out.println(customSmartFactoryBean);

	}

	/**
	 * 测试InstantiationAwareBeanPostProcessor
	 */
	@Test
	public void test08() {
		ApplicationContext ac = new AnnotationConfigApplicationContext("com.instantiationAware");

		Account account = (Account) ac.getBean("user");
		System.out.println(account);
	}

	@Test
	public void test09() {
		ApplicationContext ac = new AnnotationConfigApplicationContext("com.construct");
		Report bean = ac.getBean(Report.class);
		System.out.println(bean);
	}

	/*
	 * 测试循环依赖
	 */
	@Test
	public void test10() {
		ApplicationContext ac = new AnnotationConfigApplicationContext(SpringAopConfig.class);
		SimperUser bean = ac.getBean(SimperUser.class);
		Job job = bean.getJob();
		bean.test();
	}

	/**
	 * 测试通过Class获取bean，容器中有多个bean的情况
	 */
	@Test
	public void test11() {
		ApplicationContext ac = new AnnotationConfigApplicationContext("com.noUnique");
		Object job = ac.getBean(Job.class);
		System.out.println(job);
	}

	/**
	 * 测试@Bean注解注入的bean是否遵循springBean的生命周期
	 */
	@Test
	public void test12() {
		ApplicationContext ac = new AnnotationConfigApplicationContext("com.beanAnnotation");
		SimpleBean bean = ac.getBean(SimpleBean.class);
		bean.test();
	}

}
