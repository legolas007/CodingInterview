package com.usher.algorithm.offer;

/**
 * @Author: Usher
 * @Description:
 *
 * 调整数组顺序使奇数位于偶数前面
 */
public class Solution21 {
    /**
     * @param array
     */
    public void reOrderArray(int [] array) {
        int oddCount = 0;
        for(int val : array){
            if (val % 2 == 1)
                oddCount++;
        }
        int[] copy = array.clone();
        int i = 0,j = oddCount;
        for (int num : copy){
            if (num % 2 == 1)
                array[i++] = num;
            else
                array[j++] = num;
        }
    }
}
