package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.ListNode;

public class LeetCode0025 {
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
    if(head == null || head.next == null || k < 2)
      return head;
    
    ListNode dummy = new ListNode(0);
    ListNode curr = dummy;
    ListNode tail = head;
    int count = 0;
    while(head != null) {
      count++;
      if(count == k) {
        // Reverse nodes        
        // Store location of head next
        // Store location of rear, this will be used to know where to continue next
        ListNode temp = head.next;
        ListNode last = tail;
                
        // Move pointers around to reverse the nodes
        ListNode next = tail;
        while(next != temp) {
          ListNode prev = tail;
          tail = next == tail ? tail.next : next;
          next = tail.next;
          tail.next = prev;
        }
        curr.next = head;
        curr = last;
        head = temp;
        tail = temp;
        count = 0;
      }
      else {
        head = head.next;
      }
    }
    curr.next = tail;
    return dummy.next;
  }
}
