package Zachet;

import java.util.*;
import java.util.stream.Collectors;


public class another {


    public static void main(String[] args) {
//        short[] b = {0,1,2, 3, 4, 5, 6, 7};
//        Set<Integer> set = new HashSet<>();
//        for(int i = 0; i<b.length; i++) {
//            if (b[i] < 10) {
//                int x =
//                set.add(b[i]);
//            }

        List<Short> numbers = new ArrayList<>();
        for (int i = 0; i < 25; i++){
            numbers.add((short) i);
        }
        Set<Integer> num = numbers.stream()
                .filter(x->x>10).sorted().collect(Collectors.toList())


        }
    }


