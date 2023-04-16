package ua.com.poseal.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@ComponentScan
@EnableAspectJAutoProxy
public class AOPTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext acat = new AnnotationConfigApplicationContext(AOPTest.class);

        StudentJava studentJava = acat.getBean("studentJava", StudentJava.class);
        studentJava.getMessage();
        System.out.println("This is from main");
        System.out.println("student name: " + studentJava.getName());
        System.out.println("This is from main");

    }
}
