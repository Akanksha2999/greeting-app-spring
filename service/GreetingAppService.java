package com.bridgelabz.greetingappspring.service;

import com.bridgelabz.greetingappspring.entity.NewUser;
import com.bridgelabz.greetingappspring.entity.User;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;

@Service
public class GreetingAppService implements IGreetingAppService{
    private static final String TEMPLATE = "Hello ,%s ";
    private static final AtomicLong count = new AtomicLong();

    @Override
    public User getMessage() {
        return new User(count.incrementAndGet(),String.format(TEMPLATE,"Akanksha !!"));
    }

    @Override
    public User greetingMessage(NewUser newUser) {
        return new User (count.incrementAndGet(), String.format(TEMPLATE, newUser.getFirstName()) + newUser.getLastName());
    }
}
