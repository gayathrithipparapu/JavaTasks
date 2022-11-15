package com.netcrcker;

import java.util.HashMap;
import java.util.Map;

public class Task5 {
    static void charCount(String inputString)
    {
        // Creating a HashMap containing char
        HashMap<Character, Integer> map
                = new HashMap<Character, Integer>();

        // Converting given string to char array

        char[] strArray = inputString.toCharArray();

        // checking each char
        for (char c : strArray) {
            if (map.containsKey(c)) {

                /* If char is present in charCountMap,
                incrementing count by 1*/
                map.put(c, map.get(c) + 1);
            }
            else {

                /*If char is not present in charCountMap,
                putting this char to charCountMap with 1 as it's value*/
                map.put(c, 1);
            }
        }

        // Printing the map
        for (Map.Entry entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

}
