package com.usher.algorithm.offer;

/**
 * @Author: Usher
 * @Description:
 *
 * 删除链表中重复的节点（已排序）
 *
 * 从头遍历整个链表，如果当前节点的值与下一个节点的值相同，都可以删除，
 * 把当前节点的前一个节点和后面值比当前节点大的节点相连
 */
public class Solution18 {
    public ListNode deleteDuplication(ListNode pHead){
        // 只有0个或1个节点，则返回
        if (pHead == null)
            return null;
        ListNode next = pHead.next;
        if (next == null)
            return pHead;
        // 当前节点是重复节点
        if (pHead.val == next.val){
            while (next != null && pHead.val == next.val)
                // 跳过值与当前节点相同的全部节点,找到第一个与当前节点不同的节点
                next = next.next;
            // 从第一个与当前节点不同的节点开始递归
            return deleteDuplication(next);
        }
        // 不是重复节点，保留当前节点，从下一个节点开始递归
        pHead.next = deleteDuplication(pHead.next);
        return pHead;
    }
}
