package com.usher.algorithm.offer;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author: Usher
 * @Description:
 * 二叉树的深度
 * 递归，深度优先搜索判断左右子树的深度孰大孰小即可，
 *  从根节点往下一层树的深度即自增1，遇到NULL时即返回0。
 *
 *  迭代（队列）层次遍历，树的最大深度为层次遍历搜索中的层数，
 *  先把每层父节点push到队列，遍历左右子节点是否为叶子节点，不是就push到队列，删除父节点，
 *  直到队列为空
 */
public class Solution55 {
    public int TreeDepth(TreeNode root){
        if (root == null)
            return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int max_depth = 0;
        while (!queue.isEmpty()){
            int size = queue.size();
            for (int i = 0;i < queue.size();i++){
                TreeNode cur = queue.poll();
                if (cur.left != null){
                    queue.offer(cur.left);
                }
                if (cur.right != null){
                    queue.offer(cur.right);
                }
            }
            ++max_depth;
        }
        return max_depth;
        //return Math.max(TreeDepth(root.left),TreeDepth(root.right))+1;//递归
    }
}
