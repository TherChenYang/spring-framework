package com.property;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author: CY.Ma
 * @date: 2024/1/26 16:04
 * @description:
 */
@Configuration
@PropertySource(value = "classpath:jdbc.properties")
@ComponentScan
public class SpringPropertyConfig {
}
