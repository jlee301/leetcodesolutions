package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.ListNode;

public class LeetCode086 {
  /*
   * Given a linked list and a value x, partition it such that all nodes less than
   * x come before nodes greater than or equal to x.
   * 
   * You should preserve the original relative order of the nodes in each of the
   * two partitions.
   * 
   * For example, 
   * Given 1->4->3->2->5->2 and x = 3, 
   * return 1->2->2->4->3->5.
   * 
   * https://leetcode.com/problems/partition-list/description/
   */
  public ListNode partition(ListNode head, int x) {
    if(head == null || head.next == null)
      return head;
    
    ListNode dummyA = new ListNode(0), currA = dummyA;
    ListNode dummyB = new ListNode(0), currB = dummyB;
    while(head != null) {
      if(head.val < x) {
        currA.next = new ListNode(head.val);
        currA = currA.next;
      } else {
        currB.next = new ListNode(head.val);
        currB = currB.next;
      }
      head = head.next;
    }
    currA.next = dummyB.next;
    return dummyA.next;
  }
}
