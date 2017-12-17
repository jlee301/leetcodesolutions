package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode203;
import com.jlee.leetcodesolutions.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode203 {
  @Test
  public void testProblemCase() {
    LeetCode203 solution = new LeetCode203();
    // Input: 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6, val = 6
    // Output: 1 --> 2 --> 3 --> 4 --> 5
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(6);
    head.next.next.next = new ListNode(3);
    head.next.next.next.next = new ListNode(4);
    head.next.next.next.next.next = new ListNode(5);
    head.next.next.next.next.next.next = new ListNode(6);
    int val = 6;
    ListNode result = solution.removeElements(head, val);
    Assert.assertEquals(result.val, 1);
    Assert.assertEquals(result.next.val, 2);
    Assert.assertEquals(result.next.next.val, 3);
    Assert.assertEquals(result.next.next.next.val, 4);
    Assert.assertEquals(result.next.next.next.next.val, 5);
    Assert.assertNull(result.next.next.next.next.next);
  }

  @Test
  public void testRemoveAll() {
    LeetCode203 solution = new LeetCode203();
    ListNode head = new ListNode(6);
    head.next = new ListNode(6);
    head.next.next = new ListNode(6);
    head.next.next.next = new ListNode(6);
    head.next.next.next.next = new ListNode(6);
    head.next.next.next.next.next = new ListNode(6);
    head.next.next.next.next.next.next = new ListNode(6);
    int val = 6;
    ListNode result = solution.removeElements(head, val);
    Assert.assertNull(result);
  }

  @Test
  public void testFirst() {
    LeetCode203 solution = new LeetCode203();
    ListNode head = new ListNode(6);
    head.next = new ListNode(1);
    head.next.next = new ListNode(2);
    head.next.next.next = new ListNode(3);
    int val = 6;
    ListNode result = solution.removeElements(head, val);
    Assert.assertEquals(result.val, 1);
    Assert.assertEquals(result.next.val, 2);
    Assert.assertEquals(result.next.next.val, 3);
    Assert.assertNull(result.next.next.next);
  }

  @Test
  public void testNothingToRemove() {
    LeetCode203 solution = new LeetCode203();
    ListNode head = new ListNode(6);
    head.next = new ListNode(1);
    head.next.next = new ListNode(2);
    head.next.next.next = new ListNode(3);
    int val = 0;
    ListNode result = solution.removeElements(head, val);
    Assert.assertEquals(result.val, 6);
    Assert.assertEquals(result.next.val, 1);
    Assert.assertEquals(result.next.next.val, 2);
    Assert.assertEquals(result.next.next.next.val, 3);
    Assert.assertNull(result.next.next.next.next);
  }

  @Test
  public void testNull() {
    LeetCode203 solution = new LeetCode203();
    ListNode head = null;
    int val = 0;
    ListNode result = solution.removeElements(head, val);
    Assert.assertNull(result);
  }
}
