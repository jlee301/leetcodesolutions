package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0019;
import com.jlee.leetcodesolutions.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0019 {
  @Test
  public void testRemove1() {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);
    head.next.next.next.next = new ListNode(5);
    int n = 1;
    LeetCode0019 solution = new LeetCode0019();
    ListNode result = solution.removeNthFromEnd(head, n);
    Assert.assertEquals(1, result.val);
    Assert.assertEquals(2, result.next.val);
    Assert.assertEquals(3, result.next.next.val);
    Assert.assertEquals(4, result.next.next.next.val);
    Assert.assertNull(result.next.next.next.next);
  }

  @Test
  public void testRemove2() {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);
    head.next.next.next.next = new ListNode(5);
    int n = 2;
    LeetCode0019 solution = new LeetCode0019();
    ListNode result = solution.removeNthFromEnd(head, n);
    Assert.assertEquals(1, result.val);
    Assert.assertEquals(2, result.next.val);
    Assert.assertEquals(3, result.next.next.val);
    Assert.assertEquals(5, result.next.next.next.val);
    Assert.assertNull(result.next.next.next.next);
  }

  @Test
  public void testRemove3() {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);
    head.next.next.next.next = new ListNode(5);
    int n = 3;
    LeetCode0019 solution = new LeetCode0019();
    ListNode result = solution.removeNthFromEnd(head, n);
    Assert.assertEquals(1, result.val);
    Assert.assertEquals(2, result.next.val);
    Assert.assertEquals(4, result.next.next.val);
    Assert.assertEquals(5, result.next.next.next.val);
    Assert.assertNull(result.next.next.next.next);
  }

  @Test
  public void testRemove4() {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);
    head.next.next.next.next = new ListNode(5);
    int n = 4;
    LeetCode0019 solution = new LeetCode0019();
    ListNode result = solution.removeNthFromEnd(head, n);
    Assert.assertEquals(1, result.val);
    Assert.assertEquals(3, result.next.val);
    Assert.assertEquals(4, result.next.next.val);
    Assert.assertEquals(5, result.next.next.next.val);
    Assert.assertNull(result.next.next.next.next);
  }

  @Test
  public void testRemove5() {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);
    head.next.next.next.next = new ListNode(5);
    int n = 5;
    LeetCode0019 solution = new LeetCode0019();
    ListNode result = solution.removeNthFromEnd(head, n);
    Assert.assertEquals(2, result.val);
    Assert.assertEquals(3, result.next.val);
    Assert.assertEquals(4, result.next.next.val);
    Assert.assertEquals(5, result.next.next.next.val);
    Assert.assertNull(result.next.next.next.next);
  }

  @Test
  public void testOneNodeRemoveItself() {
    ListNode head = new ListNode(1);
    int n = 1;
    LeetCode0019 solution = new LeetCode0019();
    ListNode result = solution.removeNthFromEnd(head, n);
    Assert.assertNull(result);
  }

  @Test
  public void testInvalidN() {
    ListNode head = new ListNode(1);
    int n = 0;
    LeetCode0019 solution = new LeetCode0019();
    ListNode result = solution.removeNthFromEnd(head, n);
    Assert.assertEquals(1, result.val);
    Assert.assertNull(result.next);
  }

  @Test
  public void testNull() {
    ListNode head = null;
    int n = 1;
    LeetCode0019 solution = new LeetCode0019();
    ListNode result = solution.removeNthFromEnd(head, n);
    Assert.assertNull(result);
  }
}
