package com.importRegister.im;

import com.importRegister.sel.CustomSelector;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author: CY.Ma
 * @date: 2023/8/17 15:50
 * @description:
 */
@Configuration
@Import({CustomSelector.class})
public class UserImported {
}
