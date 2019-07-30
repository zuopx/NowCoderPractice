/**
 * 
 */

package com.percy.app;

/**
 * MoreThanHalf
 */
public class MoreThanHalf {

  public static int moreThanHalf(int[] array) {
    int aim = 0;
    int count = 0;
    for (int i = 0; i != array.length; i++) {
      if (array[i] == aim) {
        count++;
      } else {
        count--;
      }
      if(count <= 0) {
        aim = array[i];
        count = 1;
      }
    }
    count = 0;
    for (int i = 0; i != array.length; i++) {
      if (array[i] == aim) {
        count++;
      }
    }
    if (count <= array.length / 2) {
      aim = 0;
    }
    return aim;
  }
}