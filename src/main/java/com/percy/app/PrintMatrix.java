package com.percy.app;

import java.util.ArrayList;

public class PrintMatrix {
  public ArrayList<Integer> printMatrix(int[][] matrix) {
    ArrayList<Integer> list = new ArrayList<>();
    if (matrix.length > 0) {
      if (matrix[0].length > 0) {
        helper(matrix, 0, 0, matrix.length, matrix[0].length, list);
      }
    }
    System.out.println(list);
    return list;
  }

  public void helper(int[][] matrix, int r, int c, int lenr, int lenc, ArrayList<Integer> list) {
    if (lenr > 0 && lenc > 0) {
      for (int j = c; j != c + lenc; j++) {
        list.add(matrix[r][j]);
      }
      for (int i = r + 1; i != r + lenr; i++) {
        list.add(matrix[i][c + lenc - 1]);
      }
      if (lenr > 1) {
        for (int j = c + lenc - 1 - 1; j >= c; j--) {
          list.add(matrix[r + lenr - 1][j]);
        }
      }
      if (lenc > 1) {
        for (int i = r + lenr - 1 - 1; i > r; i--) {
          list.add(matrix[i][c]);
        }
      }
      System.out.println(list);
      helper(matrix, r + 1, c + 1, lenr - 2, lenc - 2, list);
    }
  }
}
