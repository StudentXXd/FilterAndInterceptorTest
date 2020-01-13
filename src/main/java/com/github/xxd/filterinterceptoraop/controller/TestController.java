package com.github.xxd.filterinterceptoraop.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xxd
 * @date 2020/1/13 15:13
 */
@Slf4j
@RestController
@RequestMapping("test/")
public class TestController {

    @PostMapping("login")
    public String login(){
        log.info("login run...");
        return "hello world!";
    }
}
