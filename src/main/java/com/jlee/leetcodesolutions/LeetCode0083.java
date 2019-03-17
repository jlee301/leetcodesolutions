package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.ListNode;

public class LeetCode0083 {
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
    ListNode dummy = new ListNode(0);
    ListNode curr = dummy;
    Integer prev = null;
    while(head != null) {
      if(prev == null) {
        // Setting first value
        prev = head.val;
        curr.next = head;
        head = head.next;
        curr = curr.next;        
      }
      else {
        if(prev != head.val) {
          prev = head.val;
          curr.next = head;
          head = head.next;
          curr = curr.next;
        }
        else {
          // Skip because we already recorded this value
          head = head.next;
        }
      }
    }
    // Setting last value which should be null
    curr.next = head;
    return dummy.next;
  } 
}
