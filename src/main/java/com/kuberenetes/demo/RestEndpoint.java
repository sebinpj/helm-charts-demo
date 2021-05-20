package com.kuberenetes.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestEndpoint {

    @GetMapping("/")
    public String getString() {
        return "Welcome to K8S";
    }
}
