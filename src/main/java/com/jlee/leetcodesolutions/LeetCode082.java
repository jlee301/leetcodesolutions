package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.ListNode;

public class LeetCode082 {
  /*
   * Given a sorted linked list, delete all nodes that have duplicate numbers,
   * leaving only distinct numbers from the original list.
   * 
   * For example, 
   * Given 1->2->3->3->4->4->5, return 1->2->5. 
   * Given 1->1->1->2->3, return 2->3.
   * 
   * https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/description/
   */
  public ListNode deleteDuplicates(ListNode head) {
    if(head == null || head.next == null)
      return head;
    
    ListNode dummy = new ListNode(0), curr = dummy;
    int prev = Integer.MAX_VALUE;
    while(head != null) {
      if(head.val != prev && (head.next == null || head.val != head.next.val)) {
        curr.next = new ListNode(head.val);
        curr = curr.next;
      }
      prev = head.val;
      head = head.next;
    }
    return dummy.next;
  }
}
