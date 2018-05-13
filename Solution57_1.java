package com.usher.algorithm.offer;

import java.util.ArrayList;

/**
 * @Author: Usher
 * @Description:
 * s最小值，b最大值，先把s初始化为1，b初始化为2，如果s到b的序列的和大于s，则可以从序列中去掉较小的值，也就是增大small的值。
 * 否则增大b的值，一直增加s到（1+s)/2为止
 */
public class Solution57_1 {
    ArrayList<ArrayList<Integer>> ret = new ArrayList<>();
    public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {

        if (sum < 3)
            return new ArrayList<>(sum);

        int s = 1;
        int b = 2;
        int mid = (1+sum)>>1;

        int curSum = s + b;


        while (s < mid){
            ArrayList<Integer> list = new ArrayList<>();
            if (curSum == sum)
                ret.add(printSequence(s,b,list));

            while (curSum > sum && s < mid){
                curSum -= s;
                s++;

                if (curSum == sum)
                    ret.add(printSequence(s,b,list));
            }
            b++;
            curSum += b;
        }
        return ret;
    }
    private ArrayList<Integer> printSequence(int s,int b,ArrayList<Integer> list){
        for(int i =s;i <= b;i++)
            list.add(i);
        return list;
    }
}
