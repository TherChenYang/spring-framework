package com.common;

import java.io.Serializable;

/**
 * @author: CY.Ma
 * @date: 2023/8/22 16:42
 * @description:
 */
public class Person implements Serializable {
	private static final long serialVersionUID = -7351386291998647297L;

	private String name;

	public Person() {
		this.name = "person";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
