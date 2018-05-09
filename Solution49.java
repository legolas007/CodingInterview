package com.usher.algorithm.offer;

/**
 * @Author: Usher
 * @Description:
 * 丑数（只包含因子2,3,5的数）：如果一个数能被2整除，就连续除以2，
 * 如果能被3整除就连续除以3，如果能被5整除就连续除以5，如果最后得到的是1，这个数 就是丑数
 *
 */
public class Solution49 {
    public int GetUglyNumber_Solution(int index) {

        if (index <= 6)
            return index;

        //三个下标用于记录丑数的位置
        int i2 = 0, i3 = 0, i5 = 0;
        int[] f = new int[index];

        //第一个丑数1
        f[0] = 1;

        for (int i =1;i < index;i++){

            //三个数都是可能的丑数，取最小的放进丑数数组里面
            int n2 = f[i2] * 2,n3 = f[i3] * 3,n5 = f[i5] * 5;
            f[i] = Math.min(n2,Math.min(n3,n5));

            if (f[i] == n2)
                i2++;

            if (f[i] == n3)
                i3++;

            if (f[i] == n5)
                i5++;

        }

        return f[index-1];
    }
}
