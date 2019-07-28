/**
 * 孩子们的游戏(圆圈中最后剩下的数)
 */

package com.percy.app;

import java.util.ArrayList;
import java.util.List;

/**
 * LastRemaining
 */
public class LastRemaining {

  public static int lastRemaining(int n, int m) {
    List<Integer> list = new ArrayList<>();
    for (int i = 0; i != n; i++) {
      list.add(i);
    }
    int start = 0;
    while(list.size() != 1) {
      int index = (start + m - 1) % list.size();
      list.remove(index);
      start = index % list.size();
    }
    return list.get(0).intValue();
  }
}