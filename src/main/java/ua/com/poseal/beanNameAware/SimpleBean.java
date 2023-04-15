package ua.com.poseal.beanNameAware;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.support.GenericXmlApplicationContext;

public class SimpleBean implements BeanNameAware, InitializingBean {
    private String beanName;

    @Override
    public void setBeanName(String s) {
        this.beanName = s;
        System.out.println("Setting BeanName...");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Initializing...");
    }

    public String getBeanName() {
        return beanName;
    }

    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("spring/bean_setting.xml");
        ctx.refresh();

        SimpleBean bean = ctx.getBean("simpleBean", SimpleBean.class);
        System.out.println(bean.getBeanName());
    }
}
