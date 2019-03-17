package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0024;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0024 {
  @Test
  public void test1Nodes() {
    ListNode head = new ListNode(1);
    LeetCode0024 solution = new LeetCode0024();
    ListNode result = solution.swapPairs(head);
    Assert.assertEquals(1, result.val);
    Assert.assertNull(result.next);
  }

  @Test
  public void test2Nodes() {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    LeetCode0024 solution = new LeetCode0024();
    ListNode result = solution.swapPairs(head);
    Assert.assertEquals(2, result.val);
    Assert.assertEquals(1, result.next.val);
    Assert.assertNull(result.next.next);
  }

  @Test
  public void test3Nodes() {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    LeetCode0024 solution = new LeetCode0024();
    ListNode result = solution.swapPairs(head);
    Assert.assertEquals(2, result.val);
    Assert.assertEquals(1, result.next.val);
    Assert.assertEquals(3, result.next.next.val);
    Assert.assertNull(result.next.next.next);
  }

  @Test
  public void test4Nodes() {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);
    LeetCode0024 solution = new LeetCode0024();
    ListNode result = solution.swapPairs(head);
    Assert.assertEquals(2, result.val);
    Assert.assertEquals(1, result.next.val);
    Assert.assertEquals(4, result.next.next.val);
    Assert.assertEquals(3, result.next.next.next.val);
    Assert.assertNull(result.next.next.next.next);
  }
  
  @Test
  public void testNull() {
    ListNode head = null;
    LeetCode0024 solution = new LeetCode0024();
    ListNode result = solution.swapPairs(head);
    Assert.assertNull(result);
  }
}
