package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.ListNode;
import java.util.ArrayList;
import java.util.Collections;

public class LeetCode061 {
  /*
   * Given a list, rotate the list to the right by k places, where k is
   * non-negative.
   * 
   * Example:
   * Given 1->2->3->4->5->NULL and k = 2,
   * return 4->5->1->2->3->NULL.
   */
  public ListNode rotateRight(ListNode head, int k) {
    if(head == null)
      return head;
    
    ArrayList<ListNode> list = new ArrayList<>();
    ListNode current = head;
    while(current != null) {
      list.add(current);
      current = current.next;
    }
    Collections.reverse(list);
    int rotate = k % list.size();
    
    if(rotate == 0)
      return head;
    
    list.get(rotate).next = null;
    list.get(0).next = list.get(list.size()-1);
    return list.get(rotate-1);
  }
}
