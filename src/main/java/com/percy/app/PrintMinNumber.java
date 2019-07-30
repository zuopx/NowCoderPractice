/**
 * 
 */

package com.percy.app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * PrintMinNumber
 */
public class PrintMinNumber {

  public String printMinNumber(int[] numbers) {
    List<String> list = new ArrayList<>();
    for (int var : numbers) {
      list.add(Integer.toString(var));
    }

    Collections.sort(list, new TwoStringsComparator());

    StringBuffer result = new StringBuffer();
    for (String var : list) {
      result.append(var);
    }
    return result.toString();
  }

  /**
   * TwoStringsComparator
   */
  public class TwoStringsComparator implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
      return (o1 + o2).compareTo((o2 + o1));
    }
  }
}