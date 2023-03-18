package ua.com.poseal.constructors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Engine {
    private String name;

    // Autowired over constructor
    @Autowired
    public Engine(@Value("${model.device1:some value}") String name) { // default value if property model.device1 is not found -> some value
        this.name = name;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "name='" + name + '\'' +
                '}';
    }
}
