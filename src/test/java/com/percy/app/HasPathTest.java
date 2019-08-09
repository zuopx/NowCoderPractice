/**
 * 
 */

package com.percy.app;

import org.junit.Test;

/**
 * HasPathTest
 */
public class HasPathTest {

  @Test
  public void testHasPath() {
    char[] matrix = new char[] {'a', 'b', 'c', 'e', 's', 'f', 'c', 's', 'a',
                                'd', 'e', 'e'};
    // char[] str = new char[] {'b', 'c', 'c', 'e', 'd'};
    char[] str = new char[] {'a', 'b', 'c', 'b'};
    HasPath hp = new HasPath();
    boolean b = hp.hasPath(matrix, 3, 4, str);
    System.out.println(b);
  }
}