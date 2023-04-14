package ua.com.poseal.collections;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
//        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
//        ctx.load("spring/app_context_xml.xml");
//        ctx.refresh();
//    OR
//        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("spring/app_context_xml.xml");
//
//        CollectionsTestXml instance = (CollectionsTestXml) ctx.getBean("collectionsTest");
//        instance.displayInfo();

        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("spring/app_context_annotation.xml");
        CollectionsTestAnnotation instance = (CollectionsTestAnnotation) ctx.getBean("injectCollectionsTestAnnotation");
        instance.displayInfo();
    }
}
