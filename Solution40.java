package com.usher.algorithm.offer;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/**
 * @Author: Usher
 * @Description:
 * 最小的K个数
 * O(nlogn)
 * 快速排序
 *
 * O(nlogK) + O(K)
 * 大小为K的最小堆
 * 应该使用大顶堆来维护最小堆，
 * 而不能直接创建一个小顶堆并设置一个大小，企图让小顶堆中的元素都是最小元素。
维护一个大小为 K 的最小堆过程如下：在添加一个元素之后，
如果大顶堆的大小大于 K，那么需要将大顶堆的堆顶元素去除。

 维护一个容量为K的有序优先队列，每次从数组中取出一个数，加入优先队列，然后删除

 */
public class Solution40 {
    public void quick_sort(int[] input,int l,int r){

        if(l>=r)
            return;
        int i=l,j=r;
        int tmp=input[i];
        while (i < j){
            while (i < j && input[j] >= tmp)// 从右向左找小于x的数来填a[i]
                --j;
            input[i] = input[j];
            while (i < j && input[i] <= tmp)//将a[j]填到a[i]中，a[j]就形成了一个新的坑
                ++i;
            input[j] = input[i];//将a[i]填到a[j]中，a[i]就形成了一个新的坑
        }
        input[i] = tmp;//退出时，i等于j。将x填到这个坑中
        quick_sort(input,l,i-1);
        quick_sort(input,j+1,r);
    }
    public ArrayList<Integer> GetLeastNumbers_Solution(int[] input,int k){
        /*
        //快速排序
        ArrayList<Integer> list = new ArrayList<>();
        quick_sort(input,0,input.length-1);
        for (int i=0;i < k;i++){
            list.add(input[i]);
        }
        return list;
        */
        if (k > input.length || k <= 0)
            return new ArrayList<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((o1,o2) -> o2-o1);
        for(int num : input){
            maxHeap.add(num);
            if (maxHeap.size() > k){
                maxHeap.poll();
            }
        }
        ArrayList<Integer> res = new ArrayList<>(maxHeap);
        return res;
    }
}
