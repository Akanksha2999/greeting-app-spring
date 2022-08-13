package com.bridgelabz.greetingappspring.service;

import com.bridgelabz.greetingappspring.entity.NewUser;
import com.bridgelabz.greetingappspring.entity.User;

public interface IGreetingAppService {
    User getMessage();

    User greetingMessage(NewUser newUser);
}
