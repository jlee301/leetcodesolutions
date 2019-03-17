package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0876;
import com.jlee.leetcodesolutions.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0876 {
  @Test
  public void testProblemCase1() {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);
    head.next.next.next.next = new ListNode(5);
    ListNode ans = head.next.next;
    LeetCode0876 solution = new LeetCode0876();
    Assert.assertEquals(ans, solution.middleNode(head));
  }

  @Test
  public void testProblemCase2() {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);
    head.next.next.next.next = new ListNode(5);
    head.next.next.next.next.next = new ListNode(6);
    ListNode ans = head.next.next.next;
    LeetCode0876 solution = new LeetCode0876();
    Assert.assertEquals(ans, solution.middleNode(head));
  }
}
