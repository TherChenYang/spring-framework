package com.common;

import java.io.Serializable;

/**
 * @author: CY.Ma
 * @date: 2023/8/22 09:38
 * @description:
 */
public class Account implements Serializable {
	private static final long serialVersionUID = 5502553515228519962L;

	private String name;

	public Account() {
		this.name = "yang";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
