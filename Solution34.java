package com.usher.algorithm.offer;

import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author: Usher
 * @Description:
 * 二叉树中和为某一值的路径
 *
 * 当用前序遍历访问到某一节点时，把该节点添加到路径上，并累加该节点的值。
 * 如果该节点为叶节点，并且路径中的节点值的和等于target，则输出。
 * 如果当前节点不是叶节点，则继续访问它的子节点。当前节点结束后哦，递归函数与将自动回到它的父节点。
 * 在函数退出之前要在路径上删除当前节点并减去当前节点的值，以确保返回父节点时路径刚好是从根节点到父节点
 */
public class Solution34 {
    private ArrayList<ArrayList<Integer>> ret = new ArrayList<>();

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        backtracking(root,target,new ArrayList<>());
        return ret;
    }

    private void backtracking(TreeNode node,int target,ArrayList<Integer> path){
        if (node == null)
            return;
        path.add(node.val);
        target -= node.val;

        if (target == 0&& node.left == null&&node.right == null)
            ret.add(new ArrayList<>(path));
        else{
            backtracking(node.left,target,path);
            backtracking(node.right,target,path);
        }
        path.remove(path.size()-1);
    }
}
