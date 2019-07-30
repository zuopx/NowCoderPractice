/**
 * Two numbers which's sum is S.
 */

package com.percy.app;

import java.util.ArrayList;
import java.util.Collections;

/**
 * FindNumbersWithSum
 */
public class FindNumbersWithSum {

  public static ArrayList<Integer> findNumberWithSum(int[] array, int sum) {
    ArrayList<TwoNumbers> list = new ArrayList<>();

    for (int i = 0; i != array.length; i++) {
      int a = array[i];
      int b = sum - a;
      int index = CountInSortedArray.index(array, b);
      if (index != -1) {
        list.add(new TwoNumbers(a, b));
      }
    }

    ArrayList<Integer> ret = new ArrayList<>();
    if (!list.isEmpty()) {
      TwoNumbers result = Collections.min(list, new TwoNumbers());
      ret.add(Integer.min(result.a, result.b));
      ret.add(Integer.max(result.a, result.b));
    }
    return ret;
  }
}