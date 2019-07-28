/**
 * 牛客网-剑指offer-对称的二叉树
 */

package com.percy.app;

/**
 * SymmetricalBinaryTree
 */
public class SymmetricalBinaryTree {

    boolean isSymmetrical(TreeNode pRoot) {
        if (pRoot == null) {
            return true;
        } else {
            return equal(pRoot.left, pRoot.right);
        }
    }

    private boolean equal(TreeNode left, TreeNode right) {
        if (left == null) {
            return right == null;
        } else if (right == null) {
            return left == null;
        } else if (left.val == right.val) {
            return equal(left.left, right.right) && equal(left.right, right.left);
        }
        return false;
    }
}