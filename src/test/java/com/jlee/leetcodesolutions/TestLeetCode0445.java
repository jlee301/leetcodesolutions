package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0445;
import com.jlee.leetcodesolutions.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0445 {
  @Test
  public void testProblemCase() {
    ListNode l1 = new ListNode(7);
    l1.next = new ListNode(2);
    l1.next.next = new ListNode(4);
    l1.next.next.next = new ListNode(3);
    ListNode l2 = new ListNode(5);
    l2.next = new ListNode(6);
    l2.next.next = new ListNode(4);
    LeetCode0445 solution = new LeetCode0445();
    ListNode result = solution.addTwoNumbers(l1, l2);
    Assert.assertEquals(7, result.val);
    Assert.assertEquals(8, result.next.val);
    Assert.assertEquals(0, result.next.next.val);
    Assert.assertEquals(7, result.next.next.next.val);
    Assert.assertNull(result.next.next.next.next);
  }

  @Test
  public void testProblemCaseReversed() {
    ListNode l2 = new ListNode(7);
    l2.next = new ListNode(2);
    l2.next.next = new ListNode(4);
    l2.next.next.next = new ListNode(3);
    ListNode l1 = new ListNode(5);
    l1.next = new ListNode(6);
    l1.next.next = new ListNode(4);
    LeetCode0445 solution = new LeetCode0445();
    ListNode result = solution.addTwoNumbers(l1, l2);
    Assert.assertEquals(7, result.val);
    Assert.assertEquals(8, result.next.val);
    Assert.assertEquals(0, result.next.next.val);
    Assert.assertEquals(7, result.next.next.next.val);
    Assert.assertNull(result.next.next.next.next);
  }

  @Test
  public void testOneTheEdge() {
    ListNode l1 = new ListNode(9);
    l1.next = new ListNode(9);
    l1.next.next = new ListNode(9);
    l1.next.next.next = new ListNode(9);
    ListNode l2 = new ListNode(1);
    LeetCode0445 solution = new LeetCode0445();
    ListNode result = solution.addTwoNumbers(l1, l2);
    Assert.assertEquals(1, result.val);
    Assert.assertEquals(0, result.next.val);
    Assert.assertEquals(0, result.next.next.val);
    Assert.assertEquals(0, result.next.next.next.val);
    Assert.assertEquals(0, result.next.next.next.next.val);
    Assert.assertNull(result.next.next.next.next.next);
  }

  @Test
  public void testNull() {
    ListNode l1 = null;
    ListNode l2 = null;
    LeetCode0445 solution = new LeetCode0445();
    ListNode result = solution.addTwoNumbers(l1, l2);
    Assert.assertNull(result);
  }
}
