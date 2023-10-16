package com.simple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author: CY.Ma
 * @date: 2023/10/13 13:43
 * @description:
 */
public class Job {

	@Autowired
	private SimperUser simperUser;

	private final String name = "设计师";

	public String getName() {
		return name + simperUser.getClass().getName();
	}

}
