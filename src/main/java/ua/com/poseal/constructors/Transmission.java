package ua.com.poseal.constructors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Transmission {
    private String name;

//    public Transmission(String name) {
//        this.name = name;
//    }

    // Autowired over setter
    @Autowired
    public void setName(@Value("${some.transmission:transmission}") String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Transmission{" +
                "name='" + name + '\'' +
                '}';
    }
}
