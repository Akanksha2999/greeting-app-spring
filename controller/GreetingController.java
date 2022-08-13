package com.bridgelabz.greetingappspring.controller;

import com.bridgelabz.greetingappspring.entity.NewUser;
import com.bridgelabz.greetingappspring.entity.User;
import com.bridgelabz.greetingappspring.service.IGreetingAppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/welcome")
public class GreetingController {
    private static final String TEMPLATE = "Hello,%s";
    private static final AtomicLong counter = new AtomicLong();

    @Autowired
    IGreetingAppService greetingAppService;

    @GetMapping("/getmessage")
    public User sayHello(@RequestParam(value = "name", defaultValue = "Bridgelabz") String name) {
        return new User(counter.incrementAndGet(), String.format(TEMPLATE, name));
    }

    @GetMapping("/get")
    public User sayHello() {
        return greetingAppService.getMessage();
    }

    @PostMapping("/post")
    private User sayHello(@RequestBody NewUser newUser) {
        return greetingAppService.greetingMessage(newUser);
    }
}
