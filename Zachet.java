package Zachet;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Zachet {
    public static void main(String[] args) {
        List<String> list = List.of("Africa", "Europe", "Asia", "Antarctic");
        Map<Integer, List<String>> map = new HashMap<>();

        map.put(7, list.stream().filter(x->x.length()==7).findFirst().orElse(null));
        map.put(6, list.stream().filter(x->x.length()==6).findFirst().orElse(null));
        map.put(4, list.stream().filter(x->x.length()==4).findFirst().orElse(null));
        map.put(9, list.stream().filter(x->x.length()==9).findFirst().orElse(null));



        map.forEach((key, value) -> System.out.println(key + " " + value));
    }
}