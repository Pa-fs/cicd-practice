package com.msa_lab.springboot_demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HelloController {
    private final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @GetMapping("/")
    public String helloWorld() {
        logger.info("Hello world on kubernetes!!");

        return "🔑 Hello World on kubernetes!!!";
    }
}
