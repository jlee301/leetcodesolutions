package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0237;
import com.jlee.leetcodesolutions.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0237 {
  @Test
  public void testProblemCase1() {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    ListNode node = new ListNode(3);
    node.next = new ListNode(4);
    head.next.next = node;
    
    LeetCode0237 solution = new LeetCode0237();
    solution.deleteNode(node);
    Assert.assertEquals(1, head.val);
    Assert.assertEquals(2, head.next.val);
    Assert.assertEquals(4, head.next.next.val);
    Assert.assertNull(head.next.next.next);
  }

  @Test
  public void testProblemCase2() {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);
    ListNode node = head;
    
    LeetCode0237 solution = new LeetCode0237();
    solution.deleteNode(node);
    Assert.assertEquals(2, head.val);
    Assert.assertEquals(3, head.next.val);
    Assert.assertEquals(4, head.next.next.val);
    Assert.assertNull(head.next.next.next);
  }
}
