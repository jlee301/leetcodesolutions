package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.ListNode;

public class LeetCode0234 {
  /*
   * Given a singly linked list, determine if it is a palindrome.
   * 
   * Follow up:
   * Could you do it in O(n) time and O(1) space?
   * 
   * [1,1,1], true
   * [1,0,0], false
   * [1,0,1], true
   * [-1,0,-1], true
   * [-1,-1,-1], true
   * 
   * https://leetcode.com/problems/palindrome-linked-list/description/
   */
  public boolean isPalindrome(ListNode head) {
    // Find mid point of linked list
    ListNode slow = head;
    ListNode fast = head;
    while(fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    
    // 1 -> 2 -> 2 -> 1 -> null       1 -> 2 -> 3 -> 2 -> 1 -> null
    // sf                             sf
    //      s    f                         s    f
    //           s         f                    s         f
    //                                               s <-- increment because odds based
    // Meaning the linked list is odds length
    if(fast != null)
      slow = slow.next;
    
    // Now reverse the 2nd half of the list from slow
    ListNode prev = null;
    while(slow != null) {
      ListNode next = slow.next;
      slow.next = prev;
      prev = slow;
      slow = next;
    }
    
    // Now head and prev are on opposite sides of the linked list
    while(prev != null) {
      if(head.val != prev.val)
        return false;
      
      head = head.next;
      prev = prev.next;
    }
    return true;
  }
}
