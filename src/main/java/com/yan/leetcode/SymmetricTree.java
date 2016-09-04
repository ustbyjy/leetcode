package com.yan.leetcode;

import org.junit.Test;

import java.util.LinkedList;
import java.util.Queue;
import java.util.logging.Logger;

public class SymmetricTree {
    private final static Logger LOGGER = Logger.getLogger(SymmetricTree.class.getSimpleName());

    @Test
    public void test() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);
        LOGGER.info("result: " + isSymmetric(root));
        LOGGER.info("result: " + isSymmetric2(root));
    }

    public boolean isSymmetric(TreeNode root) {
        if (root == null)
            return true;
        Queue<TreeNode> left = new LinkedList<TreeNode>();
        Queue<TreeNode> right = new LinkedList<TreeNode>();
        left.add(root.left);
        right.add(root.right);
        while (!left.isEmpty() && !right.isEmpty()) {
            TreeNode t1 = left.poll();
            TreeNode t2 = right.poll();
            if (t1 != null && t2 != null) {
                if (t1.val != t2.val)
                    return false;
                left.add(t1.left);
                left.add(t1.right);
                right.add(t2.right);
                right.add(t2.left);
            } else if (t1 == null && t2 != null || t1 != null && t2 == null)
                return false;
        }

        return true;
    }

    public boolean isSymmetric2(TreeNode root) {
        if (root == null)
            return true;
        return isSymmetric(root.left, root.right);
    }

    public boolean isSymmetric(TreeNode left, TreeNode right) {
        if (left == null && right == null)
            return true;
        if (left != null && right != null) {
            if (left.val != right.val)
                return false;
            return isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
        } else {
            return false;
        }
    }

}
