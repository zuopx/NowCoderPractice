/**
 * Todo: all kinds of binary tree travel algorithms.
 * 树是图的特例。
 * 图的遍历算法主要有广度优先遍历和深度优先遍历。
 * 树的遍历算法有前序遍历，中序遍历和后序遍历，以及层次遍历。
 * 默认用递归实现，重点在于理解其迭代算法。
 */

package com.percy.app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/**
 * TravelTree
 */
public class TravelTree {

  static List<Integer> list = new ArrayList<>();

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

  public static void preOrder(TreeNode root) {
    if (root != null) {
      list.add(root.val);
      preOrder(root.left);
      preOrder(root.right);
    }
  }

  /**
   * 先序遍历的非递归算法就是深度优先遍历算法。
   * 
   * @param root
   */
  public static void preOrderIteration(TreeNode root) {
    Stack<TreeNode> stack = new Stack<>();
    stack.push(root);
    while (!stack.isEmpty()) {
      TreeNode current = stack.pop();
      if (current != null) {
        list.add(current.val);
        stack.push(current.right);
        stack.push(current.left);
      }
    }
  }

  public static void postOrder(TreeNode root) {
    if (root != null) {
      postOrder(root.left);
      postOrder(root.right);
      list.add(root.val);
    }
  }

  /**
   * 后序遍历的递归算法不是尾递归，比较复杂。
   * 可以观察到后序遍历的结果和先序遍历的结果正好顺序相反。
   * @param root
   */
  public static void postOrderIteration(TreeNode root) {
    Stack<TreeNode> stack = new Stack<>();
    stack.push(root);
    while (!stack.isEmpty()) {
      TreeNode current = stack.pop();
      if (current != null) {
        list.add(current.val);
        stack.push(current.left);
        stack.push(current.right);
      }
    }
    Collections.reverse(list);
  }

  public static void inOrder(TreeNode root) {
    if(root != null){
      inOrder(root.left);
      list.add(root.val);
      inOrder(root.right);
    }
  }

  public static void inOrderIteration(TreeNode root) {
    Stack<TreeNode> stack = new Stack<>();
    stack.push(root);
    while(!stack.isEmpty()){
      TreeNode current = stack.peek();
      if(current!=null){
          stack.push(current.left);
      } else {
        stack.pop();
        if(!stack.isEmpty()){
          current = stack.pop();
          list.add(current.val);
          stack.push(current.right);
        }
      }
    }
  }
}