package ua.com.poseal.collections;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

@Component("injectCollectionsTestAnnotation")
public class CollectionsTestAnnotation {
    @Value("#{map}")
    private Map<String, Object> map;
    @Value("#{props}")
    private Properties props;
    @Value("#{set}")
    private Set<String> set;
    @Value("#{list}")
    private List<String> list;

    public void displayInfo() {
        System.out.println("Map content:");
        map.forEach((key, value) -> System.out.println("Key: " + key + " - Value: " + value));
        System.out.println("--------------------------------");

        System.out.println("Property content:");
        props.forEach((key, value) -> System.out.println("Key: " + key + " - Value: " + value));
        System.out.println("--------------------------------");

        System.out.println("Set content:");
        set.forEach(value -> System.out.println("Value: " + value));
        System.out.println("--------------------------------");

        System.out.println("List content:");
        list.forEach(value -> System.out.println("Value: " + value));
        System.out.println("--------------------------------");
    }
}
