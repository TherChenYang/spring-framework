package com.yang.domain;

import java.io.Serializable;

/**
 * @author: CY.Ma
 * @date: 2023/7/28 14:49
 * @description:
 */
public class Address implements Serializable {
	private static final long serialVersionUID = -3577416709615078193L;

	private String province;

	private String city;

	private String town;

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	@Override
	public String toString() {
		return "Addresss{" +
				"province='" + province + '\'' +
				", city='" + city + '\'' +
				", town='" + town + '\'' +
				'}';
	}
}
