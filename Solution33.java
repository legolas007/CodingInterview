package com.usher.algorithm.offer;

/**
 * @Author: Usher
 * @Description:
 * 二叉搜索树后序遍历序列
 *
 * 最后一个数字是树的根节点的值，左子树的节点的值比根节点小，右子树的节点的值比根节点的值大
 *
 * 确定root，遍历序列，找到第一个大于root的位置，则该位置的左边为左子树，右边右子树
 * 遍历右子树，若有小于root的值，返回false，
 * 递归
 */
public class Solution33 {
    public boolean VerifySquenceOfBST(int[] sequence) {
        if (sequence == null || sequence.length == 0)
            return false;
        return verify(sequence, 0, sequence.length - 1);
    }

    private boolean verify(int[] sequence, int first, int last) {
        if (last - first <= 1)
            return true;
        int rootVal = sequence[last];
        int cutIndex = first;
        while (cutIndex < last && sequence[cutIndex] <= rootVal)
            cutIndex++;
        for (int i = cutIndex + 1; i < last; i++)
            if (sequence[i] < rootVal)
                return false;
        return verify(sequence, first, cutIndex - 1) && verify(sequence, cutIndex, last - 1);
    }
}

