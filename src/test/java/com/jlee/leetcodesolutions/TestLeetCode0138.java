package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0138;
import com.jlee.leetcodesolutions.RandomListNode;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0138 {
  @Test
  public void testThreeList() {
    RandomListNode head = new RandomListNode(1);
    head.next = new RandomListNode(2);
    head.next.next = new RandomListNode(3);    
    head.random = head.next.next;
    head.next.random = head.next;
    head.next.next.random = head;
    LeetCode0138 solution = new LeetCode0138();
    RandomListNode result = solution.copyRandomList(head);
    Assert.assertNotEquals(head, result);
    Assert.assertEquals(head.label, result.label);

    Assert.assertNotEquals(head.next, result.next);
    Assert.assertEquals(head.next.label, result.next.label);
    Assert.assertNotEquals(head.random, result.random);
    Assert.assertEquals(head.random.label, result.random.label);

    Assert.assertNotEquals(head.next.next, result.next.next);
    Assert.assertEquals(head.next.next.label, result.next.next.label);
    Assert.assertNotEquals(head.next.random, result.next.random);
    Assert.assertEquals(head.next.random.label, result.next.random.label);
    
    Assert.assertNull(result.next.next.next);
    Assert.assertNull(result.random.next);
  }

  @Test
  public void testNull() {
    RandomListNode head = null;
    LeetCode0138 solution = new LeetCode0138();
    RandomListNode result = solution.copyRandomList(head);
    Assert.assertNull(result);
  }
}
