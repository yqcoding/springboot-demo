package com.yqcoding.tree;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName zigzagLevelOrder103
 * @Description 103. 二叉树的锯齿形层序遍历
 * @Author yaoqiang
 * @Date 2023/2/15 15:44
 * @Version 1.0
 */
public class zigzagLevelOrder103 {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root){
        /**
         锯齿输出树，整体以层级遍历为主，
         1、定义返回的res(根据类型 用链表)，定义deque用来放当前节点，后续放左右孩子
               定义方向isLeft(初始true,往临时的temp存的时候根据true存)
         */
        List<List<Integer>> res= new LinkedList<>();
        if(root==null) return res;
        Deque<TreeNode> deque=new LinkedList<>();
        deque.add(root);
        boolean isLeft=true;
        while (deque.size()>0){
            Deque<Integer> temp=new LinkedList<>();
            int size=deque.size();
            for(int i = 0; i < size; i++){
                TreeNode cur=deque.poll();
                if(isLeft){
                    temp.addLast(cur.val);
                }else {
                    temp.addFirst(cur.val);
                }
                if (cur.left!=null) deque.add(cur.left);
                if(cur.right != null) deque.add(cur.right);
            }
            res.add(new LinkedList<>(temp));
            isLeft=!isLeft;
        }
        return  res;
    }
}
