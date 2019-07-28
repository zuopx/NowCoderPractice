/**
 * Todo: all kinds of binary tree travel algorithms.
 */

package com.percy.app;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * TravelTree
 */
public class TravelTree {

  /**
   * 1. The hierarchy traversal of the tree. 1. breadth-first traversal 2. If
   * hierarchical output is required, some changes are needed. 2.1 用递归，将树的深度传下去
   * 2.2 广度优先遍历的变形，记住每一层的size
   */
  public static List<Integer> hierarchyTraversalV1(TreeNode root) {
    List<Integer> list = new ArrayList<>();
    Queue<TreeNode> queue = new LinkedList<>();
    if (root != null) {
      queue.offer(root);
    }
    while (!queue.isEmpty()) {
      TreeNode current = queue.poll();
      list.add(current.val);
      if (current.left != null) {
        queue.offer(current.left);
      }
      if (current.right != null) {
        queue.offer(current.right);
      }
    }
    return list;
  }

  public static List<List<Integer>> hierarchyTraversalV2(TreeNode root) {
    List<List<Integer>> list = new ArrayList<>();
    depthTraversal(root, 1, list);
    return list;
  }

  private static void depthTraversal(TreeNode root, int i, List<List<Integer>> list) {
    if (root != null) {
      if (list.size() < i) {
        list.add(new ArrayList<>());
      }
      list.get(i - 1).add(root.val);
      depthTraversal(root.left, i + 1, list);
      depthTraversal(root.right, i + 1, list);
    }
  }

  public static List<List<Integer>> hierarchyTraversalV3(TreeNode root) {
    List<List<Integer>> list = new ArrayList<>();
    Queue<TreeNode> queue = new LinkedList<>();
    if (root != null) {
      queue.offer(root);
    }
    while (!queue.isEmpty()) {
      int size = queue.size();
      list.add(new ArrayList<>());
      for (int i = 0; i != size; i++) {
        TreeNode current = queue.poll();
        list.get(list.size() - 1).add(current.val);
        if (current.left != null) {
          queue.offer(current.left);
        }
        if (current.right != null) {
          queue.offer(current.right);
        }
      }
    }
    return list;
  }
}