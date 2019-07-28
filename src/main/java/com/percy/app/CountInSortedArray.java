/**
 * 
 */

package com.percy.app;

/**
 * CountInSortedArray
 */
public class CountInSortedArray {

  public static int count(int[] array, int k) {
    int count = 0;
    int index = index(array, k);
    if (index != -1) {
      count++;
      for (int i = index - 1; i >= 0; i--) {
        if (array[i] == k) {
          count++;
        }
      }
      for (int i = index + 1; i <= array.length - 1; i++) {
        if (array[i] == k) {
          count++;
        }
      }
    }
    return count;
  }

  public static int index(int[] array, int k) {
    if (array.length == 0) {
      return -1;
    }
    boolean reverse = false;
    if (array[0] > array[array.length - 1]) {
      reverse = true;
    }
    int low = 0;
    int high = array.length;
    while (high > low) {
      int midean = (low + high) / 2;
      int value = array[midean];
      if (value == k) {
        return midean;
      } else {
        if (value < k) {
          if (reverse) {
            high = midean;
          } else {
            low = midean + 1;
          }
        } else {
          if (reverse) {
            low = midean + 1;
          } else {
            high = midean;
          }
        }
      }
    }
    return -1;
  }
}