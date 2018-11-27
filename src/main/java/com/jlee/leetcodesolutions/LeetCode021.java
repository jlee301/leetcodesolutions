package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.ListNode;

public class LeetCode021 {
  /*
   * Merge two sorted linked lists and return it as a new list. The new list
   * should be made by splicing together the nodes of the first two lists.
   * 
   * Input: 1->2->4, 1->3->4 
   * Output: 1->1->2->3->4->4
   * 
   * https://leetcode.com/problems/merge-two-sorted-lists/description/
   */
  public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    ListNode dummy = new ListNode(0);
    ListNode curr = dummy;
    while(l1 != null && l2 != null) {
      if(l1.val <= l2.val) {
        curr.next = l1;
        l1 = l1.next;
      }
      else {
        curr.next = l2;
        l2 = l2.next;
      }
      curr = curr.next;
    }
    
    // Connect the remaining nodes
    if(l1 != null)
      curr.next = l1;
    else
      curr.next = l2;

    return dummy.next;
  }
}
