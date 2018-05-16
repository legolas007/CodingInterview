package com.usher.algorithm.offer;

import java.util.Arrays;

/**
 * @Author: Usher
 * @Description:
 *
 * Input: [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Not 7-1 = 6, as selling price needs to be larger than buying price.

 -6 4 -2 3 -2
    连续数组的最大值
 */
public class Solution63 {
    public int maxProfit(int[] prices) {
        if (prices == null)
            return 0;
        int[] nums = new int[prices.length+1];

        for (int i = 0;i < prices.length-1;i++)
            nums[i] = prices[i+1] - prices[i];

        return maxSumArray(nums);
    }

    public int maxSumArray(int[] nums) {
        int[] f = new int[nums.length];
        f[0] = nums[0];
        for (int i = 1;i < nums.length;i++){
            //f[i] = f[i-1] > 0 ? nums[i] + f[i-1] : nums[i];
            f[i] = Math.max( nums[i] + f[i-1] , nums[i]);
        }
        Arrays.sort(f);
        return f[nums.length-1];
    }
}
