/**
 * 字符串转数字
 * 考察对字符的操作
 */

package com.percy.app;

import java.util.ArrayList;
import java.util.List;

/**
 * StrToInt
 */
public class StrToInt {

  public static int strToInt(String str) {
    long result = 0;
    long flag = 1;
    List<Integer> list = new ArrayList<>();

    // read the first non-space char
    int i;
    char ch;
    for (i = 0; i != str.length(); i++) {
      ch = str.charAt(i);
      if (!Character.isWhitespace(ch)) {
        if (ch == '+') {
          break;
        } else if (ch == '-') {
          flag *= -1;
          break;
        } else if (Character.isDigit(ch)) {
          list.add(ch - '0');
          break;
        } else {
          return Math.toIntExact(result);
        }
      }
    }

    for (i++; i < str.length(); i++) {
      ch = str.charAt(i);
      if (Character.isDigit(ch)) {
        list.add(ch - '0');
      } else {
        return Math.toIntExact(result);
      }
    }

    for (i = 0; i != list.size(); i++) {
      result += list.get(i) * Math.pow(10, list.size() - i - 1);
    }
    return Math.toIntExact(result * flag);
  }
}