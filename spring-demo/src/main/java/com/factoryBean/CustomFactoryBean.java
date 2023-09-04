package com.factoryBean;

import com.common.Account;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * @author: CY.Ma
 * @date: 2023/8/22 09:38
 * @description:
// */
@Component
public class CustomFactoryBean implements FactoryBean<Account> {

	@Override
	public Account getObject() throws Exception {
		return new Account();
	}

	@Override
	public Class<?> getObjectType() {
		return Account.class;
	}

	/**
	 * 如果isSingleton是false，不会将getObject生成的对象放入FactoryBean缓存中
	 * @return
	 */
	@Override
	public boolean isSingleton() {
		return true;
	}
}
