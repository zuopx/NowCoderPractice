/**
 * 
 */

package com.percy.app;

import org.junit.Before;
import org.junit.Test;

/**
 * PrintMatrixTest
 */
public class PrintMatrixTest {

  int[][] matrix;
  @Before
  public void setUp() {
    matrix = new int[4][4];
    matrix[0] = new int[] {1, 2, 3, 4};
    matrix[1] = new int[] {5, 6, 7, 8};
    matrix[2] = new int[] {9, 10, 11, 12};
    matrix[3] = new int[] {13, 14, 15, 16};
  }

  @Test
  public void testPrintMatrix() {
    new PrintMatrix().printMatrix(matrix);
  }
}