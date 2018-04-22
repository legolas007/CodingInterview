package com.usher.algorithm.offer;

/**
 * @Author: Usher
 * @Description:
 * 链表中倒数第K个节点
 * 设链表的长度为 N。设两个指针 P1 和 P2，
 * 先让 P1 移动 K 个节点，则还有 N - K 个节点可以移动。此时让 P1 和 P2 同时移动，可以知道当 P1 移动到链表结尾时，P2 移动到 N - K 个节点处，该位置就是倒数第 K 个节点
 *
 */
public class Solution22 {
    public ListNode FindKthToTail(ListNode head,int k) {
        if (head == null)
            return null;
        ListNode node1,node2;
        node1 = node2 = head;
        while (node1 != null && k-- > 0)
            node1 = node1.next;
        if (k > 0)
            return null;
        while (node1 != null){
            node1 = node1.next;
            node2 = node2.next;
        }
        return node2;
    }
}
