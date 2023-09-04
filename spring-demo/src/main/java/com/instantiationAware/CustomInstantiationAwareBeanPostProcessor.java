package com.instantiationAware;

import com.common.Account;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @author: CY.Ma
 * @date: 2023/8/29 16:53
 * @description:
 */
@Component
public class CustomInstantiationAwareBeanPostProcessor implements InstantiationAwareBeanPostProcessor {

	@Override
	public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
		System.out.println(beanName + "-----执行了postProcessBeforeInstantiation");
		if ("user".equals(beanName)) {
			return new Account();
		}
		return null;
	}

	@Override
	public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
		System.out.println(beanName + "-----执行了postProcessAfterInstantiation");
		return true;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println(beanName + "-----执行了postProcessAfterInstantiation");
		return bean;
	}
}
