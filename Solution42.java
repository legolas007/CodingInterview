package com.usher.algorithm.offer;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @Author: Usher
 * @Description:
 */
public class Solution42 {
    /**
     * dp[i] = dp[i-1] > 0 ? dp[i-1] + array[i] : array[i]
     * @param array
     * @return
     */
    public int FindGreatestSumOfSubArray(int[] array) {
        int[] dp = new int[array.length];

        dp[0] = array[0];
        for (int i =1;i < array.length;i++){
            dp[i] = dp[i-1] > 0 ? dp[i-1] + array[i] : array[i];
        }
        Arrays.sort(dp);
        return dp[array.length-1];
    }
}
