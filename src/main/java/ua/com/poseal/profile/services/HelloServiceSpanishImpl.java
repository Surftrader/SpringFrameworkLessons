package ua.com.poseal.profile.services;

import org.springframework.stereotype.Component;

//@Component
//@Profile("span")
public class HelloServiceSpanishImpl implements HelloService {
    @Override
    public String getGreeting() {
        return "Hola";
    }
}
