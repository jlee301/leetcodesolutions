package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0430;
import com.jlee.leetcodesolutions.LeetCode0430.Node;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0430 {
  @Test
  public void testProblemCase1() {
    LeetCode0430 solution = new LeetCode0430();
    Node seven = solution. new Node(7, null, null, null);
    Node eight = solution. new Node(8, seven, null, null);
    seven.next = eight;
    Node nine = solution. new Node(9, eight, null, null);
    eight.next = nine;
    Node ten = solution. new Node(10, nine, null, null);
    nine.next = ten;
    
    Node one = solution. new Node(1, null, null, null);
    Node two = solution. new Node(2, one, null, null);
    one.next = two;
    Node three = solution. new Node(3, two, null, seven);
    two.next = three;
    Node four = solution. new Node(4, three, null, null);
    three.next = four;
    
    Node head = solution. new Node();
    head = one;
    
    Node result = solution.flatten(head);
    Assert.assertEquals(1, result.val);
    Assert.assertNull(result.prev);
    Assert.assertNull(result.child);

    Assert.assertEquals(2, result.next.val);
    Assert.assertEquals(1, result.next.prev.val);
    Assert.assertNull(result.child);

    Assert.assertEquals(3, result.next.next.val);
    Assert.assertEquals(2, result.next.next.prev.val);
    Assert.assertNull(result.child);

    Assert.assertEquals(7, result.next.next.next.val);
    Assert.assertEquals(3, result.next.next.next.prev.val);
    Assert.assertNull(result.child);

    Assert.assertEquals(8, result.next.next.next.next.val);
    Assert.assertEquals(7, result.next.next.next.next.prev.val);
    Assert.assertNull(result.child);

    Assert.assertEquals(9, result.next.next.next.next.next.val);
    Assert.assertEquals(8, result.next.next.next.next.next.prev.val);
    Assert.assertNull(result.child);

    Assert.assertEquals(10, result.next.next.next.next.next.next.val);
    Assert.assertEquals(9, result.next.next.next.next.next.next.prev.val);
    Assert.assertNull(result.child);

    Assert.assertEquals(4, result.next.next.next.next.next.next.next.val);
    Assert.assertEquals(10, result.next.next.next.next.next.next.next.prev.val);
    Assert.assertNull(result.child);
    Assert.assertNull(result.next.next.next.next.next.next.next.next);
  }
}
