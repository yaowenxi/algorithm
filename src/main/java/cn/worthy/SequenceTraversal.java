package cn.worthy;

import java.util.Queue;

import static com.google.common.collect.Lists.newLinkedList;

/**
 * Author: Yaowenxi
 * Date: 18-3-10
 * <p>
 * 二叉树的层序遍历方式打印出数据
 */
public class SequenceTraversal {
    /**
     * @param treeNode 实现思路：利用队列的数据结构特点(先进先出)，将头节点首先插入到队列
     *                 当队列的头节点poll出来，然后将poll的左右子节点加到队列的后面(左右不为空时)
     *                 循环操作，打印出所有的字节点
     */
    public static void sequenceTraversal(TreeNode treeNode) {

        if (treeNode == null) return;

        Queue<TreeNode> queue = newLinkedList();
        queue.add(treeNode);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            System.out.println(node.value);

            if (node.left != null) queue.offer(node.left);
            if (node.right != null) queue.offer(node.right);
        }
    }

    public static void main(String[] args) {

        //初始化一个二叉树
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode5 = new TreeNode(5);
        TreeNode treeNode6 = new TreeNode(6);

        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode2.left = treeNode4;
        treeNode2.right = treeNode5;
        treeNode3.left = treeNode6;

        sequenceTraversal(treeNode1);
    }
}
