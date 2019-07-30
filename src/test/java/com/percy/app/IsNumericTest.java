/**
 * 
 */

package com.percy.app;

import org.junit.Test;

/**
 * IsNumericTest
 */
public class IsNumericTest {

  @Test
  public void testIsNumeric() {
    String[] strings = new String[] {
      "+100", "5e2", "-123", "3.1416", "-1E-16", "-.123",
      "12e", "1a3.14", "1.2.3", "+-5", "12e+4.3"
    };
    for (String str : strings) {
      System.out.print(str + ":\t");
      System.out.println(IsNumeric.isNumeric(str.toCharArray()));
    }
  }
}