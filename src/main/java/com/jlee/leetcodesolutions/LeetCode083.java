package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.ListNode;

public class LeetCode083 {
  /*
   * Given a sorted linked list, delete all duplicates such that each element
   * appear only once.
   * 
   * For example:
   * Given 1->1->2, return 1->2. 
   * Given 1->1->2->3->3, return 1->2->3.
   * 
   * https://leetcode.com/problems/remove-duplicates-from-sorted-list/description/
   */
  public ListNode deleteDuplicates(ListNode head) {
    // head.val == head.next.val --> head.next = head.next.next
    // head.val != head.next.val --> head = head.next
    // head.next == null --> done
    // head == null --> done
    ListNode current = head;
    
    while(current != null && current.next != null) {
      if(current.val == current.next.val) {
        current.next = current.next.next;
      } else {
        current = current.next;
      }
    }
    return head;
  }  
}
