package com.yqcoding.tree;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @ClassName minDepth
 * @Description TODO
 * @Author yaoqiang
 * @Date 2023/2/15 16:40
 * @Version 1.0
 */
public class minDepth {
    public int minDepth2(TreeNode root) {
        //定义一个类，将节点和高度存起来
        //定义deque存结构，将root存入当前deque，遍历deque
        //拿出节点取到node和depth.如果两个孩子都没有返回depth,
        //左不为空，deque添加左孩子和高度+1，否则右孩子
        if(root==null) return 0;
        Deque<QueueNode> deque=new LinkedList();
        deque.add(new QueueNode(root,1));
        while (deque.size()>0){
            QueueNode queueNode = deque.poll();
            TreeNode node=queueNode.node;
            int depth= queueNode.depth;
            if(node.left==null&& node.right == null) return depth;
            if(node.left!=null){
                deque.add(new QueueNode(node.left,depth+1));
            }else {
                deque.add(new QueueNode(node.right,depth+1));
            }
        }
        return 0;
    }
    class QueueNode{
        TreeNode node;
        int depth;

        public QueueNode(TreeNode node, int depth) {
            this.node = node;
            this.depth = depth;
        }
    }
    public int minDepth(TreeNode root) {
        /***
         递归：root为空返回0， 如果孩子为空返回1；声明min 最后返回+1
             左子树不为空，给比较递归左子树和min，将最小值给min,否则，处理右子树
         */
        if(root==null) return 0;
        if(root.left == null && root.right == null) return 1;
        int min=Integer.MAX_VALUE;
        if(root.left!=null){
            min=Math.min(minDepth(root.left),min);
        }else {
            min=Math.min(minDepth(root.right),min);
        }
        return min+1;
    }
}
