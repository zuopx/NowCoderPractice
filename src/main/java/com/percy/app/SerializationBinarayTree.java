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
    String str = "";
    Map<Integer, String> map = new HashMap<>();
    preOrder(root, 0, map);
    if (!map.isEmpty()) {
      String[] array = new String[Collections.max(map.keySet())];
      for (Integer var : map.keySet()) {
        array[var] = map.get(var);
      }
      str = array.toString().replace('\000', '#');
    }
    return str;
  }

  private void preOrder(TreeNode root, int i, Map<Integer, String> map) {
    if (root != null) {
      map.put(i, Integer.toString(root.val));
    }
  }

  public TreeNode deserialize(String str) {
    TreeNode root = null;

    return root;
  }
}