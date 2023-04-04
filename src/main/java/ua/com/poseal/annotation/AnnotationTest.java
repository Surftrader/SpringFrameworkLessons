package ua.com.poseal.annotation;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class AnnotationTest {
    public static void main(String[] args) {
//        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/annotation.xml");

//        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
//        ctx.load("spring/annotation.xml");
//        ctx.refresh();

        ApplicationContext ctx = new AnnotationConfigApplicationContext(AnnotationTest.class);
        Rabbit rabbit = (Rabbit) ctx.getBean("rabbit");
        rabbit.sayHello();
    }
}
