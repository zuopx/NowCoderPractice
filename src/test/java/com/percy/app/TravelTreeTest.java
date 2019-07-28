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
    int treeSize = 10;
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

  @Test
  public void testPreOrder() {
    TravelTree.preOrder(root);
    System.out.println(TravelTree.list.toString());
    assertTrue(true);
  }

  @Test
  public void testPreOrderIteration() {
    TravelTree.preOrderIteration(root);
    System.out.println(TravelTree.list.toString());
    assertTrue(true);
  }

  @Test
  public void testPostOrder() {
    TravelTree.postOrder(root);
    System.out.println(TravelTree.list.toString());
  }

  @Test
  public void testPostOrderIteration() {
    TravelTree.postOrderIteration(root);
    System.out.println(TravelTree.list.toString());
  }

  @Test
  public void testInOrder() {
    TravelTree.inOrder(root);
    System.out.println(TravelTree.list.toString());
  }

  @Test
  public void testInOrderIteration() {
    TravelTree.inOrderIteration(root);
    System.out.println(TravelTree.list.toString());
  }

  @Test
  public void testGetNext() {
    int treeSize = 10;
    TreeLinkNode[] completeBinaryTree = new TreeLinkNode[treeSize];
    for (int i = 0; i != treeSize; i++) {
      completeBinaryTree[i] = new TreeLinkNode(i);
    }
    for (int i = 0; i != treeSize / 2; i++) {
      completeBinaryTree[i].left = completeBinaryTree[2 * i + 1];
      completeBinaryTree[2 * i + 1].parent = completeBinaryTree[i];
      if (2 * i + 2 <= treeSize - 1) {
        completeBinaryTree[i].right = completeBinaryTree[2 * i + 2];
        completeBinaryTree[2 * i + 2].parent = completeBinaryTree[i];
      }
    }
    for (TreeLinkNode var : completeBinaryTree) {
      TreeLinkNode next = TravelTree.getNext(var);
      if(next == null){
        System.out.println(var.val + ":" + "#");
      }else{
        System.out.println(var.val + ":" + next.val);
      }
    }
  }
}