package ua.com.poseal.init;

import org.springframework.beans.factory.BeanCreationException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

//        GenericXmlApplicationContext ctx1 = new GenericXmlApplicationContext("spring/init_1_app.xml");
//        SimpleBean simpleBean1 = getBean("simpleBean1", ctx1);
//        SimpleBean simpleBean2 = getBean("simpleBean2", ctx1);
//        SimpleBean simpleBean3 = getBean("simpleBean3", ctx1);

//      OR

//        GenericXmlApplicationContext ctx2 = new GenericXmlApplicationContext("spring/init_2_app.xml");
//        // public class SimpleBeanWithInterface implements InitializingBean
//        SimpleBeanWithInterface simpleBeanWithInterface1 = getBeanWithInterface("simpleBean1", ctx2);
//        SimpleBeanWithInterface simpleBeanWithInterface2 = getBeanWithInterface("simpleBean2", ctx2);
//        SimpleBeanWithInterface simpleBeanWithInterface3 = getBeanWithInterface("simpleBean3", ctx2);

//        GenericXmlApplicationContext ctx3 = new GenericXmlApplicationContext("spring/init_1_app.xml");
//        SimpleBean simpleBean1 = getBean("simpleBean1", ctx3);
//        SimpleBean simpleBean2 = getBean("simpleBean2", ctx3);
//        SimpleBean simpleBean3 = getBean("simpleBean3", ctx3);


        GenericXmlApplicationContext ctx4 = new GenericXmlApplicationContext("spring/init_2_app.xml");
        // public class SimpleBeanWithInterface implements InitializingBean, DisposableBean
        SimpleBeanWithInterface simpleBeanWithInterface1 = getBeanWithInterface("simpleBean1", ctx4);
        SimpleBeanWithInterface simpleBeanWithInterface2 = getBeanWithInterface("simpleBean2", ctx4);
        SimpleBeanWithInterface simpleBeanWithInterface3 = getBeanWithInterface("simpleBean3", ctx4);
        ctx4.removeBeanDefinition("simpleBean1");
        ctx4.removeBeanDefinition("simpleBean2");
        ctx4.removeBeanDefinition("simpleBean3");
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

    private static SimpleBeanWithInterface getBeanWithInterface(String beanName, ApplicationContext ctx) {
        try {
            SimpleBeanWithInterface bean = (SimpleBeanWithInterface) ctx.getBean(beanName);
            System.out.println(bean);
            return bean;
        } catch (BeanCreationException ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }
}
