package com.chen;

import org.springframework.context.annotation.Import;

/**
 * @author: CY.Ma
 * @date: 2023/7/24 16:41
 * @description:
 */
@Import(Account.class)
public class ImportConfiguration {

	public void test() {
		System.out.println("test");
	}
}
