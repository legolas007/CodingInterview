package com.usher.algorithm.offer;

import java.util.Stack;

/**
 * @Author: Usher
 * @Description:

        如果存在共同节点的话，那么从该节点，两个链表之后的元素都是相同的。
       也就是说两个链表从尾部往前到某个点，节点都是一样的。
       我们可以用两个栈分别来装这两条链表。一个一个比较出来的值。
       找到第一个相同的节点。
 */
public class Solution52 {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {

        if (pHead1 == null || pHead2 == null)
            return null;

        Stack<ListNode> stack1 = new Stack<>();
        Stack<ListNode> stack2 = new Stack<>();

        while (pHead1 != null){
            stack1.push(pHead1);
            pHead1 = pHead1.next;
        }

        while (pHead2 != null){
            stack2.push(pHead2);
            pHead2 = pHead2.next;
        }
        ListNode node = null;

        //直到不相等，保存上个节点
        while (!stack1.isEmpty() && !stack2.isEmpty() && stack1.peek() == stack2.peek()){
           stack2.pop();
           node =stack1.pop();
        }
        return node;
    }

}
