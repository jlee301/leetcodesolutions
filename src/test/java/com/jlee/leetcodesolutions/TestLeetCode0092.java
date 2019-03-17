package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0092;
import com.jlee.leetcodesolutions.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0092 {
  @Test
  public void testProblemCase() {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);
    head.next.next.next.next = new ListNode(5);
    int m = 2, n = 4;
    LeetCode0092 solution = new LeetCode0092();
    ListNode result = solution.reverseBetween(head, m, n);
    Assert.assertEquals(1, result.val);
    Assert.assertEquals(4, result.next.val);
    Assert.assertEquals(3, result.next.next.val);
    Assert.assertEquals(2, result.next.next.next.val);
    Assert.assertEquals(5, result.next.next.next.next.val);
    Assert.assertNull(result.next.next.next.next.next);
  }

  @Test
  public void testEntireReverse() {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);
    head.next.next.next.next = new ListNode(5);
    int m = 1, n = 5;
    LeetCode0092 solution = new LeetCode0092();
    ListNode result = solution.reverseBetween(head, m, n);
    Assert.assertEquals(5, result.val);
    Assert.assertEquals(4, result.next.val);
    Assert.assertEquals(3, result.next.next.val);
    Assert.assertEquals(2, result.next.next.next.val);
    Assert.assertEquals(1, result.next.next.next.next.val);
    Assert.assertNull(result.next.next.next.next.next);
  }

  @Test
  public void testOneNode() {
    ListNode head = new ListNode(1);
    int m = 1, n = 1;
    LeetCode0092 solution = new LeetCode0092();
    ListNode result = solution.reverseBetween(head, m, n);
    Assert.assertEquals(1, result.val);
    Assert.assertNull(result.next);
  }

  @Test
  public void testNull() {
    ListNode head = null;
    int m = 1, n = 1;
    LeetCode0092 solution = new LeetCode0092();
    ListNode result = solution.reverseBetween(head, m, n);
    Assert.assertNull(result);
  }
}
