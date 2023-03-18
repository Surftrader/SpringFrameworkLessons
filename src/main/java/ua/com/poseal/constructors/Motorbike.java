package ua.com.poseal.constructors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("bike")
public class Motorbike {
    private String model;

    private EngineInterface engine;

    private Transmission transmission;

    @Autowired
    public Motorbike(
            @Value("BMW") String model,
            @Qualifier("engine") EngineInterface engine, // It takes bean 'engine' from class 'Engine'
            Transmission transmission) {
        this.model = model;
        this.engine = engine;
        this.transmission = transmission;
    }

    @Override
    public String toString() {
        return "Motorbike{" +
                "model='" + model + '\'' +
                ", engine=" + engine +
                ", transmission=" + transmission +
                '}';
    }
}
