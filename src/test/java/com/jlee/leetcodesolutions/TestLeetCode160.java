package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode160;
import com.jlee.leetcodesolutions.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode160 {
  @Test
  public void testProblemCase() {
    ListNode a = new ListNode(1);
    a.next = new ListNode(2);
    ListNode b = new ListNode(1);
    b.next = new ListNode(2);
    b.next.next = new ListNode(3);
    ListNode c = new ListNode(10);
    c.next = new ListNode(11);
    c.next.next = new ListNode(12);
    a.next.next = c;
    b.next.next.next = c;
    
    LeetCode160 solution = new LeetCode160();
    ListNode result = solution.getIntersectionNode(a, b);
    Assert.assertEquals(c, result);
  }

  @Test
  public void testNoIntersection() {
    ListNode a = new ListNode(1);
    a.next = new ListNode(2);
    ListNode b = new ListNode(1);
    b.next = new ListNode(2);
    b.next.next = new ListNode(3);
    
    LeetCode160 solution = new LeetCode160();
    ListNode result = solution.getIntersectionNode(a, b);
    Assert.assertNull(result);
  }

  @Test
  public void testNullA() {
    ListNode a = null;
    ListNode b = new ListNode(1);
    b.next = new ListNode(2);
    b.next.next = new ListNode(3);
    
    LeetCode160 solution = new LeetCode160();
    ListNode result = solution.getIntersectionNode(a, b);
    Assert.assertNull(result);
  }

  @Test
  public void testNullB() {
    ListNode a = new ListNode(1);
    a.next = new ListNode(2);
    ListNode b = null;
    
    LeetCode160 solution = new LeetCode160();
    ListNode result = solution.getIntersectionNode(a, b);
    Assert.assertNull(result);
  }

  @Test
  public void testNull() {
    ListNode a = null;
    ListNode b = null;
    
    LeetCode160 solution = new LeetCode160();
    ListNode result = solution.getIntersectionNode(a, b);
    Assert.assertNull(result);
  }
}
