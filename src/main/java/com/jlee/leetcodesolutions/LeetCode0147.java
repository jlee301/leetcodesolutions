package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.ListNode;

public class LeetCode0147 {
  /*
   * Sort a linked list using insertion sort.
   * 
   * https://leetcode.com/problems/insertion-sort-list/description/
   */
  public ListNode insertionSortList(ListNode head) {
    ListNode temp = new ListNode(0);
    // Loop until end of input list
    while(head != null) {
      // Loop through sorted list for position to insert node
      ListNode sort = temp;
      while(sort.next != null && sort.next.val < head.val)
        sort = sort.next;
      
      // Preserve the next value from input list
      ListNode next = head.next;
      head.next = sort.next;
      sort.next = head;
      
      // Set head to the preserved next for next loop iteration
      head = next;
    }
    return temp.next;
  }
}
