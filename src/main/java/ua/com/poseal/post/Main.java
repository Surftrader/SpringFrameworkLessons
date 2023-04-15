package ua.com.poseal.post;

import org.springframework.beans.factory.BeanCreationException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        GenericXmlApplicationContext ctx3 = new GenericXmlApplicationContext("spring/post_contruct_pre_destroy_app.xml");
        SimpleBean simpleBean1 = getBean("simpleBean1", ctx3);
        SimpleBean simpleBean2 = getBean("simpleBean2", ctx3);
        SimpleBean simpleBean3 = getBean("simpleBean3", ctx3);

        ctx3.removeBeanDefinition("simpleBean1");
        ctx3.removeBeanDefinition("simpleBean2");
        ctx3.removeBeanDefinition("simpleBean3");
    }
    private static SimpleBean getBean(String beanName, ApplicationContext ctx) {
        try {
            SimpleBean bean = (SimpleBean) ctx.getBean(beanName);
            System.out.println(bean);
            return bean;
        } catch (BeanCreationException ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }
}
