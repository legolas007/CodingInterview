package com.usher.algorithm.offer;

/**
 * @Author: Usher
 * @Description:
 * 链表中环的入口节点
 * 使用双指针，一个指针 fast 每次移动两个节点，
 * 一个指针 slow 每次移动一个节点。因为存在环，
 * 所以两个指针必定相遇在环中的某个节点上。
 * 此时 fast 移动的节点数为 x+2y+z，slow 为 x+y，
 * 由于 fast 速度比 slow 快一倍，
 * 因此 x+2y+z=2(x+y)，得到 x=z。
在相遇点，slow 要到环的入口点还需要移动 z 个节点，
如果让 fast 重新从头开始移动，并且速度变为每次移动一个节点，
那么它到环入口点还需要移动 x 个节点。在上面已经推导出 x=z，
因此 fast 和 slow 将在环入口点相遇。

 */
public class Solution23 {
    /**
     第一步，找环中相汇点。分别用p1，p2指向链表头部，p1每次走一步，p2每次走二步，直到p1==p2找到在环中的相汇点。
     第二步，找环的入口。接上步，当p1==p2时，p2所经过节点数为2x,p1所经过节点数为x,
     设环中有n个节点,p2比p1多走一圈有2x=n+x; n=x;可以看出p1实际走了一个环的步数，
     再让p2指向链表头部，p1位置不变，p1,p2每次走一步直到p1==p2; 此时p1指向环的入口。
     * @param pHead
     * @return
     */
    public ListNode EntryNodeOfLoop(ListNode pHead) {
        if (pHead == null)
            return null;
        ListNode slow = pHead,fast = pHead;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast){
                fast = pHead;
                while (slow != fast){
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }
}
