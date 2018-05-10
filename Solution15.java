package com.usher.algorithm.offer;

/**
 * @Author: Usher
 * @Description:
 * 二进制1的个数
 *
 */
public class Solution15 {
    public int NumberBitCount(int n){
        int count = 0;
        while (n!=0){
            ++count;
            n = (n-1) & n;
        }
        return count;
        //return Integer.bitCount(n);
    }
}
