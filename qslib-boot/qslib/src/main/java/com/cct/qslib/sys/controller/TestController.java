/*
 *
 *
 * @author caic
 * @since 1.0
 */
package com.cct.qslib.sys.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *
 * @author caic
 * @Date 2024/1/10
 * @since 1.0
 */
@RestController
@RequestMapping("/test")
public class TestController {
    @RequestMapping("/testLogin")
    public String test() {
        return "ok";
    }
}
