package com.usher.algorithm.offer;

/**
 * @Author: Usher
 * @Description:
 * 反转链表
 */
public class Solution24 {
    public ListNode ReverseList(ListNode head) {

        /**
         * 简化版
          ListNode pre = null;
             ListNode next = null;
             while (head != null) {
                 next = head.next;
                 head.next = pre;
                 pre = head;
                 head = next;
             }
             return pre;
         */
        if(head==null)
            return null;

        ListNode pRevHead = null;//尾节点，新链表头指针
        ListNode pNode  = head;//当前节点
        ListNode pPrev = null;//前一个节点
        while (pNode != null){
            //保存当前节点的next节点
            ListNode pNext = pNode.next;
            if (pNext == null)//尾节点
                pRevHead = pNode;
            //指针反转
            pNode.next = pPrev;
            pPrev = pNode;
            pNode = pNext;
        }
        return pRevHead;
    }
}
