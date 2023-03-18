package ua.com.poseal.userbeanfactory;

import ua.com.poseal.userbeanfactory.annotation.CustomComponent;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

public class CustomBeanFactory {
    private static Map<String, Object> beansPool = new HashMap<>();

    public CustomBeanFactory(String basePackage) {
        /* 1 Variant */
//        String path = "/Users/.../SpringFramework/SpringFrameworkLessons/src/main/java/ua/com/poseal/userbeanfactory";
//        File dir = new File(path);
//        for (String s: dir.list(new FilenameFilter() {
//            @Override
//            public boolean accept(File dir, String name) {
//                return name.toLowerCase().endsWith("java");
//            }
//        })) {
//            System.out.println(s);
//        }
        /* 2 Variant */
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        try {
            Enumeration<URL> resources = classLoader.getResources(basePackage.replace('.', '/'));
            while (resources.hasMoreElements()) {
                File dir = new File(resources.nextElement().toURI());
                for (File f : dir.listFiles()) {
                    if (f.getName().endsWith("class")) {
                        String fileName = f.getName().substring(0, f.getName().lastIndexOf("."));
                        Class classOdj = Class.forName(basePackage + "." + fileName);
                        if (classOdj.isAnnotationPresent(CustomComponent.class)) {
                            Object obj = classOdj.newInstance();
                            beansPool.put(fileName.toLowerCase(), obj);
                        }
                    }
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public Object getBean(String beanName) {
        return beansPool.get(beanName.toLowerCase());
    }
}
