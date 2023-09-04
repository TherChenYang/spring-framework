package com.factoryBean;

import com.common.Person;
import org.springframework.beans.factory.SmartFactoryBean;
import org.springframework.stereotype.Component;

/**
 * @author: CY.Ma
 * @date: 2023/8/22 16:37
 * @description:
 */
@Component
public class CustomSmartFactoryBean implements SmartFactoryBean<Person> {
	@Override
	public Person getObject() throws Exception {
		return new Person();
	}

	@Override
	public Class<?> getObjectType() {
		return Person.class;
	}

	@Override
	public boolean isSingleton() {
		return SmartFactoryBean.super.isSingleton();
	}

	/**
	 * 如果return true，factoryBean包装的类也会在refresh阶段完成初始化，而不是在getBean的时候初始化
	 * 这时候会将Bean放入factoryBeanObjectCache中，并不会在一级缓存中，且BeanDefinitionMap中也没有对应的Bean
	 * 以为FactoryBean不收spring生命周期约束
	 * @return
	 */
	@Override
	public boolean isEagerInit() {
		return true;
	}
}
