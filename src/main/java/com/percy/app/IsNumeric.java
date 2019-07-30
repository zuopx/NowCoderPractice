/**
 * 请实现一个函数用来判断字符串是否表示数值（包括整数和小数）。
 * 例如，字符串"+100","5e2","-123","3.1416"和"-1E-16"都表示数值。 
 * 但是"12e","1a3.14","1.2.3","+-5"和"12e+4.3"都不是。
 */

package com.percy.app;

/**
 * IsNumeric
 */
public class IsNumeric {

  /**
   * regex
   * @param str
   * @return
   */
  public static boolean isNumeric(char[] str) {
    StringBuffer sb = new StringBuffer();
    for (char ch : str) {
      sb.append(ch);
    }
    String string = sb.toString();
    String pattern1 = "(\\s*[+-]?)" + "((\\.\\d+)|(\\d+(\\.\\d+)?))" +
                      "([eE][+-]?\\d+)?";
    if (string.matches(pattern1)) {
      return true;
    } else {
      return false;
    }
  }
}