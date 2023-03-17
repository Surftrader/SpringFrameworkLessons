package ua.com.poseal.penetration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/penetration_context.xml");
        Car car = context.getBean("car", Car.class);
        System.out.println(car.getModel());
        System.out.println(car.getAge());
        System.out.println(car.getModelDevice());
    }
}
