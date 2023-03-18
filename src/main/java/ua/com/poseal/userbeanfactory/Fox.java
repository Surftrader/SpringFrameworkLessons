package ua.com.poseal.userbeanfactory;

import ua.com.poseal.userbeanfactory.annotation.CustomComponent;

@CustomComponent
public class Fox implements Animal{
    private String name;
    private int id;

    public Fox() {}

    public Fox(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Fox{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }
}
