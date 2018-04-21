package com.usher.algorithm.offer;

import java.util.Vector;

/**
 * @Author: Usher
 * @Description:
 * 剪绳子
 */
public class Solution14 {
    //贪婪，n >= 5时，尽可能多剪长度为3的绳子，
    // 当剩下的绳子长度为4时，把绳子剪成长度为2的绳子
    public int maxProductAfterCutting(int n){
        if (n < 2)
            return 0;
        if (n == 2)
            return 1;
        if (n == 3)
            return 2;
        //尽可能减去长度为3的绳子段
        int timesOf3 = n / 3;
        //当绳子最后长度为4的时候
        //把绳子剪成长度为2的两段，2*2 > 3*1
        if (n - timesOf3 * 3 == 1){
            timesOf3 -= 1;
        }
        int timesOf2 = (n - timesOf3 * 3)/2;
        return (int)(Math.pow(3,timesOf3) * (int)Math.pow(2,timesOf2));
    }
    //动态规划
    public int maxProductAfterCutting2(int n){
        int[] dp = new int[n+1];
        dp[1] = 1;
        for (int i=2;i <= n;i++){
            for (int j = 1;j < i;j++){
                dp[i] = Math.max(dp[i],Math.max(j * (i-j),dp[j] * (i-j)));
            }
        }

        return dp[n];
    }
}
