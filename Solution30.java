package com.usher.algorithm.offer;

import java.util.Stack;

/**
 * @Author: Usher
 * @Description:
 * 包含min的栈
 */
public class Solution30 {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();
    Stack<Integer> s3 = new Stack<>();

    public void push(int node){
        s1.push(node);
        if (s2.isEmpty()){
            s2.push(node);
        }else if (node <= s2.peek()){
            s2.push(node);
        }
        if (s3.isEmpty()){
            s3.push(node);
        }else if (node >= s3.peek()){
            s3.push(node);
        }
    }
    public void pop(){
        int data = s1.pop();
        if (data == s2.peek()){
            s2.pop();
        }
        if (data == s3.peek()){
            s3.pop();
        }
    }
    public int top(){
        return s1.peek();
    }
    public int min(){
        return s2.peek();
    }
    public int max(){
        return s3.peek();
    }
}
