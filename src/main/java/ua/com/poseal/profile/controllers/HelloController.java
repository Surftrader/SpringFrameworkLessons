package ua.com.poseal.profile.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ua.com.poseal.profile.services.HelloService;

@Component
public class HelloController {
    private final HelloService helloService;

    @Autowired
    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    public void sayHello() {
        System.out.println(helloService.getGreeting());
    }
}
