package com.yqcoding.tree;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @ClassName MaxDepth
 * @Description 104. 二叉树的最大深度--根节点到叶子最远的距离
 * @Author yaoqiang
 * @Date 2023/2/15 14:40
 * @Version 1.0
 */
public class MaxDepth104 {
    public int maxDepth(TreeNode root){
        if(root == null){
            return 0;
        }else{
            int left=maxDepth(root.left);
            int right=maxDepth(root.right);
            return Math.max(left, right)+1;
        }
    }
   //最大深度，跟层级遍历类似，每层+1，左右孩子再加入deque
    public int maxDepth2(TreeNode root){
        if(root==null) return 0;
        int res=0 ;
        Deque<TreeNode> deque=new LinkedList<>();
        deque.add(root);
        while(deque.size()>0){
            int size=deque.size();
            for(int i = 0; i < size; i++){
                TreeNode temp=deque.poll();
                if(temp.left !=null) deque.add(temp.left);
                if(temp.right!=null) deque.add(temp.right);
            }
            res++;
        }
        return res;
    }


}
