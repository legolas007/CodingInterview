package com.usher.algorithm.offer;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @Author: Usher
 * @Description:
 * 和为s的两个数
 *
 * 使用双指针，一个指针指向元素较小的值，一个指针指向元素较大的值。指向较小元素的指针从头向尾遍历，指向较大元素的指针从尾向头遍历。

如果两个指针指向元素的和 sum == target，那么得到要求的结果；
如果 sum > target，移动较大的元素，使 sum 变小一些；
如果 sum < target，移动较小的元素，使 sum 变大一些。
 */
public class Solution57_2 {
    public ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {
        int i = 0,j = array.length-1;

        while (i < j){
            int cur = array[i] + array[j];
            if (cur == sum){
                return new ArrayList<>(Arrays.asList(array[i],array[j]));
            }
            if (cur > sum)
                j--;
            else
                i++;
        }
        return new ArrayList<>();
    }
}
