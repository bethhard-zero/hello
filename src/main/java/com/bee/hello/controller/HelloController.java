package com.bee.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Taiga Cai
 */
@RestController
public class HelloController {

    @GetMapping
    public String hello() {
        return "Hello Mei";
    }

}
