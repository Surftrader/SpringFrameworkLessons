package ua.com.poseal.profile.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:application.properties")
//@Profile({"default", "eng"})
public class HelloServiceEnglishImpl implements HelloService {

    @Value("#{ new ua.com.poseal.profile.services.TestEL().getName() + ', ${greeting}' }") // Sergiy, Hello my friends
//    @Value("#{greeting}") // greeting -> SpEL Spring Expression Language
//    @Value("${greeting}") // Hello my friends
//    @Value("#{100+1}") // 101
//    @Value("#{'100'+'100'}") // 100100
    private String greeting;

    @Value("#{T (java.lang.Math).PI}") // 3.141592653589793
//    @Value("#{1+100}") // 101.0
    private double number;

    @Override
    public String getGreeting() {
        return String.valueOf(greeting);
    }
}
