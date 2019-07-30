/**
 * 
 */

package com.percy.app;

import org.junit.Before;
import org.junit.Test;

/**
 * PrintMinNumberTest
 */
public class PrintMinNumberTest {

  int[] numbers;

  @Before
  public void setUp() {
    numbers = new int[] { 3, 32, 321 };
  }

  @Test
  public void testPrintMinNumber() {
    String str = new PrintMinNumber().printMinNumber(numbers);
    System.out.println(str);
  }
}