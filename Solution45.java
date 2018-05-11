package com.usher.algorithm.offer;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

/**
 * @Author: Usher
 * @Description:
先将整型数组转换成String数组，然后将String数组排序，最后将排好序的字符串数组拼接出来。关键就是制定排序规则。
 * 排序规则如下：
 * 若ab > ba 则 a > b，
 * 若ab < ba 则 a < b，
 * 若ab = ba 则 a = b；
 * 解释说明：
 * 比如 "3" < "31"但是 "331" > "313"，所以要将二者拼接起来进行比较
 */
public class Solution45 {
    public String PrintMinNumber(int [] numbers) {
        int len = numbers.length;
        StringBuffer stringBuffer = new StringBuffer();
        //String[]字符串数组
        String[] strings = new String[len];
        for(int i=0;i<len;i++){
            strings[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String s1 = o1 + o2;
                String s2 = o2+o1;
                return s1.compareTo(s2);
            }
        });
        for (int i=0;i<len;i++){
            stringBuffer.append(strings[i]);
        }
        return stringBuffer.toString();
    }
}
