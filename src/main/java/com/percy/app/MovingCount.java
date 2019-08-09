/**
 * 机器人的运动范围
 */

package com.percy.app;

import java.awt.Point;
import java.util.Set;
import java.util.HashSet;

public class MovingCount {
  
  int count = 0;
  Set<Point> set = new HashSet<>();
  
  public int movingCount(int threshold, int rows, int cols)
  {
    moving(0, 0, threshold, rows, cols);
    return count;
  }
  
  public void moving(int r, int c, int threshold, int rows, int cols) {
    if (valid(r, c, threshold, rows, cols)) {
      if (!set.contains(new Point(r, c))) {
        count++;
        set.add(new Point(r, c));
        moving(r - 1, c, threshold, rows, cols);
        moving(r + 1, c, threshold, rows, cols);
        moving(r, c - 1, threshold, rows, cols);
        moving(r, c + 1, threshold, rows, cols);
      }
    }
  }
  
  public boolean valid(int r, int c, int threshold, int rows, int cols) {
    if (r >= 0 && r < rows && c >=0 && c < cols) {
      int s = 0;
      while (r != 0) {
        s += r % 10;
        r /= 10;
      }
      while (c != 0) {
        s += c % 10;
        c /= 10;
      }
      if (s <= threshold) {
        return true;
      }
    }
    return false;
  }
}