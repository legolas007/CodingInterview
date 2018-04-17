package com.usher.algorithm.offer;



/**
 * @Author: Usher
 * @Description:
 * 二叉搜索树的第 K 个结点，中序遍历一颗二叉搜索树，递增排序
 */
public class Solution54 {
    private TreeNode ret;
    private int cnt = 0;
    public TreeNode KthNode(TreeNode pRoot,int k){
        inOrder(pRoot, k);
        return ret;
    }
    private void inOrder(TreeNode root, int k) {
        if (root == null) return;
        if (cnt > k) return;
        inOrder(root.left, k);
        cnt++;
        if (cnt == k) ret = root;
        inOrder(root.right, k);
    }
}
