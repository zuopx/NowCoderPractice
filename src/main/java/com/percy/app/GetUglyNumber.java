/**
 * 
 */

package com.percy.app;

import java.util.LinkedList;
import java.util.Queue;

/**
 * GetUglyNumber
 */
public class GetUglyNumber {

  public int getUglyNumber(int k) {
    Queue<Integer> queue2 = new LinkedList<>();
    Queue<Integer> queue3 = new LinkedList<>();
    Queue<Integer> queue5 = new LinkedList<>();
    queue2.offer(2);
    queue3.offer(3);
    queue5.offer(5);
    int min = 1;
    while (k > 1) {
      min = Integer.min(queue2.peek(), Integer.min(queue3.peek(), queue5.peek()));
      if (queue2.peek() == min) {
        queue2.poll();
      }
      if (queue3.peek() == min) {
        queue3.poll();
      }
      if (queue5.peek() == min) {
        queue5.poll();
      }
      System.out.println(min);
      System.out.println(queue2);
      System.out.println(queue3);
      System.out.println(queue5);
      queue2.offer(2 * min);
      queue3.offer(3 * min);
      queue5.offer(5 * min);
      k--;
    }
    return min;
  }
}