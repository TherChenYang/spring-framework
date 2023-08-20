package com.sub.source;

import com.sub.event.CustomEvent;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author: CY.Ma
 * @date: 2023/8/18 13:38
 * @description:
 */
@Component
public class CustomEventSource implements ApplicationContextAware {

	private ApplicationContext applicationContext;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}

	public void publish(CustomEvent customEvent) {
		applicationContext.publishEvent(customEvent);
	}
}
