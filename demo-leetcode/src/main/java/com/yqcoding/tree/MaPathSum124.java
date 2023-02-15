package com.yqcoding.tree;

/**
 * @ClassName MaPathSum124
 * @Description 124最大路径和，递归
 * @Author yaoqiang
 * @Date 2023/2/15 14:12
 * @Version 1.0
 */
public class MaPathSum124 {
    int res=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root){
        oneSideMax(root);
        return res;
    }

    private Integer oneSideMax(TreeNode root) {
        if (root==null) return 0;
        int left=Math.max(0,oneSideMax(root.left));
        int right=Math.max(0, oneSideMax(root.right));
        res=Math.max(res,left+right+root.val);
        return Math.max(left,right)+ root.val;
    }
}
