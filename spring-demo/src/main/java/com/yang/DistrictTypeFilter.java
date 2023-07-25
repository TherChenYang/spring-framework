package com.yang;

import org.springframework.core.type.filter.AbstractTypeHierarchyTraversingFilter;

/**
 * @author: CY.Ma
 * @date: 2023/7/25 19:42
 * @description:
 */
public class DistrictTypeFilter extends AbstractTypeHierarchyTraversingFilter {

	public DistrictTypeFilter() {
		// 不考虑基类，不考虑接口上的信息
		super(false, false);
	}

	/**
	 * 本类将注册为Exclude,返回true表示拒绝
	 * @param className
	 * @return
	 */
	@Override
	protected boolean matchClassName(String className) {
		return false;
	}


}
