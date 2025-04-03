package com.msa_lab.springboot_demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HelloController {

    @GetMapping("/")
    public String helloWorld() {
        return "🔑 Hello World on kubernetes!!!";
    }
}
