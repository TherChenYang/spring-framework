package com.importRegister.domain;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author: CY.Ma
 * @date: 2023/8/17 11:10
 * @description:
 */
@Configuration
@Import(UserImported.class)
public class User {
}
