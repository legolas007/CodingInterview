package com.usher.algorithm.offer;

/**
 * @Author: Usher
 * @Description:
 */
public class Solution20 {
    public boolean isNumeric(char[] str) {
        return new String(str).matches("[+-]?\\d*(\\.\\d+)?([eE][+-]?\\d+)?");
    }
}


