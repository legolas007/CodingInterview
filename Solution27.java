package com.usher.algorithm.offer;

/**
 * @Author: Usher
 * @Description:
 * 二叉树镜像
 * 先前序遍历，如果遍历到的节点有子节点，就交换它的两个子节点，
 * 当交换完所有非叶子节点后，就得到了树的镜像
 */
public class Solution27 {
    public void Mirror(TreeNode root) {
        if (root == null)
            return;
        if (root.left == null && root.right == null)
            return;
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
        Mirror(root.left);
        Mirror(root.right);
    }
}
