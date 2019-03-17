package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.ListNode;

public class LeetCode0092 {
  /*
   * Reverse a linked list from position m to n. Do it in-place and in one-pass.
   * 
   * For example: 
   * Given 1->2->3->4->5->NULL, m = 2 and n = 4,
   * return 1->4->3->2->5->NULL.
   * 
   * Note: Given m, n satisfy the following condition: 1 ≤ m ≤ n ≤ length of list.
   * 
   * https://leetcode.com/problems/reverse-linked-list-ii/description/
   */
  public ListNode reverseBetween(ListNode head, int m, int n) {
    if(head == null)
      return head;
    
    ListNode dummy = new ListNode(0), before = dummy;
    dummy.next = head;
    
    // before is the node before reversing happens
    for(int i = 1; i < m; i++)
      before = before.next;
    
    ListNode first = before.next;
    ListNode second = first.next;
    
    /*
     *  0 --> 1 --> 2 --> 3 --> 4 --> 5 --> null
     *  ^     ^     ^     ^
     * dum   bef   1st   2nd
     *  
     *  0 --> 1 --> 3 --> 2 --> 4 --> 5 --> null
     *  ^     ^           ^     ^
     * dum   bef         1st   2nd
     *       
     *  0 --> 1 --> 4 --> 3 --> 2 --> 5 --> null
     *  ^     ^                 ^     ^
     * dum   bef               1st   2nd
     */
    for(int i = 0; i < n-m; i++) {
      first.next = second.next;
      second.next = before.next;
      before.next = second;
      second = first.next;
    }
    return dummy.next;
  }
}
