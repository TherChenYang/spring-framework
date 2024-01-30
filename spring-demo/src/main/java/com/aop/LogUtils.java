package com.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author: CY.Ma
 * @date: 2023/11/10 14:14
 * @description:
 */
@Aspect
@Component
public class LogUtils {

	@Before("com.aop.MyPointCut.pointCut())")
	public void logBefore() {
		System.out.println("log before service!");
	}

	@After("com.aop.MyPointCut.pointCut())")
	public void logAfter() {
		System.out.println("log after service!");
	}
}
