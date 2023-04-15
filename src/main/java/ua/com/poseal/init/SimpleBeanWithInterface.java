package ua.com.poseal.init;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class SimpleBeanWithInterface implements InitializingBean, DisposableBean {
    private static final String DEFAULT_NAME = "Luke";
    private String name;
    private int age = Integer.MIN_VALUE;

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Initialization bean");
        if (name == null) {
            System.out.println("Using default name");
            name = DEFAULT_NAME;
        }
        if (age == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("You must set age properties!!!" + SimpleBeanWithInterface.class);
        }
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Spring Bean Post Contract After Properties Set Method ");
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "SimpleBeanWithInterface{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
