package com.aop;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author: CY.Ma
 * @date: 2023/11/10 14:14
 * @description:
 */
@Component
@Order(-1)
public class AopUserService {

	public void saveUser() {
		System.out.println("invoke save User!");
	}

	public void delUser() {
		System.out.println("invoke del User!");
	}
}
