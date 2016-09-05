package com.yan.leetcode;

/**
 * Maximum Depth of Binary Tree
 *
 * @author jingyangyan
 * @version 1.0
 * @create 2016-09-05 15:47
 */
public class MaximumDepthOfBinaryTree {

    public int maxDepth(TreeNode root) {
        return middleOrder(root, 0);
    }

    public int middleOrder(TreeNode root, int height) {
        if (root == null)
            return height;
        return Math.max(middleOrder(root.left, height + 1), middleOrder(root.right, height + 1));
    }
}
