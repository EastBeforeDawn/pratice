package source.map.jdk7.test;

import source.map.jdk7.Jdk7HashMap;
import source.map.jdk7.Jdk7Map;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        int ssize = 1;
        while (ssize < 17) {
            ssize <<= 1;
        }
        System.out.println(ssize);

    }
}
