package com.usher.algorithm.offer;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 输入一个链表，从尾到头打印链表每个节点的值
 * 后进先出，栈结构
 * @author usher
 *
 */
public class Solution6 {
	public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		ArrayList<Integer> list = new ArrayList<>();
		Stack<Integer> stack = new Stack<>();
		while(listNode != null) {
			stack.add(listNode.val);
			listNode = listNode.next;
		}
		while(!stack.isEmpty()) {
			list.add(stack.pop());
		}
		return list;
	}

}
