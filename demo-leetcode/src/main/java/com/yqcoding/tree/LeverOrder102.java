package com.yqcoding.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName LeverOrder102
 * @Description 102二叉树的层序遍历，给你root，从左到右遍历树
 * @Author yaoqiang
 * @Date 2023/2/15 10:55
 * @Version 1.0
 */
public class LeverOrder102 {
    public static void main(String[] args) {

        System.out.println(112);

    }
    public List<List<Integer>> levelOrder(TreeNode root){
        //定义res,deque,root判空，while循环deque，root
        //定义res ,返回用的,放的是一个个数，用数组，ArrayList实现了list
        List<List<Integer>> res=new ArrayList<>();
        //判断root为空的现象
        if(root==null) return res;
        //定义LinkedList用来装节点，deque,节点基于双向链表，用于放树节点，方便获取头尾
        LinkedList<TreeNode> deque=new LinkedList<>();
        //将当前节点加入deque
        deque.add(root);
        //while循环遍历deque
        while(deque.size()!=0){
            //定义一个temp，用来装当前节点下的val
            List<Integer> temp=new ArrayList<>();
            //获取循环双端队列的长度，作为下面循环遍历的依据，循环遍历，
            // 先pop出一个treeNode,将节点的val添加到temp,分别判左右节点，分别放入双端队列，完成循环，tepm放入res,最后返回res
            int size=deque.size();
            for(int i=0;i<size;i++){
                TreeNode t=deque.pop();
                temp.add(t.val);
                if(t.left!=null) deque.add(t.left);
                if (t.right != null) deque.add(t.right);
            }
            res.add(temp);
        }
        return  res;
    }
}
