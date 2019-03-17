package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0160;
import com.jlee.leetcodesolutions.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0160 {
  @Test
  public void testProblemCase1() {
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
    
    LeetCode0160 solution = new LeetCode0160();
    ListNode result = solution.getIntersectionNode(a, b);
    Assert.assertEquals(c, result);
  }

  @Test
  public void testProblemCase2() {
    ListNode c = new ListNode(10);
    c.next = new ListNode(11);
    c.next.next = new ListNode(12);
    ListNode a = c;
    ListNode b = c;
    
    LeetCode0160 solution = new LeetCode0160();
    ListNode result = solution.getIntersectionNode(a, b);
    Assert.assertEquals(c, result);
  }
  
  @Test
  public void testProblemCase3() {
    ListNode a = new ListNode(1);
    a.next = new ListNode(2);
    ListNode b = new ListNode(1);
    b.next = new ListNode(2);
    b.next.next = new ListNode(3);
    
    LeetCode0160 solution = new LeetCode0160();
    ListNode result = solution.getIntersectionNode(a, b);
    Assert.assertNull(result);
  }

  @Test
  public void testProblemCase4() {
    ListNode a = null;
    ListNode b = new ListNode(1);
    b.next = new ListNode(2);
    b.next.next = new ListNode(3);
    
    LeetCode0160 solution = new LeetCode0160();
    ListNode result = solution.getIntersectionNode(a, b);
    Assert.assertNull(result);
  }

  @Test
  public void testProblemCase5() {
    ListNode a = new ListNode(1);
    a.next = new ListNode(2);
    ListNode b = null;
    
    LeetCode0160 solution = new LeetCode0160();
    ListNode result = solution.getIntersectionNode(a, b);
    Assert.assertNull(result);
  }

  @Test
  public void testProblemCase6() {
    ListNode a = null;
    ListNode b = null;
    
    LeetCode0160 solution = new LeetCode0160();
    ListNode result = solution.getIntersectionNode(a, b);
    Assert.assertNull(result);
  }
  
  @Test
  public void testProblemCase7() {
    ListNode b = new ListNode(1);
    b.next = new ListNode(2);
    ListNode a = new ListNode(1);
    a.next = new ListNode(2);
    a.next.next = new ListNode(3);
    ListNode c = new ListNode(10);
    c.next = new ListNode(11);
    c.next.next = new ListNode(12);
    a.next.next.next = c;
    b.next.next = c;
    
    LeetCode0160 solution = new LeetCode0160();
    ListNode result = solution.getIntersectionNode(a, b);
    Assert.assertEquals(c, result);
  }
  
  @Test
  public void testProblemCase8() {
    ListNode b = new ListNode(1);
    b.next = new ListNode(2);
    ListNode a = new ListNode(1);
    a.next = new ListNode(2);
    a.next.next = new ListNode(3);
    
    LeetCode0160 solution = new LeetCode0160();
    ListNode result = solution.getIntersectionNode(a, b);
    Assert.assertNull(result);
  }
}
