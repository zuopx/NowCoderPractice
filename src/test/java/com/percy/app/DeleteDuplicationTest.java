/**
 * 
 */

package com.percy.app;

import org.junit.Before;
import org.junit.Test;

/**
 * DeleteDuplicationTest
 */
public class DeleteDuplicationTest {

  ListNode head;

  @Before
  public void setUp() {
    int size = 8;
    ListNode[] nodes = new ListNode[size];
    int[] array = new int[] { 1, 1, 2, 3, 3, 4, 5, 5 };
    for (int i = 0; i != size; i++) {
      nodes[i] = new ListNode(array[i]);
    }
    for (int i = 0; i != size - 1; i++) {
      nodes[i].next = nodes[i + 1];
    }
    head = nodes[0];
  }

  @Test
  public void testDeleteDuplication() {

    new DeleteDuplication().deleteDuplication(head);
  }
}