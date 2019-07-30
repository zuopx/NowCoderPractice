/**
 * 
 */

package com.percy.app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * FindContinuousSequence
 */
public class FindContinuousSequence {
  public ArrayList<ArrayList<Integer>> findContinuousSequence(int sum) {
    ArrayList<ArrayList<Integer>> list = new ArrayList<>();
    int max_n = (int) Math.sqrt(2 * sum) - 1;
    for (int n = 1; n <= max_n; n++) {
      if ((2 * sum - n * (n + 1)) % (2 * (n + 1)) == 0) {
        ArrayList<Integer> tmp = new ArrayList<>();
        int a = (2 * sum - n * (n + 1)) / (2 * (n + 1));
        for (int i = 0; i != n + 1; i++) {
          tmp.add(a + i);
        }
        list.add(tmp);
      }
    }
    Collections.sort(list, new ListComparator());
    return list;
  }

  public class ListComparator implements Comparator<ArrayList<Integer>> {

    @Override
    public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) {
      return o1.get(0) - o2.get(0);
    }
  }
}