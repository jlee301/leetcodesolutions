package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.ListNode;

public class LeetCode328 {
  /*
   * Given a singly linked list, group all odd nodes together followed by the even
   * nodes. Please note here we are talking about the node number and not the
   * value in the nodes.
   * 
   * You should try to do it in place. The program should run in O(1) space
   * complexity and O(nodes) time complexity.
   * 
   * Example:
   * Given 1->2->3->4->5->NULL,
   * return 1->3->5->2->4->NULL.
   * 
   * Note:
   * 1. The relative order inside both the even and odd groups should remain as it
   * was in the input.
   * 2. The first node is considered odd, the second node even and so on ...
   * 
   * https://leetcode.com/problems/odd-even-linked-list/description/
   */
  public ListNode oddEvenList(ListNode head) {
    if(head == null || head.next == null)
      return head;
    
    ListNode odds = head, evens = head.next;
    ListNode tempOddsStart = odds;
    ListNode tempEvenStart = evens;
    
    int nodeCount = 3;
    head = head.next.next;
    while(head != null) {
      if(nodeCount % 2 != 0) {
        // odds
        odds.next = head;
        odds = odds.next;
      } else {
        // evens
        evens.next = head;
        evens = evens.next;
      }
      head = head.next;
      nodeCount++;
    }
    // If even count when the loop ends, need to set evens.next to null.
    if(nodeCount % 2 == 0)
      evens.next = null;
    
    // Connect the end of odds to start of evens.
    odds.next = tempEvenStart;
    return tempOddsStart;
  }
}
