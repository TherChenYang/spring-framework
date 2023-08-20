package com.sub.event;

import org.springframework.context.ApplicationEvent;

import java.io.Serializable;

/**
 * @author: CY.Ma
 * @date: 2023/8/18 13:34
 * @description:
 */
public class CustomEvent extends ApplicationEvent implements Serializable {

	private static final long serialVersionUID = -2128813458011625909L;

	private String message;

	public CustomEvent(Object source, String message) {
		super(source);
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
