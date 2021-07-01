package source.map.jdk7.test;

import source.map.jdk7.Jdk7HashMap;
import source.map.jdk7.Jdk7Map;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Jdk7Map<String,String> map = new Jdk7HashMap<>();
        map.put("1","1");
        System.out.println(map.get("1"));

    }
}
