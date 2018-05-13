package com.usher.algorithm.offer;

import java.util.ArrayList;
import java.util.PriorityQueue;

/**
 * @Author: Usher
 * @Description:
 */
public class Solution59 {
    public ArrayList<Integer> maxInWindows(int [] num, int size)
    {
        /*//常规
        if (size == 0)
            return new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i =0;i < num.length-size;i++){
            int tmp = num[i];
            for (int j = i;j < i+size;j++){
               if (tmp < num[j]){
                   tmp = num[j];
               }
            }
            list.add(tmp);
        }
        return list;*/

        //优先队列
        ArrayList<Integer> list = new ArrayList<>();
        PriorityQueue<Integer> heap = new PriorityQueue<>(((o1, o2) -> o2-o1));

        if (size > num.length || size < 1)
            return list;

        for (int i = 0; i < size; i++)
            heap.add(num[i]);

        list.add(heap.peek());
        for (int i = 1, j = i + size - 1; j < num.length; i++, j++) {
            heap.remove(num[i - 1]);
            heap.add(num[j]);
            list.add(heap.peek());
        }
        return list;
    }
}
