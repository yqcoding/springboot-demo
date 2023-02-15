package com.yqcoding.tree;

/**
 * @ClassName LowestCommonAncestor
 * @Description 234判断树的最近公共祖先
 *
 * @Author yaoqiang
 * @Date 2023/2/15 14:29
 * @Version 1.0
 */
public class LowestCommonAncestor236 {
    //判断根节点为空或者和pq任意一个相等就是最大的，
    // 然后将左子根传入遍历对比得到left,同理右边，分别得到左右相同的（此刻）
    //如果left为空，则返回右，right为空返回左，否则返回root
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null ||root==p||root==q) return root;
        TreeNode left=lowestCommonAncestor(root.left,p,q);
        TreeNode right=lowestCommonAncestor(root.right, p, q);
        if(left==null) return  right;
        if(right==null) return left;
        return root;
    }
    //公共祖先，要么是根，要么是root=pq其中的某个，

}
