/**
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。如果是则输出Yes,否则输出No。
 * 假设输入的数组的任意两个数字都互不相同。
 * 
 * 递归
 */

package com.percy.app;

/**
 * VerifySquenceOfBST
 */
public class VerifySquenceOfBST {

  public static boolean verifySquenceOfBST(int[] array) {

    return isValid(array, 0, array.length);
    
  }

  private static boolean isValid(int[] array, int low, int high) {
    if (high > low) {
      int root = array[high - 1];
      int mid = low;
      while (mid < high - 1 && array[mid] < root) {
        mid++;
      }
      for (int i = mid; i < high - 1; i++) {
        if (array[i] < root) {
          return false;
        }
      }
      return isValid(array, low, mid) && isValid(array, mid, high - 1);
    }
    return true;
  }
}