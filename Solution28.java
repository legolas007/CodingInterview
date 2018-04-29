package com.usher.algorithm.offer;

/**
 * @Author: Usher
 * @Description:
 * 对称的二叉树
 * 判断一颗二叉树是不是对称的，如果一颗二叉树和它的镜像一样，那么就是对称的
 *
 */
public class Solution28 {
    boolean isSymmetrical(TreeNode pRoot) {
        return pRoot == null || isEqual(pRoot.left, pRoot.right);
    }

    //先序遍历，递归实现。先判断根节点是否相等，然后在判断左右子树是否相等。
    private boolean isEqual(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null)
            return true;
        if (t2 == null || t1 == null)
            return false;
        //如果都不为空，则 需要比较左右子树后，再根据比较结果断定
        return t1.val == t2.val && isEqual(t1.left, t2.right) && isEqual(t1.right, t2.left);
    }
}
