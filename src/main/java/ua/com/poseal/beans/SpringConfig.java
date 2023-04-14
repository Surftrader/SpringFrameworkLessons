package ua.com.poseal.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
public class SpringConfig {

    @Lazy(value = true)
    @Bean(name = "user")
    public User getUser(String name, int age) {
        User user = new User();
        user.setName(name);
        user.setAge(age);

        return user;
    }
}
