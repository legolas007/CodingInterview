package com.usher.algorithm.offer;

import java.util.Arrays;

/**
 * @Author: Usher
 * @Description:
 * 统计0的个数，相邻间隔要小于0的个数，即可
 */
public class Solution61 {
    public boolean isContinuous(int[] nums) {
        if (nums.length < 5)
            return false;

        Arrays.sort(nums);
        int cnt = 0;

        for (int num : nums){
            if (num == 0)
                cnt++;
        }

        int numGap = 0;
        for (int i = cnt;i < nums.length-1;i++){
            numGap += nums[i+1] - nums[i]-1;
        }
        if (numGap <= cnt && numGap >= 0)
            return true;
        return false;
    }
}
