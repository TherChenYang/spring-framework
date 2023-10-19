package com.circle;

import org.springframework.stereotype.Service;

/**
 * 抽象类在doScan时findCandidateComponents会过滤掉抽象的class，除非class中有@Lookup修饰的方法
 * @author: CY.Ma
 * @date: 2023/10/13 13:52
 * @description:
 */
@Service
public abstract class AbstractJob {
	private String name = "test";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
