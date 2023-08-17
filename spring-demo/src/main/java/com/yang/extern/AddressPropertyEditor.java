package com.yang.extern;

import com.yang.domain.Address;

import java.beans.PropertyEditorSupport;

/**
 * 自定义解析Address 上海市，青浦区，华新镇
 * @author: CY.Ma
 * @date: 2023/7/28 14:52
 * @description:
 */
public class AddressPropertyEditor extends PropertyEditorSupport {

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		String[] split = text.split(",");
		Address address = new Address();
		address.setProvince(split[0]);
		address.setCity(split[1]);
		address.setTown(split[2]);
		this.setValue(address);
	}
}
