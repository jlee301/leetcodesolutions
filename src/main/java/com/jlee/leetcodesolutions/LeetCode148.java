package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.ListNode;

public class LeetCode148 {
  /*
   * Sort a linked list in O(n log n) time using constant space complexity.
   * 
   * https://leetcode.com/problems/sort-list/description/
   */
  public ListNode sortList(ListNode head) {
    if(head == null || head.next == null)
      return head;
    
    ListNode prev = null, slow = head, fast = head;
    // Find the mid point in order to split into two lists
    while(fast != null && fast.next != null) {
      prev = slow;
      slow = slow.next;
      fast = fast.next.next;
      // This loop will end with slow being at the beginning of the 2nd half list.
    }
    prev.next = null;
    
    // This recursion will eventually break it down to two node comparison. So when
    // using mergeLists, it will be ordered ascending.
    ListNode node1 = sortList(head);
    ListNode node2 = sortList(slow);
    return mergeLists(node1, node2);
  }
  
  /*
   *  This function assumes the two lists are sorted ascending
   */
  private ListNode mergeLists(ListNode node1, ListNode node2) {
    ListNode temp = new ListNode(0), curr = temp;
    while(node1 != null && node2 != null) {
      if(node1.val < node2.val) {
        curr.next = node1;
        node1 = node1.next;
      } else {
        curr.next = node2;
        node2 = node2.next;
      }
      curr = curr.next;
    }
    if(node1 != null)
      curr.next = node1;
    
    if(node2 != null)
      curr.next = node2;
    
    return temp.next;
  }
}
