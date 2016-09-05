package com.yan.leetcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Binary Tree Level Order Traversal
 *
 * @author jingyangyan
 * @version 1.0
 * @create 2016-09-05 15:10
 */
public class BinaryTreeLevelOrderTraversalII {

    @Test
    public void test() {
        TreeNode head = new TreeNode(3);
        head.left = new TreeNode(9);
        head.right = new TreeNode(20);
        head.right.left = new TreeNode(15);
        head.right.right = new TreeNode(7);

        List<List<Integer>> levelList = levelOrderBottom(head);

        System.out.println(levelList);

    }

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> levelList = new ArrayList<>();
        preOrder(root, levelList, 0);
        Collections.reverse(levelList);
        return levelList;
    }

    public void preOrder(TreeNode root, List<List<Integer>> levelList, int height) {
        if (root == null)
            return;
        else {
            if (levelList.size() < height + 1) {
                List<Integer> valueList = new ArrayList<>();
                valueList.add(root.val);
                levelList.add(height, valueList);
            } else {
                List<Integer> valueList = levelList.get(height);
                valueList.add(root.val);
            }
            preOrder(root.left, levelList, height + 1);
            preOrder(root.right, levelList, height + 1);
        }
    }
}
