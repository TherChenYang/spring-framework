package com.circle;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author: CY.Ma
 * @date: 2023/10/19 10:20
 * @description:
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = {"com.circle"})
public class SpringAopConfig {
}
