package ua.com.poseal.profile.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:application.properties")
//@Profile({"default", "eng"})
public class HelloServiceEnglishImpl implements HelloService {
    @Value("${greeting}")
    private String greeting;
    @Override
    public String getGreeting() {
        return greeting;
    }
}
