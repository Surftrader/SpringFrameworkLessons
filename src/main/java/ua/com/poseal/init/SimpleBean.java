package ua.com.poseal.init;

public class SimpleBean {
    private static final String DEFAULT_NAME = "Luke";
    private String name;
    private int age = Integer.MIN_VALUE;

    public void init() {
        System.out.println("Initialization bean");
        if (name == null) {
            System.out.println("Using default name");
            name = DEFAULT_NAME;
        }
        if (age == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("You must set age properties!!!" + SimpleBean.class);
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "SimpleBean{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
