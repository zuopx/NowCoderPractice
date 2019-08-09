package com.percy.app;

import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.LinkedList;
import java.util.Iterator;

public class DeleteDuplication {
  public ListNode deleteDuplication(ListNode pHead) {
    ListNode head = null;
    List<ListNode> list = new LinkedList<>();
    Set<Integer> set1 = new HashSet<>();
    Set<Integer> set2 = new HashSet<>();
    while (pHead != null) {
      list.add(pHead);
      if (set1.contains(pHead.val)) {
        set2.add(pHead.val);
      } else {
        set1.add(pHead.val);
      }
      pHead = pHead.next;
    }
    for (Iterator<ListNode> iter = list.iterator(); iter.hasNext();) {
      if (set2.contains(iter.next().val)) {
        iter.remove();
      }
    }
    for (int i = 0; i < list.size() - 1; i++) {
      list.get(i).next = list.get(i + 1);
    }
    if (!list.isEmpty()) {
      head = list.get(0);
      list.get(list.size() - 1).next = null;
    }
    return head;
  }
}