package com.usher.algorithm.offer;

/**
 * @Author: Usher
 * @Description:
 * 序列化二叉树
序列化：使用前序遍历，递归的将二叉树的值转化为字符，并且在每次二叉树的结点
不为空时，在转化val所得的字符之后添加一个' ， '作为分割。对于空节点则以 '#' 代替。
 反序列化：按照前序顺序，递归的使用字符串中的字符创建一个二叉树(特别注意：
在递归时，递归函数的参数一定要是char ** ，这样才能保证每次递归后指向字符串的指针会
随着递归的进行而移动
 */
public class Solution37 {
    int index = -1;
    String Serialize(TreeNode root) {
        StringBuffer stringBuffer = new StringBuffer();
        if (root == null) {
            stringBuffer.append("#,");
            return stringBuffer.toString();
        }
        stringBuffer.append(root.val + ",");
        stringBuffer.append(Serialize(root.left));
        stringBuffer.append(Serialize(root.right));
        return stringBuffer.toString();
    }
    TreeNode Deserialize(String str) {
        index++;
        String[] strings = str.split(",");
        TreeNode node = null;
        if (!strings[index].equals("#")){
            node = new TreeNode((Integer.valueOf(strings[index])));
            node.left = Deserialize(str);
            node.right = Deserialize(str);
        }
        return node;
    }
}
