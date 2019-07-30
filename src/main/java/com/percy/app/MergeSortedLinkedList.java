/**
 * 
 */

package com.percy.app;

/**
 * MergeSortedLinkedList
 */
public class MergeSortedLinkedList {

  public static ListNode merge(ListNode list1, ListNode list2) {
    if (list1 == null) {
      return list2;
    } else if (list2 == null) {
      return list1;
    } else {
      ListNode head;
      ListNode current;
      if (list1.val <= list2.val) {
        head = list1;
        list1 = list1.next;
      } else {
        head = list2;
        list2 = list2.next;
      }
      current = head;
      while (list1 != null && list2 != null) {
        if (list1.val <= list2.val) {
          current.next = list1;
          list1 = list1.next;
        } else {
          current.next = list2;
          list2 = list2.next;
        }
        current = current.next;
      }
      if (list1 == null) {
        current.next = list2;
      } else {
        current.next = list1;
      }
      return head;
    }
  }
}
