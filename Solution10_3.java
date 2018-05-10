package com.usher.algorithm.offer;

/**
 * @Author: Usher
 * @Description:
 * 可以推出这是一个首项是1，公比为2的等比数列
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 *
 */
public class Solution10_3 {
    public int JumpFloorII(int target) {
        if(target <= 1)
            return 1;
        return JumpFloorII(target-1) << 1;
    }
}
