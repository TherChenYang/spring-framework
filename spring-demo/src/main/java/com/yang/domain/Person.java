package com.yang.domain;

import java.io.Serializable;

/**
 * @author: CY.Ma
 * @date: 2023/7/28 14:50
 * @description:
 */
public class Person implements Serializable {
	private static final long serialVersionUID = -3577416709615078193L;

	private String name;

	private Integer age;

	private Address address;

	public Person() {
	}

	public Person(String name, Integer age, Address address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address addresss) {
		this.address = addresss;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "Person{" +
				"name='" + name + '\'' +
				", age=" + age +
				", address=" + address +
				'}';
	}
}
