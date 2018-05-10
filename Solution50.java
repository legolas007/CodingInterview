package com.usher.algorithm.offer;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @Author: Usher
 * @Description:
 */
public class Solution50 {
    public int FirstNotRepeatingChar(String str) {

        Map<Character,Integer> map = new LinkedHashMap<>();

        for (int i =0;i < str.length();i++){
            if (map.containsKey(str.charAt(i))){
                int tmp = map.get(str.charAt(i));
                map.put(str.charAt(i),tmp+1);
            }else {
                map.put(str.charAt(i), 1);
            }
        }

        for (int i =0;i < str.length();i++){
            char c = str.charAt(i);
            if (map.get(c) == 1)
                return i;
        }

        return -1;
    }
}
