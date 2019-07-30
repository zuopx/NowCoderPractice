/**
 * Two numbers.
 */

package com.percy.app;

import java.util.Comparator;

/**
 * TwoNumbers
 */
public class TwoNumbers implements Comparator<TwoNumbers> {

  int a, b, product;

  public TwoNumbers() {
  }

  public TwoNumbers(int a, int b) {
    this.a = a;
    this.b = b;
    product = a * b;
  }

  @Override
  public int compare(TwoNumbers o1, TwoNumbers o2) {
    return o1.product - o2.product;
  }
}