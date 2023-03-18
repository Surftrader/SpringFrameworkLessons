package ua.com.poseal.userbeanfactory;

public class AppTest {
    public static void main(String[] args) {
        CustomBeanFactory factory = new CustomBeanFactory("ua.com.poseal.userbeanfactory");
        Animal animal = (Fox) factory.getBean("Fox");
        animal.setName("fox");
        animal.setId(1);
        System.out.println(animal);
    }
}
