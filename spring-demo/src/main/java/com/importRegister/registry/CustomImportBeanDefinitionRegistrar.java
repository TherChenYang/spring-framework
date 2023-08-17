package com.importRegister.registry;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.filter.AspectJTypeFilter;
import org.springframework.core.type.filter.TypeFilter;

/**
 * 扫包能扫到 domain下的User类
 * @author: CY.Ma
 * @date: 2023/8/17 11:00
 * @description:
 */
public class CustomImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

	private final String packagePath = "com.importRegister.domain";

	private final String expression = "com.importRegister.domain..*";

	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
		if (importingClassMetadata.hasAnnotation(Configuration.class.getName())) {
			ClassPathBeanDefinitionScanner scanner = new ClassPathBeanDefinitionScanner(registry, false);
			TypeFilter typeFilter = new AspectJTypeFilter(expression, CustomImportBeanDefinitionRegistrar.class.getClassLoader());
			scanner.addIncludeFilter(typeFilter);
			scanner.scan(packagePath);
		}
	}
}
