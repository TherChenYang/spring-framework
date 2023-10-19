package com.circle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author: CY.Ma
 * @date: 2023/10/13 13:43
 * @description:
 */
@Component
public class Job {

	@Autowired
	private SimperUser simperUser;

	private final String name = "设计师";

	public void test() {
		System.out.println(simperUser.getClass().getSimpleName());
	}

	public String getName() {
		return name + simperUser.getClass().getName();
	}

	public SimperUser getSimperUser() {
		return simperUser;
	}

	public void setSimperUser(SimperUser simperUser) {
		this.simperUser = simperUser;
	}
}
