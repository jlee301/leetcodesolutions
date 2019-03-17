package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.ListNode;
import java.util.ArrayList;
import java.util.List;

public class LeetCode0142 {
  /*
   * Given a linked list, return the node where the cycle begins. If there is no
   * cycle, return null.
   * 
   * Note: Do not modify the linked list.
   * Follow up: Can you solve it without using extra space?
   * 
   * https://leetcode.com/problems/linked-list-cycle-ii/description/
   */
  public ListNode detectCycle(ListNode head) {
    List<ListNode> list = new ArrayList<>();
    while(head != null) {
      if(list.contains(head))
        return head;
      
      list.add(head);
      head = head.next;
    }
    return null;
  }
  
  public ListNode detectCycleNoExtraSpace(ListNode head) {
    ListNode oneStep = head, twoStep = head;
    while(twoStep != null && twoStep.next != null) {
      oneStep = oneStep.next;
      twoStep = twoStep.next.next;
      if(oneStep == twoStep) {
        // 1. twoStep caught up to oneStep meaning there is a cycle.
        // 2. oneStep is precisely at the node before cycle begins.
        // 3. So now we bring a new node from the beginning and keep moving one step
        // until it meets with oneStep -- which will be where the cycle begins.
        while(head != oneStep) {
          oneStep = oneStep.next;
          head = head.next;
        }
        return head;
      }
    }
    return null;
  }
}
