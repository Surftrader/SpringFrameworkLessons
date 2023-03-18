package ua.com.poseal.constructors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Motorbike {
    private String model;
    @Autowired
    private Engine engine;
    @Autowired
    private Transmission transmission;
//    @Autowired
//    public Motorbike(String model, Engine engine, Transmission transmission) {
//        this.model = model;
//        this.engine = engine;
//        this.transmission = transmission;
//    }

    @Override
    public String toString() {
        return "Motorbike{" +
                "model='" + model + '\'' +
                ", engine=" + engine +
                ", transmission=" + transmission +
                '}';
    }
}
