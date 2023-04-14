package ua.com.poseal.beans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppBeans {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
//        ctx.register(SpringConfig.class);
//        ctx.refresh();

//        User user = ctx.getBean(User.class);
//        User user = (User)ctx.getBean("getUser"); // @Bean public User getUser()
//        User user = (User)ctx.getBean("user"); // @Bean(name = "user") public User getUser()
        User user = (User)ctx.getBean("user", "Pavel", 15); // @Bean(name = "user") @Lazy public User getUser(String name, int age)
        System.out.println(user);
    }
}
