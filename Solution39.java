package com.usher.algorithm.offer;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Usher
 * @Description:
 * 数组中数字出现次数超过数组长度一半
 * 中位数n/2
 */
public class Solution39 {
    public int MoreThanHalfNum_Solution(int [] array) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i =0;i < array.length;i++){
            Integer tmp = map.get(array[i]);
            if (tmp == null){
                map.put(array[i],1);
                tmp = 1;
            }else {
                map.put(array[i],tmp+1);
            }
            if (tmp+1 > array.length/2)
                return array[i];
        }
        return 0;
    }
}
