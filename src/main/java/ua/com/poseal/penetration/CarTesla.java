package ua.com.poseal.penetration;

public class CarTesla implements Car {
    private String model;
    private int age;

    @Override
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model.toLowerCase().equals("x11")) {
            this.model = "Model X";
        } else {
            this.model = model;
        }
    }

    @Override
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
