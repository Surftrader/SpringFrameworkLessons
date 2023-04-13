package ua.com.poseal.spel;

import org.springframework.stereotype.Component;

@Component
public class InjectConfig {
    private String name = "Bob";
    private int age = 10;
    private boolean programmer = false;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isProgrammer() {
        return programmer;
    }

    public void setProgrammer(boolean programmer) {
        this.programmer = programmer;
    }
}
