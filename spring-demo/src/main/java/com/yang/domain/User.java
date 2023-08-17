package com.yang.domain;

import java.io.Serializable;

/**
 * @author: CY.Ma
 * @date: 2023/8/11 15:01
 * @description:
 */
public class User implements Serializable {
	private static final long serialVersionUID = -433318868175802603L;

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
