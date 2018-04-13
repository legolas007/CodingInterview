package com.usher.algorithm.offer;

import java.util.Stack;

/**
 * 两个栈实现队列
 */
public class Solution9 {
    Stack<Integer> in = new Stack<>();
    Stack<Integer> out = new Stack<>();

    public void push(int node){
        in.push(node);
    }

    /**
     * 当out不为空时，在out中的栈顶元素是最先进入队列的元素，可以弹出
     * 当out为空时，把in中的元素逐个弹出并压入out，由于先进入队列的元素被压入到in的地段，
     * 经过弹出和压入操作之后就处于out的顶端，可以直接弹出
     *
     * @return
     */
    public int pop(){
        if (out.isEmpty()){
            while (!in.isEmpty()) {
                out.push(in.pop());
            }
        }
        return out.pop();
    }
}
