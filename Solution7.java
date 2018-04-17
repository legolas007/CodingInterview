package com.usher.algorithm.offer;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Usher
 * @Description:
 * 重建二叉树：根据前序遍历和中序遍历重建二叉树
 * preorder = [3,9,20,15,7]
 * inorder =  [9,3,15,20,7]
 */
public class Solution7 {
    //缓存中序遍历数组的每个值对应的索引
    private Map<Integer,Integer> inOrderNumsIdx = new HashMap<>();

    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if (pre == null || in == null || pre.length != in.length)
            return null;
        return reConstruct(pre,0,pre.length-1,in,0,in.length-1);
    }
    /**
     *
     * @param pre    前序遍历
     * @param ps    前序遍历的开始位置
     * @param pe    前序遍历的结束位置
     * @param in    中序遍历
     * @param is    中序遍历的开始位置
     * @param ie    中序遍历的结束位置
     * @return        根节点
     */
    private TreeNode reConstruct(int[] pre, int ps, int pe, int[] in, int is, int ie){
        if (ps > pe)
            return null;
        // 取前序遍历的第一个数字就是根节点
        // 在中序遍历中中寻找根节点
        int value = pre[ps];
        int index = is;
        while (index <= ie && value != in[index])
            index++;

        // 创建当前根节点，并为根节点赋值
        TreeNode node = new TreeNode(value);
        // 递归调用构建当前节点的左子树
        node.left = reConstruct(pre, ps+1, ps+index-is, in, is, index-1);
        // 递归调用构建当前节点的右子树
        node.right = reConstruct(pre, ps+index-is+1, pe, in, index+1, ie);

        return node;

    }
}
