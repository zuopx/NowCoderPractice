/**
 * 
 */

package com.percy.app;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

/**
 * FindNumbersWithSumTest
 */
public class FindNumbersWithSumTest {

  int[] array;
  int sum;

  @Before
  public void setUp() {
    int length = 100;
    array = new int[length];
    for (int i = 0; i != length; i++) {
      array[i] = i;
    }
    sum = array[10] + array[length - 1];
  }

  @Test
  public void testFindNumbersWithSum() {
    List<Integer> list = new ArrayList<>();
    list = FindNumbersWithSum.findNumberWithSum(array, sum);
    System.out.println(list.toString());
  }
}