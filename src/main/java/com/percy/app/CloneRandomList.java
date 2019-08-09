/**
 * 
 */

package com.percy.app;

import java.util.Map;
import java.util.HashMap;

public class CloneRandomList {
  public RandomListNode Clone(RandomListNode pHead) {
    Map<RandomListNode, RandomListNode> map = new HashMap<>();
    RandomListNode head = part1(pHead, map);
    part2(pHead, head, map);
    return head;
  }

  private void part2(RandomListNode head, RandomListNode head2, Map<RandomListNode, RandomListNode> map) {
    while (head != null) {
      head2.random = map.get(head.random);
      head = head.next;
      head2 = head2.next;
    }
  }

  RandomListNode part1(RandomListNode pHead, Map<RandomListNode, RandomListNode> map) {
    RandomListNode head = null;
    if (pHead != null) {
      head = new RandomListNode(pHead.label);
      map.put(pHead, head);
      pHead = pHead.next;
    }

    RandomListNode current = head;
    while (pHead != null) {
      current.next = new RandomListNode(pHead.label);
      map.put(pHead, current.next);
      pHead = pHead.next;
      current = current.next;
    }
    return head;
  }
}

class RandomListNode {
  int label;
  RandomListNode next = null;
  RandomListNode random = null;

  RandomListNode(int label) {
    this.label = label;
  }
}