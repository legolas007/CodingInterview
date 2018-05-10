package com.usher.algorithm.offer;

/**
 * @Author: Usher
 * @Description:
 */
public class Solution10_2 {
    public int JumpFloor(int target) {
        if(target <= 1)
            return 1;
        int[] f = new int[target+1];
        f[0] = 1;
        f[1] =1;
        for(int i =2;i <= target;i++){
            f[i] = f[i-1] + f[i-2];
        }
        return f[target];
    }
}
