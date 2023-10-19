package com.circle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author: CY.Ma
 * @date: 2023/10/10 18:40
 * @description:
 */
@Component
public class SimperUser {

	@Autowired
	private Job job;

	public void test() {
		System.out.println(job.getName());
	}

	public Job getJob() {
		return job;
	}

	public void setJob(Job job) {
		this.job = job;
	}
}
