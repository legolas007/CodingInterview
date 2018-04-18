package com.usher.algorithm.offer;

/**
 * @Author: Usher
 * @Description:
 *
 * 二叉树的下一个节点：找出中序遍历的下一个节点，树中的结点不仅包含左右子结点，同时包含指向父结点的指针。
 * 1，如果一个节点的右子树不为空，那么该节点的下一个节点是右子树的最左节点
 * 2，否则向上找第一个左链接指向的树包含该节点的祖先节点
 */
public class Solution8 {
    public TreeLinkNode GetNext(TreeLinkNode pNode){
        if (pNode.right != null){
            TreeLinkNode node = pNode.right;
            while (node.left != null){
                node = node.left;
            }
            return node;
        }else {
            while (pNode.next != null){//父亲节点
                TreeLinkNode parent = pNode.next;
                if (parent.left == pNode)
                    return parent;
                pNode = pNode.next;
            }
        }
        return null;
    }
}
