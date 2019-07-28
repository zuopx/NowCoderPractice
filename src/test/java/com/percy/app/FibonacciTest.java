/**
 * 
 */

package com.percy.app;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * FibonacciTest
 */
public class FibonacciTest {

  int n;

  @Before
  public void setUp() {
    n = 10;
  }

  @Test
  public void testfibonacciIteration() {
    for(int i=0; i!=10; i++) {
      assertEquals(Fibonacci.fibonacciRecursion(i),
                  Fibonacci.fibonacciIteration(i));
    }
  }
}