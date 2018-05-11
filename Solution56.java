package com.usher.algorithm.offer;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @Author: Usher
 * @Description:
 */
public class Solution56 {
    //num1,num2分别为长度为1的数组。传出参数
//将num1[0],num2[0]设置为返回结果
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int v : array){

            if (map.containsKey(v)){
                int tmp = map.get(v);
                map.put(v,tmp+1);
            }
            else
                map.put(v,1);
        }
        int[] tmp = new int[2];
        int i = 0;
        for (Integer key : map.keySet()){
            if (map.get(key) == 1){
                tmp[i++] = key;
            }
        }
        num1[0] = tmp[0];
        num2[0] = tmp[1];

    }
}
