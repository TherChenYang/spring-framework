package com.configProxy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 无论是否开启aop功能，@Configuration都会生成代理
 * @author: CY.Ma
 * @date: 2023/11/10 13:28
 * @description:
 */
@Configuration
@ComponentScan(basePackages = {"com.configProxy"})
public class SpringProxyConfig {

	@Bean
	public ConfigDemoBean demoBean() {
		return new ConfigDemoBean();
	}

	@Bean
	public ConfigDemoBean configBean() {
		return new ConfigDemoBean();
	}

	public void test() {
		ConfigDemoBean demoBean01 = this.demoBean();
		ConfigDemoBean demoBean02 = this.demoBean();
		// 这里返回true，因为spring已经为@Configuration生成了代理
		// 上面的两次调用都会进入到代理，返回spring容器中相同的bean
		// 这里的this为什么会走代理，而事务中的this却不会走代理
		// 因为这里直接调用非代理方法，代理类中没有对非代理方法进行特殊处理，所以都是从代理类为入口进行调用
		// 而事务中生成的代理对象，对普通方法进行了特殊处理，在内部存储了原对象，调用都是通过原对象.method进行调用，所以不会走代理
		System.out.println(demoBean01 == demoBean02);
	}
}
