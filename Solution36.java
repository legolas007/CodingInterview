package com.usher.algorithm.offer;

/**
 * @Author: Usher
 * @Description:
 * 二叉搜索树与双向链表
 * 将二叉树转换成一个排序的双向链表（不能创建任何新的节点，只能调整树中节点指针的指向）
 *
 * 直接中序遍历
 */
public class Solution36 {
    //双向链表的左边头结点和右边头节点
    private TreeNode pre = null;
    private TreeNode head = null;

    public TreeNode Convert(TreeNode pRootOfTree) {
        if (pRootOfTree == null)
            return null;
        inOrder(pRootOfTree);
        //返回左边头结点
        return head;
    }
    private void inOrder(TreeNode node){
        //递归调用叶子节点的左右节点返回null
        if (node == null)
            return;

        //第一次运行时，它会使最左边叶子节点为链表第一个节点
        inOrder(node.left);
        if (pre == null){
            pre = node;
            head = node;
        }else {
            //把根节点插入到双向链表右边，pre向后移动
            pre.right = node;
            node.left = pre;
            pre = node;
        }
        //把右叶子节点也插入到双向链表（rightHead已确定，直接插入
        inOrder(node.right);
    }
}
