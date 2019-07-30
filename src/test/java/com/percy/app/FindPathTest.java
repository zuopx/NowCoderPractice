/**
 * 
 */

package com.percy.app;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

/**
 * FindPathTest
 */
public class FindPathTest {

  TreeNode root = null;

  @Before
  public void setUp() {
    int treeSize = 15;
    TreeNode[] completeBinaryTree = new TreeNode[treeSize];
    for (int i = 0; i != treeSize; i++) {
      completeBinaryTree[i] = new TreeNode(i);
    }
    for (int i = 0; i != treeSize / 2; i++) {
      completeBinaryTree[i].left = completeBinaryTree[2 * i + 1];
      if (2 * i + 2 <= treeSize - 1) {
        completeBinaryTree[i].right = completeBinaryTree[2 * i + 2];
      }
    }
    completeBinaryTree[2].val = -5;
    completeBinaryTree[4].val = 1;
    root = completeBinaryTree[0];
  }

  @Test
  public void testFindPath() {
    int target = 11;
    ArrayList<ArrayList<Integer>> paths = null;;
    paths = FindPath.findPath(root, target);
    for (ArrayList<Integer> var : paths) {
      System.out.println(var);
    }
  }
}