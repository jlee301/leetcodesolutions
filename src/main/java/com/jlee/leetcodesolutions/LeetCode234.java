package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.ListNode;
import java.util.ArrayList;

public class LeetCode234 {
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
    ArrayList<Integer> list = new ArrayList<Integer>();
    while(head != null) {
      list.add(head.val);
      head = head.next;
    }
    int begin = 0;
    int end = list.size() - 1;
    while (begin <= end) {
      if(list.get(begin) != list.get(end))
        return false;
      else {
        begin++;
        end--;
      }
    }
    return true;
  }
  
  public boolean isPalindromeNoList(ListNode head) {
    ListNode fast = head;
    ListNode slow = head;
    
    // 1 --> 2 --> null
    // 1 --> 2 --> 3 --> null
    while(fast != null && fast.next != null) {
      fast = fast.next.next;
      slow = slow.next;
    }
    
    // Odd number of nodes, let the right half be smaller.
    if(fast != null)
      slow = slow.next;
    
    slow = reverse(slow);
    fast = head;
    
    while(slow != null) {
      if(fast.val != slow.val)
        return false;
      else {
        fast = fast.next;
        slow = slow.next;
      }
    }
    return true;
  }

  /*
   * The reverse function is to give us the right half of the LinkedList with the
   * head at the end and the having null set to when it was passed
   * 
   * 1 --> 2 --> 3 --> 4 --> null 
   * sf
   * 
   * 1 --> 2 --> 3 --> 4 --> null 
   *             s           f
   * 
   * 1 --> 2     null <-- 3 <-- 4 
   * f                          s
   */
  public ListNode reverse(ListNode head) {
    ListNode previous = null;
    while(head != null) {
      ListNode tempNext = head.next;
      head.next = previous;
      previous = head;
      head = tempNext;
    }
    return previous;
  }
}
