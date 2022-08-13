package com.bridgelabz.greetingappspring.service;

import com.bridgelabz.greetingappspring.entity.User;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;

@Service
public class GreetingAppService {
    private static final String TEMPLATE="Hello ,%s !!";
    private static final AtomicLong count=new AtomicLong();
    public User getMessage() {
        return new User(count.incrementAndGet(),String.format(TEMPLATE,"Akanksha !!"));
    }
}
