/**
 * 序列化、反序列化二叉树
 */

package com.percy.app;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * SerializeBinarayTree
 */
public class SerializationBinarayTree {

  public String serialize(TreeNode root) {
    StringBuffer sb = new StringBuffer();
    Map<Integer, String> map = new HashMap<>();
    preOrder(root, 0, map);
    if (!map.isEmpty()) {
      int length = Collections.max(map.keySet()) + 1;
      for (int i = 0; i != length; i++) {
        sb.append(map.getOrDefault(i, "#") + ", ");
      }
      sb.delete(sb.length() - 2, sb.length());
    }
    return sb.toString();
  }

  private void preOrder(TreeNode root, int i, Map<Integer, String> map) {
    if (root != null) {
      map.put(i, Integer.toString(root.val));
      preOrder(root.left, 2 * i + 1, map);
      preOrder(root.right, 2 * i + 2, map);
    }
  }

  public TreeNode deserialize(String str) {
    String[] array = str.split(", ");
    TreeNode root = helper1(0, array);
    return root;
  }

  private TreeNode helper1(int i, String[] array) {
    TreeNode root = null;
    if (i < array.length && !array[i].equals("#")) {
      root = new TreeNode(Integer.parseInt(array[i]));
      root.left = helper1(2 * i + 1, array);
      root.right = helper1(2 * i + 2, array);
    }
    return root;
  }
}

