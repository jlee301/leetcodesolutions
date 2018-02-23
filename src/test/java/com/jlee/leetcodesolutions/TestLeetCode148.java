package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode148;
import com.jlee.leetcodesolutions.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode148 {
  @Test
  public void testOneNode() {
    ListNode head = new ListNode(2);
    LeetCode148 solution = new LeetCode148();
    ListNode result = solution.sortList(head);
    Assert.assertEquals(2, result.val);
    Assert.assertNull(result.next);
  }

  @Test
  public void testTwoNode() {
    ListNode head = new ListNode(2);
    head.next = new ListNode(1);
    LeetCode148 solution = new LeetCode148();
    ListNode result = solution.sortList(head);
    Assert.assertEquals(1, result.val);
    Assert.assertEquals(2, result.next.val);
    Assert.assertNull(result.next.next);
  }

  @Test
  public void testThreeNode() {
    ListNode head = new ListNode(2);
    head.next = new ListNode(1);
    head.next.next = new ListNode(4);
    LeetCode148 solution = new LeetCode148();
    ListNode result = solution.sortList(head);
    Assert.assertEquals(1, result.val);
    Assert.assertEquals(2, result.next.val);
    Assert.assertEquals(4, result.next.next.val);
    Assert.assertNull(result.next.next.next);
  }

  @Test
  public void testFourNode() {
    ListNode head = new ListNode(2);
    head.next = new ListNode(1);
    head.next.next = new ListNode(4);
    head.next.next.next = new ListNode(5);
    LeetCode148 solution = new LeetCode148();
    ListNode result = solution.sortList(head);
    Assert.assertEquals(1, result.val);
    Assert.assertEquals(2, result.next.val);
    Assert.assertEquals(4, result.next.next.val);
    Assert.assertEquals(5, result.next.next.next.val);
    Assert.assertNull(result.next.next.next.next);
  }

  @Test
  public void testNull() {
    ListNode head = null;
    LeetCode148 solution = new LeetCode148();
    ListNode result = solution.sortList(head);
    Assert.assertNull(result);
  }
}
