package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode024;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode024 {
  @Test
  public void test1Nodes() {
    ListNode head = new ListNode(1);
    LeetCode024 solution = new LeetCode024();
    ListNode result = solution.swapPairs(head);
    Assert.assertEquals(1, result.val);
    Assert.assertNull(result.next);
  }

  @Test
  public void test2Nodes() {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    LeetCode024 solution = new LeetCode024();
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
    LeetCode024 solution = new LeetCode024();
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
    LeetCode024 solution = new LeetCode024();
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
    LeetCode024 solution = new LeetCode024();
    ListNode result = solution.swapPairs(head);
    Assert.assertNull(result);
  }
}
