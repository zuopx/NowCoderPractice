/**
 * 
 */

package com.percy.app;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * CountInSortedArrayTest
 */
public class CountInSortedArrayTest {

  int[] array;
  int k;
  @Before
  public void setUp(){
    // array = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    array = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
    k = 4;
  }
   @Test
  public void testIndex(){
    for(int i=0; i!=array.length; i++) {
      assertEquals(9 - i, CountInSortedArray.index(array, i));
    }
    assertEquals(-1, CountInSortedArray.index(array, 10));
  }

  public void testCount(){

  }
}