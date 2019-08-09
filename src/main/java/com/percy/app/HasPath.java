/**
 * The path in matrix
 */

package com.percy.app;

import java.awt.Point;
import java.util.Stack;

/**
 * HasPath
 */
public class HasPath {

  Stack<Point> stack;
  char[] matrix;
  int rows;
  int cols;
  char[] str;

  public boolean hasPath(char[] matrix, int rows, int cols, char[] str) {
    constructor(matrix, rows, cols, str);
    for (int i = 0; i != rows; i++) {
      for (int j = 0; j != cols; j++) {
        stack.clear();
        if (helper(i, j)) {
          return true;
        }
      }
    }
    return false;
  }

  private boolean helper(int i, int j) {
    if (stack.size() == str.length) {
      return true;
    } else {
      if (i >= 0 && i < rows && j >= 0 && j < cols) {
        System.out.printf("(%d, %d)\n", i, j);
        Point p = new Point(i, j);
        if (!stack.contains(p)) {
          if (matrix[cols * i + j] == str[stack.size()]) {
            stack.push(p);
            System.out.println(stack);
            if (helper(i - 1, j) || helper(i + 1, j) || helper(i, j - 1) || helper(i, j + 1)) {
              return true;
            } else {
              stack.pop();
            }
          }
        }
      }
    }
    return false;
  }

  public void constructor(char[] matrix, int rows, int cols, char[] str) {
    stack = new Stack<>();
    this.matrix = matrix;
    this.rows = rows;
    this.cols = cols;
    this.str = str;
  }
}