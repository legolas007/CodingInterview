package com.usher.algorithm.offer;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author: Usher
 * @Description:
 * “student. a am I”
 * “I am a student.”
 */
public class Solution58_1 {
    public String ReverseSentence(String str) {
        if (str.length() <= 0 || str.trim().equals(""))
            return str;
        StringBuffer stringBuffer = new StringBuffer();

        String[] strings = str.split(" ");

        for (int i =strings.length-1;i >=0;i--){
            if (i!=0){
                stringBuffer.append(strings[i] + " ");
            }else {
                stringBuffer.append(strings[i]);
            }
        }
        return stringBuffer.toString();
    }
}
