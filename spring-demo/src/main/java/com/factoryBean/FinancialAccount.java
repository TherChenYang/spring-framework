package com.factoryBean;

import com.common.Account;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @author: CY.Ma
 * @date: 2023/8/22 09:55
 * @description:
 */
@Component
public class FinancialAccount extends Account implements Serializable {

	private static final long serialVersionUID = -526206312564096031L;

	private Double money;

	public Double getMoney() {
		return money;
	}

	public void setMoney(Double money) {
		this.money = money;
	}
}
