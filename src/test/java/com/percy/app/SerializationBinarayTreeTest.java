/**
 * 
 */

package com.percy.app;

import org.junit.Before;
import org.junit.Test;

/**
 * SerializationBinarayTreeTest
 */
public class SerializationBinarayTreeTest {

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
  public void testSerialize() {
    SerializationBinarayTree sb = new SerializationBinarayTree();
    System.out.println(sb.serialize(root)); 
  }

  @Test
  public void testDeserialize() {
    SerializationBinarayTree sb = new SerializationBinarayTree();
    String str = "0, 1, 2, #, 4, 5, 6, #, #, 9";
    TreeNode r = sb.deserialize(str);
    System.out.println(sb.serialize(r));
  }
}