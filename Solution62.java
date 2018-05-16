package com.usher.algorithm.offer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Usher
 * @Description:
 * 约瑟夫环
 * f(n,m)={0,n=1},{[f(n-1,m)+m]%n,n>1}
 */
public class Solution62 {
/*    public int LastRemaining_Solution(int n, int m) {
        if (n < 1|| m < 1)
            return -1;

        if (n ==1 )
            return 0;
        return (LastRemaining_Solution(n-1,m) + m) % n;
    }*/

    /**
     * 模拟循环链表
     * @param n
     * @param m
     * @return
     */
    public int LastRemaining_Solution(int n, int m) {
        if (n < 1|| m < 1)
            return -1;

        if (n ==1 )
            return 0;

        List<Integer> list = new ArrayList<>();

        for (int i = 0;i < n;i++)
            list.add(i);

        int index = -1;
        while (list.size() > 1){
            index = (index + m) %list.size();
            list.remove(index);
            index--;
        }
        return list.get(0);
    }
}
