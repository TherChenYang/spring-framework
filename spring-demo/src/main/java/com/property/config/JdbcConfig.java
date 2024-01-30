package com.property.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

/**
 * @author: CY.Ma
 * @date: 2024/1/26 16:05
 * @description:
 */
@Configuration
public class JdbcConfig {
	@Value("${jdbc.driver}")
	private String driver;
	@Value("${jdbc.url}")
	private String url;
	@Value("${jdbc.username}")
	private String username;
	@Value("${jdbc.password}")
	private String password;

	/**
	 * 创建JdbcTemplate对象，并且存入IOC容器
	 * @return
	 */
	@Bean("jdbcTemplate")
	public JdbcTemplate createJdbcTemplate(@Autowired DataSource dataSource) {
		return new JdbcTemplate(dataSource);
	}

	/**
	 * 创建数据源，并存入IOC容器
	 * @return
	 */
	@Bean("dataSource")
	public DataSource createDataSource() {
		// 1. 创建spring内置数据源对象
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		// 2. 给数据源提供必要的参数
		dataSource.setDriverClassName(driver);
		dataSource.setUrl(url);
		dataSource.setUsername(username);
		dataSource.setPassword(password);
		return dataSource;
	}
}
