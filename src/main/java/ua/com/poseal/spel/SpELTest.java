package ua.com.poseal.spel;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration
@ComponentScan
public class SpELTest {
    public static void main(String[] args) {
//        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring/spel.xml");

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.getEnvironment().setActiveProfiles();
        ctx.register(ua.com.poseal.spel.SpELTest.class);
        ctx.refresh();

        InjectSpEL injectSpEL = (InjectSpEL) ctx.getBean("injectSpEL");
        System.out.println(injectSpEL); // InjectSpEL{name='Bob', age=20, programmer='No'}
    }
}
