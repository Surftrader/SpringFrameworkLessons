package ua.com.poseal.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import ua.com.poseal.profile.controllers.HelloController;

@Configuration
@ComponentScan
public class ProfileTest {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.getEnvironment().setActiveProfiles(); // default will work OR -> ctx.getEnvironment().setActiveProfiles("span);
        ctx.register(ProfileTest.class);
        ctx.refresh();

        HelloController controller = (HelloController) ctx.getBean("helloController");
        controller.sayHello();
    }
}
