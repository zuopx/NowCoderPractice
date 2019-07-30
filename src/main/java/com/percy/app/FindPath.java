/**
 * 输入一颗二叉树的根节点和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
 * 路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
 */

package com.percy.app;

import java.util.ArrayList;
import java.util.List;

/**
 * FindPath
 */
public class FindPath {

  /**
   * 回溯法
   * 
   * @param root
   * @param target
   * @return
   */
  public static ArrayList<ArrayList<Integer>> findPath(TreeNode root, int target) {
    ArrayList<ArrayList<Integer>> paths = new ArrayList<>();
    List<TreeNode> path = new ArrayList<>();
    int sum = 0;
    find(root, path, sum, target, paths);
    return paths;
  }

  private static void find(TreeNode root, List<TreeNode> path, int sum, int target,
      ArrayList<ArrayList<Integer>> paths) {
    if (root != null) {
      path.add(root);
      sum += root.val;
      if (root.left == null && root.right == null) {
        if (sum == target) {
          ArrayList<Integer> tmp = new ArrayList<>();
          for (TreeNode obj : path) {
            tmp.add(obj.val);
          }
          paths.add(tmp);
        }
      } else {
        if (sum <= target) {
          find(root.left, path, sum, target, paths);
          find(root.right, path, sum, target, paths);
        }
      }
      path.remove(root);
      sum -= root.val;
    }
  }
}