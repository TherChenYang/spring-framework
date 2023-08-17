package com.importRegister.config;

import com.importRegister.registry.CustomImportBeanDefinitionRegistrar;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author: CY.Ma
 * @date: 2023/8/17 10:59
 * @description:
 */
@Configuration
@Import({CustomImportBeanDefinitionRegistrar.class})
public class SpringConfiguration {
}
