package com.usher.algorithm.offer;

/**
 * @Author: Usher
 * @Description:
 * 合并两个排序的链表
 *  如果list1的节点值小于list2的节点的值，则list的头结点为合并后的链表的头结点，
 *  继续合并，然后比较list1的next节点和list2头结点比较，如果list2的头结点小，
 *  则list2的头结点将是合并剩余节点得到的链表的头结点，吧这个节点与前面合并链表得到的链表的尾节点（list1）链接起来
 *
 */
public class Solution25 {
    public ListNode Merge(ListNode list1,ListNode list2) {
        /*
        //递归
        if(list1 == null )
            return list2;
        if (list2 == null)
            return list1;
        if (list1.val <= list2.val){
            list1.next = Merge(list1.next,list2);
            return list1;
        }else {
            list2.next = Merge(list1,list2.next);
            return list2;
        }*/
        //新建一个头节点，用来存合并的链表
        ListNode head = new ListNode(-1);
        ListNode cur = head;
        while (list1 != null && list2 != null){
            if (list1.val <= list2.val){
                cur.next = list1;
                list1 = list1.next;
            }else {
                cur.next = list2;
                list2 = list2.next;
            }
            cur = cur.next;
        }
        if (list1 != null)
            cur.next = list1;
        if (list2 != null)
            cur.next = list2;
        return head.next;
    }
}
