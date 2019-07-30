/**
 *在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。 
 */

package com.percy.app;

/**
 * FindIn2DArray
 */
public class FindIn2DArray {

  public static boolean find(int target, int[][] array) {
    int d1 = array.length;
    if (d1 != 0) {
      int d2 = array[0].length;
      if (d2 != 0) {
        return find2(target, d1 - 1, 0, array, d1, d2);
      }
    }
    return false;
  }

  private static boolean find2(int target, int row, int col, int[][] array, int d1, int d2) {
    if (row >= 0 && col < d2) {
      int current = array[row][col];
      if (target == current) {
        return true;
      } else if (target < current) {
        return find2(target, row - 1, col, array, d1, d2);
      } else {
        return find2(target, row, col + 1, array, d1, d2);
      }
    } else {
      return false;
    }
  }
}