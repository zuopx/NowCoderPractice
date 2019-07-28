/**
 * 
 */

package com.percy.app;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

/**
 * TravelTreeTest
 */
public class TravelTreeTest {
  
  TreeNode root = null;

  @Before
  public void setUp() {
    int treeSize = 100;
    TreeNode[] completeBinaryTree = new TreeNode[treeSize];
    for (int i = 0; i != treeSize; i++) {
      completeBinaryTree[i] = new TreeNode(i);
    }
    for (int i=0; i != treeSize /2; i++) {
      completeBinaryTree[i].left = completeBinaryTree[2 * i + 1];
      if (2 * i + 2 <= treeSize - 1) {
        completeBinaryTree[i].right = completeBinaryTree[2 * i + 2];
      }
    }
    root = completeBinaryTree[0];
  }

  @Test
  public void testHierarchyTraversalV1() {
    List<Integer> list = TravelTree.hierarchyTraversalV1(root);
    System.out.println(list.toString());
    assertTrue(true);
  }

  @Test
  public void testHierarchyTraversalV2() {
    List<List<Integer>> list = TravelTree.hierarchyTraversalV2(root);
    System.out.println(list.toString());
    assertTrue(true);
  }

  @Test
  public void testHierarchyTraversalV3() {
    List<List<Integer>> list = TravelTree.hierarchyTraversalV3(root);
    System.out.println(list.toString());
    assertTrue(true);
  }
}