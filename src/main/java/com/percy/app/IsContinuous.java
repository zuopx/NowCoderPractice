/**
 * 
 */

package com.percy.app;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * IsContinuous
 */
public class IsContinuous {

  public static boolean isContinuous(int[] array) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int var : array) {
      map.put(var, map.getOrDefault(var, 0) + 1);
    }
    int zeroNum = map.getOrDefault(0, 0);
    SortedSet<Integer> set = new TreeSet<>(map.keySet());
    if (set.contains(0)) {
      set.remove(0);
    }
    if (!set.isEmpty()) {
      switch (zeroNum) {
      case 0:
        if (set.last() - set.first() <= 4 && set.size() == 5) {
          return true;
        }
        break;
      case 1:
        if (set.last() - set.first() <= 4 && set.size() == 4) {
          return true;
        }
        break;
      case 2:
        if (set.last() - set.first() <= 4 && set.size() == 3) {
          return true;
        }
        break;
      case 3:
        if (set.last() - set.first() <= 4 && set.size() == 2) {
          return true;
        }
        break;
      case 4:
        return true;
      default:
        break;
      }
    }
    return false;
  }
}