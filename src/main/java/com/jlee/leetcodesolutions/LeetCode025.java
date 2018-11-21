package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.ListNode;

public class LeetCode025 {
  /*
   * Given a linked list, reverse the nodes of a linked list k at a time and
   * return its modified list.
   * 
   * k is a positive integer and is less than or equal to the length of the linked
   * list. If the number of nodes is not a multiple of k then left-out nodes in
   * the end should remain as it is.
   * 
   * https://leetcode.com/problems/reverse-nodes-in-k-group/
   */
  public ListNode reverseKGroup(ListNode head, int k) {
    if(head == null || k < 2)
      return head;
    
    ListNode[] data = new ListNode[k];
    ListNode dummy = new ListNode(0);
    dummy.next = head;
    ListNode curr = dummy;
    
    int i = 0;
    while(head != null) {
      data[i++] = head;
      head = head.next;
      
      if(i == k) {
        for(int j = k - 1; j >= 0; j--) {
          curr.next = data[j];
          curr = curr.next;
        }
        curr.next = head;
        i = 0;
      }
    }
    return dummy.next;
  }
}
