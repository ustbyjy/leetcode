package com.yan.leetcode;

import org.junit.Test;

import java.util.LinkedList;

/**
 * Minimum Depth of Binary Tree
 *
 * @author jingyangyan
 * @version 1.0
 * @create 2016-09-06 15:29
 */
public class MinimumDepthOfBinaryTree {

    @Test
    public void test() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);

        System.out.println("minDepth: " + minDepth(root));
    }

    public int minDepth(TreeNode root) {
        if (root == null)
            return 0;

        LinkedList<TreeNode> nodes = new LinkedList<TreeNode>();
        LinkedList<Integer> counts = new LinkedList<Integer>();
        nodes.add(root);
        counts.add(1);
        while (!nodes.isEmpty()) {
            TreeNode curr = nodes.poll();
            int count = counts.poll();
            if (curr.left != null) {
                nodes.add(curr.left);
                counts.add(count + 1);
            }
            if (curr.right != null) {
                nodes.add(curr.right);
                counts.add(count + 1);
            }
            if (curr.left == null && curr.right == null)
                return count;
        }
        return 0;
    }

    public int minDepth2(TreeNode root) {
        if (root == null)
            return 0;
        if (root.left == null && root.right == null)
            return 1;
        if (root.left == null)
            return 1 + minDepth(root.right);
        else if (root.right == null)
            return 1 + minDepth(root.left);
        else
            return 1 + Math.min(minDepth(root.left), minDepth(root.right));
    }
}
