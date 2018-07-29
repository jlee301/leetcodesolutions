package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.ListNode;
import java.util.ArrayList;
import java.util.List;

public class LeetCode876 {
  /*
   * Given a non-empty, singly linked list with head node head, return a middle
   * node of linked list.
   * 
   * If there are two middle nodes, return the second middle node.
   * 
   * https://leetcode.com/contest/weekly-contest-95/problems/middle-of-the-linked-list/
   */
  public ListNode middleNode(ListNode head) {
    // Store nodes into a list.
    List<ListNode> list = new ArrayList<>();
    ListNode dummy = head;
    while(dummy != null) {
      list.add(dummy);
      dummy = dummy.next;
    }
    // Return the middle index of the list
    return list.get(list.size() / 2);
  }
}
