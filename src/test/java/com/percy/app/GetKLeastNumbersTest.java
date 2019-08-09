/**
 * 
 */

package com.percy.app;

import org.junit.Test;

/**
 * GetKLeastNumbersTest
 */
public class GetKLeastNumbersTest {

  @Test
  public void testGetLeastNumbers() {
    int[] input = new int[] { 4, 5, 1, 6, 2, 7, 3, 8 };
    int k = 4;
    new GetKLeastNumbers().getLeastNumbers(input, k);
  }
}