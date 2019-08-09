/**
 * 
 */

package com.percy.app;

import org.junit.Test;

/**
 * MovingCountTest
 */
public class MovingCountTest {

  @Test
  public void testMovingCount() {
    MovingCount mc = new MovingCount();
    mc.movingCount(5, 10, 10);
    System.out.println(mc.count);
  }
}