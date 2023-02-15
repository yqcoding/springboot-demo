package com.yqcoding.tree;

/**
 * @ClassName IsBalanced
 * @Description 110. 平衡二叉树 https://leetcode.cn/problems/balanced-binary-tree/
 * @Author yaoqiang
 * @Date 2023/2/15 17:27
 * @Version 1.0
 */
public class IsBalanced {
    public boolean isBalanced(TreeNode root){
        return height(root)>=0;//调height>=0就行
    }
    public int height(TreeNode root){
        //为空返回0，左右分别递归左右节点
        //如果左高=-1，右高等于-1，或者abs(左-右)>1 返回-1 否则返回max(左，右)+1
        if (root==null) return 0;
        int leftHeight=height(root.left);
        int rightHeight=height(root.right);
        if(leftHeight==-1||rightHeight == -1||Math.abs(leftHeight-rightHeight)>1){
            return -1;
        }else {
            return Math.max(leftHeight,rightHeight)+1;
        }
    }
}
