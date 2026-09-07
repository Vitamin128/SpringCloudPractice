package com.example.springcloudpractice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping(value = "/hello", produces = "text/plain;charset=UTF-8")
    public String hello() {
        return "Hello World!";
    }
}
