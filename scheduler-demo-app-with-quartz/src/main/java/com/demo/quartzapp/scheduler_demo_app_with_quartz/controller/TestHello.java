package com.demo.quartzapp.scheduler_demo_app_with_quartz.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestHello {

    @GetMapping("/hello")
    public String hello() {
        String codespaceName = System.getenv("CODESPACE_NAME");
        if (codespaceName == null || codespaceName.isEmpty()) {
            codespaceName = "unknown";
        }
        return "Hello World from " + codespaceName;
    }
}
