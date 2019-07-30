/**
 * Given a push sequence and a pop sequence, judge whether they match.
 */

package com.percy.app;

import java.util.Stack;

/**
 * IsPopOrder
 */
public class IsPopOrder {

  /**
   * Use stack to simulate the process.
   * 
   * @param push
   * @param pop
   * @return
   */
  public static boolean isPopOrder(int[] push, int[] pop) {
    Stack<Integer> stack = new Stack<>();
    int j = 0;
    for (int i = 0; i != push.length; i++) {
      stack.push(push[i]);
      while (!stack.isEmpty() && stack.peek().equals(pop[j])) {
        stack.pop();
        j++;
      }
    }
    return stack.isEmpty();
  }
}