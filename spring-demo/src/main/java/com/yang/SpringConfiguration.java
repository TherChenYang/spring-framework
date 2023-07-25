package com.yang;

import com.chen.ImportConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Import;

/**
 * @author: CY.Ma
 * @date: 2023/7/18 11:07
 * @description:
 */
@Configuration
@ComponentScan(basePackages = {"com.yang"}
//		, includeFilters = @ComponentScan.Filter(type = FilterType.CUSTOM, classes = DistrictTypeFilter.class)
)
@Import({ImportConfiguration.class})
public class SpringConfiguration {
}
