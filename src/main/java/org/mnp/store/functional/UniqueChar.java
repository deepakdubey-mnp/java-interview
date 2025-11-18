package org.mnp.store.functional;

import java.util.LinkedHashMap;
import java.util.stream.Collectors;

public class UniqueChar {
    public static void main(String[] args) {
        uniqueChar("abcdacb");
    }
    /*
    Find first unique Character and print that
        ex: abcd ->a
        abcda ->b
        ababcab =>c
        Provide the code using java 8 Lambda syntax and stream api
     */

    public  static void uniqueChar(String input) {
        LinkedHashMap<String,Integer>collects=input.chars().mapToObj(ch-> String.valueOf((char)ch))
                .collect(Collectors.toMap(
                        s->s,
                        s->1,
                        Integer::sum,
                        LinkedHashMap::new
                ));
        collects.entrySet().stream().filter(stringIntegerEntry -> stringIntegerEntry.getValue()==1).limit(1)
                .forEach(stringIntegerEntry -> System.out.println(stringIntegerEntry.getKey()));
    }
    // Find the least
}
