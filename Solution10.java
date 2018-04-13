package com.usher.algorithm.offer;

/**
 * 斐波那契数列
 */
public class Solution10 {
    public int Fibonacci(int n){
        if (n == 0){
            return 0;
        }else if (n == 1){
            return 1;
        }else {
            return Fibonacci(n-1) + Fibonacci(n-2);
        }
    }
}
