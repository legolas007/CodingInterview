package com.usher.algorithm.offer;

import java.util.*;

/**
 * @Author: Usher
 * @Description: 之字形打印二叉树
 * 第一行按照从左到右打印的顺序，第二层按照从右到左的顺序打印，第三行按照从左到右的顺序
 */
public class Solution32_3 {

    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {

        ArrayList<ArrayList<Integer>> ret = new ArrayList<>();

        if (pRoot == null)
            return ret;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(pRoot);
        boolean reverse = false;

        while (!queue.isEmpty()) {
            ArrayList<Integer> list = new ArrayList<>();
            int cnt = queue.size();

            for (int i = 0;i < cnt;i++){
                TreeNode node = queue.poll();
                list.add(node.val);
                if (node.left != null)
                    queue.add(node.left);
                if (node.right != null)
                    queue.add(node.right);
            }

            if (reverse)
                Collections.reverse(list);

            reverse = !reverse;
            ret.add(list);
        }
        return ret;
    }
}
