package com.yan.leetcode;

/**
 * Maximum Depth of Binary Tree
 *
 * @author jingyangyan
 * @version 1.0
 * @create 2016-09-05 15:47
 */
public class MaximumDepthOfBinaryTree2 {

    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return Math.max(left, right) + 1;
    }
}
