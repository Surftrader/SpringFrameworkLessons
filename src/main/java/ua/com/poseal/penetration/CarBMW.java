package ua.com.poseal.penetration;

public class CarBMW implements Car {
    private String model;
    private int age;
    private Device device;

    @Override
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String getModelDevice() {
        return device.getModelDevice();
    }

    public void setDevice(Device device) {
        this.device = device;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
