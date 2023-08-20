package com.sub.factory;

import com.sub.event.CustomEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author: CY.Ma
 * @date: 2023/8/18 13:36
 * @description:
 */
@Component
public class CustomListener implements ApplicationListener<CustomEvent> {

	@Override
	public void onApplicationEvent(CustomEvent event) {
		System.out.println(event.getSource() + event.getMessage());
	}
}
