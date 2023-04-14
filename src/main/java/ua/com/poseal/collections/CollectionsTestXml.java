package ua.com.poseal.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CollectionsTestXml {
    private Map<String, Object> map;
    private Properties props;
    private Set<String> set;
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

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public Properties getProps() {
        return props;
    }

    public void setProps(Properties props) {
        this.props = props;
    }

    public Set<String> getSet() {
        return set;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }
}
