package com.yang.extern.factory;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;

/**
 * @author: CY.Ma
 * @date: 2023/8/8 20:48
 * @description:
 */
public class MyBeanFactoryPostProcessor implements BeanDefinitionRegistryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("加载自定义BeanFactoryPostProcessor");

	}

	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		System.out.println("加载自定义postProcessBeanDefinitionRegistry");
		BeanDefinitionBuilder beanDefinitionBuilder = BeanDefinitionBuilder.rootBeanDefinition(ImportBeanFactoryPostProcessor.class);
		registry.registerBeanDefinition("importBeanFactoryPostProcessor", beanDefinitionBuilder.getBeanDefinition());
	}
}
