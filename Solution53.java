package com.usher.algorithm.offer;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Usher
 * @Description:
 */
public class Solution53 {
    public int GetNumberOfK(int [] array , int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int v : array){

            if (map.containsKey(v)){
                int tmp = map.get(v);
                map.put(v,tmp+1);
            }
            else
                map.put(v,1);
        }
        if (map.containsKey(k))
            return map.get(k);
        return 0;
    }
}
