package com.usher.algorithm.offer;

/**
 * @Author: Usher
 * @Description:
 * 左旋转字符串
 */
public class Solution58_2 {
    public String LeftRotateString(String str,int n) {

        if (str.length() == 0)
            return "";
        String s1 = str.substring(0,n);
        String s2 = str.substring(n);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(s2);
        stringBuffer.append(s1);
        return stringBuffer.toString();
    }
}
