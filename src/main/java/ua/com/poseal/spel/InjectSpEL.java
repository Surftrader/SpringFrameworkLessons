package ua.com.poseal.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("injectSpEL")
public class InjectSpEL {

    @Value("#{injectConfig.name}")
    private String name;

    @Value("#{injectConfig.age+10}")
    private int age;

    @Value("#{injectConfig.programmer==true ? 'Yes' : 'No'}")
    private String programmer;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setProgrammer(String programmer) {
        this.programmer = programmer;
    }

    @Override
    public String toString() {
        return "InjectSpEL{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", programmer='" + programmer + '\'' +
                '}';
    }
}
