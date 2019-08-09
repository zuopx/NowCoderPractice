/**
 * 输入n个整数，找出其中最小的K个数。
 */

package com.percy.app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

/**
 * GetKLeastNumbers
 */
public class GetKLeastNumbers {

  PriorityQueue<Integer> pq;

  public ArrayList<Integer> getLeastNumbers(int[] input, int k) {

    ArrayList<Integer> list = new ArrayList<>();
    pq = new PriorityQueue<>(k, Collections.reverseOrder());
    addAll(input, k);
    while (!pq.isEmpty()) {
      list.add(pq.poll());
    }
    return list;
  }

  private void addAll(int[] input, int k) {
    for (int var : input) {
      add(var, k);
      System.out.println(pq);
    }
  }

  private void add(int var, int k) {
    if (pq.size() < k) {
      pq.offer(var);
    } else {
      if (var < pq.peek()) {
        pq.poll();
        pq.offer(var);
      }
    }
  }
}