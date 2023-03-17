package ua.com.poseal.penetration;

public class CarTesla implements Car {
    private String model;
    private int age;
    private Device device;

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

    @Override
    public String getModelDevice() {
        return device.getModelDevice();
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDevice(Device device) {
        this.device = device;
    }
}
