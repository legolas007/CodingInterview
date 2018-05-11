package com.usher.algorithm.offer;

/**
 * @Author: Usher
 * @Description:
 */
public class Solution67 {
    public int StrToInt(String str) {
        if (str.length() == 0 || str.length() == 1 && str.charAt(0) == '+'|| str.length() == 1 && str.charAt(0) == '-')
            return 0;

        for (int i =0;i < str.length();i++){
            if (str.charAt(0) == '+' || str.charAt(0) == '-')
                continue;
            else if (str.charAt(i)>'9' || str.charAt(i) < '0' ){
                return 0;
            }
        }
        return Integer.valueOf(str);
    }
}
