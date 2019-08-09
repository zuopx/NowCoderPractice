/**
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
 * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 */

package com.percy.app;

/**
 * ReconstructBinaryTree
 */
public class ReconstructBinaryTree {

  public TreeNode reconstructBinaryTree(int [] pre,int [] in) {
    return reconstruct(pre, 0, pre.length, in, 0, in.length);
  }

  private TreeNode reconstruct(int[] pre, int lowPre, int highPre, 
                              int[] in, int lowIn, int highIn) {
    if (lowPre < highPre && lowIn < highIn) {
      System.out.printf("%d, %d, %d, %d\n", lowPre, highPre, lowIn, highIn);
      int rootVal = pre[lowPre];
      TreeNode root = new TreeNode(rootVal);
      int rootIndex;
      for (rootIndex = lowIn; rootIndex != highIn; rootIndex++) {
        if (in[rootIndex] == rootVal) {
          break;
        }
      }
      root.left = reconstruct(pre, lowPre + 1, lowPre + 1 + (rootIndex - lowIn),
                              in, lowIn, rootIndex);
      root.right = reconstruct(pre, lowPre + 1 + (rootIndex - lowIn), highPre,
                              in, rootIndex + 1, highIn);
      return root;
    } else {
      return null;
    }
  }
}