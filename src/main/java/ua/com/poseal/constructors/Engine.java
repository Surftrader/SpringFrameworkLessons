package ua.com.poseal.constructors;

import org.springframework.stereotype.Component;

@Component
public class Engine {
    private String name = "BMW";

//    public Engine(String name) {
//        this.name = name;
//    }

    @Override
    public String toString() {
        return "Engine{" +
                "name='" + name + '\'' +
                '}';
    }
}
