package com.usher.algorithm.offer;

import java.util.*;

/**
 * @Author: Usher
 * @Description:
 * 从上到下打印二叉树
 *  迭代（队列）层次遍历，
 *  先把每层父节点push到队列，遍历左右子节点是否为叶子节点，不是就push到队列，删除父节点，
 *  直到队列为空
 */
public class Solution32 {
    private List<Integer> list = new ArrayList<>();
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        if (root == null)
            return new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0;i < queue.size();i++){
                TreeNode node = queue.poll();
                list.add(node.val);
                if (node.left != null)
                    queue.offer(node.left);
                if (node.right != null)
                    queue.offer(node.right);
            }
        }
        return (ArrayList<Integer>) list;
    }
}
