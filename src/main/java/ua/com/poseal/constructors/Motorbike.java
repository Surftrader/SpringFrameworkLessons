package ua.com.poseal.constructors;

public class Motorbike {
    private String model;
    private Engine engine;
    private Transmission transmission;

    public Motorbike(String model, Engine engine, Transmission transmission) {
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
