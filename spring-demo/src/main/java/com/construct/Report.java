package com.construct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author: CY.Ma
 * @date: 2023/9/1 09:56
 * @description:
 */
@Component
public class Report {

	private Temp temp;

	private Temp01 temp01;

	public Report() {
	}

	@Autowired(required = false)
	public Report(Temp name) {
		this.temp = name;
	}

	@Autowired(required = false)
	public Report(Temp01 temp01) {
		this.temp01 = temp01;
	}

	@Override
	public String toString() {
		return "Report{" +
				"temp=" + temp +
				", temp01=" + temp01 +
				'}';
	}
}
