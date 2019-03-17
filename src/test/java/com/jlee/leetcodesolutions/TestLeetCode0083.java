package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0083;
import com.jlee.leetcodesolutions.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0083 {
  @Test
  public void testProblemCase1() {
    LeetCode0083 solution = new LeetCode0083();
    ListNode head = new ListNode(1);
    head.next = new ListNode(1);
    head.next.next = new ListNode(2);
    head.next.next.next = new ListNode(3);
    ListNode result = solution.deleteDuplicates(head);
    Assert.assertEquals(1, result.val);
    Assert.assertEquals(2, result.next.val);
    Assert.assertEquals(3, result.next.next.val);
    Assert.assertNull(result.next.next.next);
  }

  @Test
  public void testProblemCase2() {
    LeetCode0083 solution = new LeetCode0083();
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(2);
    head.next.next.next = new ListNode(3);
    ListNode result = solution.deleteDuplicates(head);
    Assert.assertEquals(1, result.val);
    Assert.assertEquals(2, result.next.val);
    Assert.assertEquals(3, result.next.next.val);
    Assert.assertNull(result.next.next.next);
  }

  @Test
  public void testProblemCase3() {
    LeetCode0083 solution = new LeetCode0083();
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(3);
    ListNode result = solution.deleteDuplicates(head);
    Assert.assertEquals(1, result.val);
    Assert.assertEquals(2, result.next.val);
    Assert.assertEquals(3, result.next.next.val);
    Assert.assertNull(result.next.next.next);
  }

  @Test
  public void testProblemCase4() {
    LeetCode0083 solution = new LeetCode0083();
    ListNode head = new ListNode(1);
    head.next = new ListNode(1);
    head.next.next = new ListNode(2);
    head.next.next.next = new ListNode(2);
    head.next.next.next.next = new ListNode(3);
    head.next.next.next.next.next = new ListNode(3);
    ListNode result = solution.deleteDuplicates(head);
    Assert.assertEquals(1, result.val);
    Assert.assertEquals(2, result.next.val);
    Assert.assertEquals(3, result.next.next.val);
    Assert.assertNull(result.next.next.next);
  }

  @Test
  public void testProblemCase5() {
    LeetCode0083 solution = new LeetCode0083();
    ListNode head = new ListNode(1);
    head.next = new ListNode(1);
    head.next.next = new ListNode(1);
    ListNode result = solution.deleteDuplicates(head);
    Assert.assertEquals(1, result.val);
    Assert.assertNull(result.next);
  }

  @Test
  public void testProblemCase6() {
    LeetCode0083 solution = new LeetCode0083();
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    ListNode result = solution.deleteDuplicates(head);
    Assert.assertEquals(1, result.val);
    Assert.assertEquals(2, result.next.val);
    Assert.assertEquals(3, result.next.next.val);
    Assert.assertNull(result.next.next.next);
  }

  @Test
  public void testProblemCase7() {
    LeetCode0083 solution = new LeetCode0083();
    ListNode head = new ListNode(1);
    ListNode result = solution.deleteDuplicates(head);
    Assert.assertEquals(1, result.val);
    Assert.assertNull(result.next);
  }

  @Test
  public void testProblemCase8() {
    LeetCode0083 solution = new LeetCode0083();
    ListNode head = null;
    ListNode result = solution.deleteDuplicates(head);
    Assert.assertNull(result);
  }
}
