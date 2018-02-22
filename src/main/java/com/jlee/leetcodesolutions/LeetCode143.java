package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.ListNode;
import java.util.ArrayList;
import java.util.List;

public class LeetCode143 {
  /*
   * Given a singly linked list L: L0 → L1 → … → Ln-1 → Ln,
   * reorder it to: L0 → Ln → L1 → Ln-1 → L2 → Ln-2 → …
   * 
   * You must do this in-place without altering the nodes' values.
   * 
   * For example, 
   * Given {1,2,3,4}, reorder it to {1,4,2,3}.
   * 
   * https://leetcode.com/problems/reorder-list/description/
   */
  public void reorderList(ListNode head) {
    if(head == null)
      return;
    
    List<ListNode> list = new ArrayList<>();
    while(head != null) {
      list.add(head);
      head = head.next;
    }
    
    int start = 0, end = list.size()-1;
    // when end-start == 1 it means there are two nodes left and are already in
    // places (even number of nodes).
    while(start < end && end-start > 1) {
      list.get(end).next = list.get(start).next;
      list.get(start).next = list.get(end);
      list.get(end-1).next = null;
      start++;
      end--;
    }
  }
}
