package ua.com.poseal.beanfactory;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class BeanTest {
    public static void main(String[] args) {
        BeanFactory factory = new XmlBeanFactory(new ClassPathResource("spring/config_bean.xml"));
        HelloBean helloBean = (HelloBean)factory.getBean("helloBean");
        helloBean.sayHello();
    }
}
