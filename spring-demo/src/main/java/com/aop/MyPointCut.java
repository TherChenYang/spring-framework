package com.aop;

import org.aspectj.lang.annotation.Pointcut;

/**
 * @author: CY.Ma
 * @date: 2023/11/10 16:39
 * @description:
 */
public class MyPointCut {

	@Pointcut(value = "execution(* com.aop.AopUserService.*(..))) ")
	public void pointCut(){}
}
