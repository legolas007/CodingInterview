package com.usher.algorithm.offer;

/**
 * @Author: Usher
 * @Description:
 * 树的子结构
 */
public class Solution26 {
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if(root1 == null || root2 == null)
            return false;
        //比较根节点，否则比较左子树
        return isSubtree(root1,root2) || HasSubtree(root1.left,root2) || HasSubtree(root1.right,root2);
    }
    private boolean isSubtree(TreeNode root1, TreeNode root2){
        //root2遍历完都能对应上，返回true
        if (root2 == null)
            return true;
        //root2没有遍历完，root1遍历完了，返回false
        if (root1 == null)
            return false;
        //如果其中有一个点没有对应上，返回false
        if (root1.val != root2.val){
            return false;
        }
        //如果根节点对应的上，那么就分别去子节点里面匹配
        return isSubtree(root1.left,root2.left) && isSubtree(root1.right,root2.right);

    }
}
