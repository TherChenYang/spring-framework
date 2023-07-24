package com.yang.factory;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: CY.Ma
 * @date: 2023/7/24 15:03
 * @description:
 */
public class CustomXmlApplicationContext extends ClassPathXmlApplicationContext {

	public CustomXmlApplicationContext(String... configLocations) throws BeansException {
		super(configLocations);
	}

	/**
	 * 定制化bean工厂
	 * @param beanFactory the newly created bean factory for this context
	 */
	@Override
	protected void customizeBeanFactory(DefaultListableBeanFactory beanFactory) {
		System.out.println("定制化bean工厂");
		// 允许覆盖bean定义信息，可以注册一个已经存在的bean定义
		beanFactory.setAllowBeanDefinitionOverriding(true);
		// 允许自动解决循环依赖
		beanFactory.setAllowCircularReferences(true);
	}
}
