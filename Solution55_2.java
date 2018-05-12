package com.usher.algorithm.offer;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author: Usher
 * @Description:
 * 平衡二叉树
 * 后序遍历，在遍历左右子树节点的时候记录他的深度
 */
public class Solution55_2 {

    private boolean flag = true;
    public boolean IsBalanced_Solution(TreeNode root) {
        TreeDepth(root);
        return flag;
    }

    private int TreeDepth(TreeNode root){
        if (root == null)
            return 0;

        int left = TreeDepth(root.left);
        int right = TreeDepth(root.right);

        if (Math.abs(left - right) > 1)
            flag = false;
        return Math.max(left,right)+1;//递归
    }

}
