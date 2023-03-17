package ua.com.poseal.penetration;

public class IPadDevice implements Device{
    private String model;

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String getModelDevice() {
        return model;
    }
}
