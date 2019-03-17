package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0143;
import com.jlee.leetcodesolutions.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0143 {
  @Test
  public void testFiveNodes() {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);
    head.next.next.next.next = new ListNode(5);
    LeetCode0143 solution = new LeetCode0143();
    solution.reorderList(head);
    Assert.assertEquals(1, head.val);
    Assert.assertEquals(5, head.next.val);
    Assert.assertEquals(2, head.next.next.val);
    Assert.assertEquals(4, head.next.next.next.val);
    Assert.assertEquals(3, head.next.next.next.next.val);
    Assert.assertNull(head.next.next.next.next.next);
  }
  
  @Test
  public void testFourNodes() {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);
    LeetCode0143 solution = new LeetCode0143();
    solution.reorderList(head);
    Assert.assertEquals(1, head.val);
    Assert.assertEquals(4, head.next.val);
    Assert.assertEquals(2, head.next.next.val);
    Assert.assertEquals(3, head.next.next.next.val);
    Assert.assertNull(head.next.next.next.next);
  }

  @Test
  public void testThreeNodes() {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    LeetCode0143 solution = new LeetCode0143();
    solution.reorderList(head);
    Assert.assertEquals(1, head.val);
    Assert.assertEquals(3, head.next.val);
    Assert.assertEquals(2, head.next.next.val);
    Assert.assertNull(head.next.next.next);
  }

  @Test
  public void testTwoNodes() {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    LeetCode0143 solution = new LeetCode0143();
    solution.reorderList(head);
    Assert.assertEquals(1, head.val);
    Assert.assertEquals(2, head.next.val);
    Assert.assertNull(head.next.next);
  }

  @Test
  public void testOneNode() {
    ListNode head = new ListNode(1);
    LeetCode0143 solution = new LeetCode0143();
    solution.reorderList(head);
    Assert.assertEquals(1, head.val);
    Assert.assertNull(head.next);
  }
  
  @Test
  public void testWrongAnswer() {
    ListNode head = new ListNode(1);
    head.next = new ListNode(1);
    head.next.next = new ListNode(1);
    head.next.next.next = new ListNode(1);
    head.next.next.next.next = new ListNode(2);
    head.next.next.next.next.next = new ListNode(2);
    head.next.next.next.next.next.next = new ListNode(3);
    head.next.next.next.next.next.next.next = new ListNode(2);
    LeetCode0143 solution = new LeetCode0143();
    solution.reorderList(head);
    Assert.assertEquals(1, head.val);
    Assert.assertEquals(2, head.next.val);
    Assert.assertEquals(1, head.next.next.val);
    Assert.assertEquals(3, head.next.next.next.val);
    Assert.assertEquals(1, head.next.next.next.next.val);
    Assert.assertEquals(2, head.next.next.next.next.next.val);
    Assert.assertEquals(1, head.next.next.next.next.next.next.val);
    Assert.assertEquals(2, head.next.next.next.next.next.next.next.val);
    Assert.assertNull(head.next.next.next.next.next.next.next.next);
  }

  @Test
  public void testNull() {
    ListNode head = null;
    LeetCode0143 solution = new LeetCode0143();
    solution.reorderList(head);
    Assert.assertNull(head);
  }
}
