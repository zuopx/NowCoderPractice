/**
 * 
 */

package com.percy.app;

/**
 * Fibonacci
 */
public class Fibonacci {

  public static int fibonacciRecursion(int n) {
    if (n == 0) {
      return 0;
    } else if (n == 1) {
      return 1;
    } else {
      return fibonacciRecursion(n - 1) + fibonacciRecursion(n - 2);
    }
  }

  public static int fibonacciIteration(int n) {
    if (n == 0) {
      return 0;
    } else {
      int prev = 0;
      int current = 1;
      for(int i=1; i!=n; i++) {
        current += prev;
        prev = current - prev;
      }
      return current;
    }
  }
}