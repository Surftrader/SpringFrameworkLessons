package ua.com.poseal.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class AOPTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext acat = new AnnotationConfigApplicationContext(AOPTest.class);

        StudentJava studentJava = acat.getBean("studentJava", StudentJava.class);
        studentJava.getMessage();
        studentJava.getName();
    }
}
