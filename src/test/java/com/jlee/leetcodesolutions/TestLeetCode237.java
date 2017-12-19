package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode237;
import com.jlee.leetcodesolutions.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode237 {
  @Test
  public void testProblemCase() {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    ListNode node = new ListNode(3);
    node.next = new ListNode(4);
    head.next.next = node;
    
    LeetCode237 solution = new LeetCode237();
    solution.deleteNode(node);
    Assert.assertEquals(1, head.val);
    Assert.assertEquals(2, head.next.val);
    Assert.assertEquals(4, head.next.next.val);
    Assert.assertNull(head.next.next.next);
  }

  @Test
  public void testDeleteFront() {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);
    ListNode node = head;
    
    LeetCode237 solution = new LeetCode237();
    solution.deleteNode(node);
    Assert.assertEquals(2, head.val);
    Assert.assertEquals(3, head.next.val);
    Assert.assertEquals(4, head.next.next.val);
    Assert.assertNull(head.next.next.next);
  }

  @Test
  public void testDeleteEnd() {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    ListNode node = new ListNode(4);
    head.next.next.next = node;
    
    LeetCode237 solution = new LeetCode237();
    solution.deleteNode(node);
    Assert.assertEquals(1, head.val);
    Assert.assertEquals(2, head.next.val);
    Assert.assertEquals(3, head.next.next.val);
    Assert.assertEquals(4, head.next.next.next.val);
    Assert.assertNull(head.next.next.next.next);
  }

  @Test
  public void testNull() {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);
    ListNode node = null;
    
    LeetCode237 solution = new LeetCode237();
    solution.deleteNode(node);
    Assert.assertEquals(1, head.val);
    Assert.assertEquals(2, head.next.val);
    Assert.assertEquals(3, head.next.next.val);
    Assert.assertEquals(4, head.next.next.next.val);
    Assert.assertNull(head.next.next.next.next);
  }
}
