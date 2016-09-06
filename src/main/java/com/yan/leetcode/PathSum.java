package com.yan.leetcode;

/**
 * Path Sum
 *
 * @author jingyangyan
 * @version 1.0
 * @create 2016-09-06 16:36
 */
public class PathSum {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null)
            return false;
        if (root.left == null && root.right == null && root.val == sum)
            return true;
        else
            return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
    }
}
