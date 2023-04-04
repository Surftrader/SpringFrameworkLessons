package ua.com.poseal.profile.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile({"default", "eng"})
public class HelloServiceEnglishImpl implements HelloService {
    @Override
    public String getGreeting() {
        return "Hello";
    }
}
