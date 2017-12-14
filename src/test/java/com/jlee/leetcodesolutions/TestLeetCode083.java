package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode083;
import com.jlee.leetcodesolutions.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode083 {
  @Test
  public void testFrontRemoval() {
    LeetCode083 solution = new LeetCode083();
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
  public void testMiddleRemoval() {
    LeetCode083 solution = new LeetCode083();
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
  public void testEndRemoval() {
    LeetCode083 solution = new LeetCode083();
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
  public void testDoubleDuplicatesRemoval() {
    LeetCode083 solution = new LeetCode083();
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
  public void testAllDuplicatesRemoval() {
    LeetCode083 solution = new LeetCode083();
    ListNode head = new ListNode(1);
    head.next = new ListNode(1);
    head.next.next = new ListNode(1);
    ListNode result = solution.deleteDuplicates(head);
    Assert.assertEquals(1, result.val);
    Assert.assertNull(result.next);
  }

  @Test
  public void testNoDuplicates() {
    LeetCode083 solution = new LeetCode083();
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
  public void testOneEntry() {
    LeetCode083 solution = new LeetCode083();
    ListNode head = new ListNode(1);
    ListNode result = solution.deleteDuplicates(head);
    Assert.assertEquals(1, result.val);
    Assert.assertNull(result.next);
  }

  @Test
  public void testNull() {
    LeetCode083 solution = new LeetCode083();
    ListNode head = null;
    ListNode result = solution.deleteDuplicates(head);
    Assert.assertNull(result);
  }
}
