/**
 * 
 */

package com.percy.app;

import org.junit.Before;
import org.junit.Test;

/**
 * StrToIntTest
 */
public class StrToIntTest {

  @Before
  public void setUp() {
    
  }

  @Test
  public void testStrToInt() {
    System.out.println(StrToInt.strToInt("1a33"));
    System.out.println(StrToInt.strToInt("+214748364"));
    System.out.println(StrToInt.strToInt("-2147483648"));
    System.out.println(Integer.MAX_VALUE);
  }
}