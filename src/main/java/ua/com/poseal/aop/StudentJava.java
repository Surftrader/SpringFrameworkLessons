package ua.com.poseal.aop;

import org.springframework.stereotype.Component;

@Component
public class StudentJava {
    public void getMessage() {
        // Add some logic
        System.out.println("Hello. I'm a StudentJava");
    }

    public String getName() {
        return "Max";
    }
}
