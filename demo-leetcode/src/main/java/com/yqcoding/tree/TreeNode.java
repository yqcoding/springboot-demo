package com.yqcoding.tree;

/**
 * @ClassName TreeNode
 * @Description 定义树节点
 * @Author yaoqiang
 * @Date 2023/2/15 10:59
 * @Version 1.0
 */
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

