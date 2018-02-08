package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode086;
import com.jlee.leetcodesolutions.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode086 {
  @Test
  public void testProblemCase() {
    ListNode head = new ListNode(1);
    head.next = new ListNode(4);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(2);
    head.next.next.next.next = new ListNode(5);
    head.next.next.next.next.next = new ListNode(2);
    int x = 3;
    LeetCode086 solution = new LeetCode086();
    ListNode result = solution.partition(head, x);
    Assert.assertEquals(1, result.val);
    Assert.assertEquals(2, result.next.val);
    Assert.assertEquals(2, result.next.next.val);
    Assert.assertEquals(4, result.next.next.next.val);
    Assert.assertEquals(3, result.next.next.next.next.val);
    Assert.assertEquals(5, result.next.next.next.next.next.val);
    Assert.assertNull(result.next.next.next.next.next.next);
  }

  @Test
  public void testOneNode() {
    ListNode head = new ListNode(1);
    int x = 3;
    LeetCode086 solution = new LeetCode086();
    ListNode result = solution.partition(head, x);
    Assert.assertEquals(1, result.val);
    Assert.assertNull(result.next);
  }

  @Test
  public void testNull() {
    ListNode head = null;
    int x = 3;
    LeetCode086 solution = new LeetCode086();
    ListNode result = solution.partition(head, x);
    Assert.assertNull(result);
  }
}
