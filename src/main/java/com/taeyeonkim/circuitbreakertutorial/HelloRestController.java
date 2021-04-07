package com.taeyeonkim.circuitbreakertutorial;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/world")
    public String world() {
        return "world";
    }
}
