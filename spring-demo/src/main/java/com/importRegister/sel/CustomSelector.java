package com.importRegister.sel;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author: CY.Ma
 * @date: 2023/8/17 16:52
 * @description:
 */
public class CustomSelector implements ImportSelector {
	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		String s = "com.importRegister.sel.CustomClass";
		return new String[]{s};
	}
}
