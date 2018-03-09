package cn.worthy;

import lombok.Data;

/**
 * Author: Yaowenxi
 * Date: 18-3-10
 * 树的节点
 */
@Data
public class TreeNode {

    int value;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        value = x;
    }
}
