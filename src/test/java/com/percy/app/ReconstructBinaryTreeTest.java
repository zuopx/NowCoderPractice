/**
 * 
 */

package com.percy.app;

import org.junit.Test;

/**
 * ReconstructBinaryTreeTest
 */
public class ReconstructBinaryTreeTest {

  @Test
  public void testReconstructBinaryTree() {
    int[] pre = new int[] { 1, 2, 4, 7, 3, 5, 6, 8 };
    int[] in = new int[] { 4, 7, 2, 1, 5, 3, 8, 6 };

    TreeNode root = new ReconstructBinaryTree().reconstructBinaryTree(pre, in);

    TravelTree.preOrder(root);
    System.out.println(TravelTree.list);
  }
}