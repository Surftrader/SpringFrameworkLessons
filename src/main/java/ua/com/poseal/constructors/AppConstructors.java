package ua.com.poseal.constructors;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppConstructors {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/constructor.xml");
        Motorbike motorbike = context.getBean(Motorbike.class);
        System.out.println(motorbike);
    }
}
