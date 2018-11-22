package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode023;
import com.jlee.leetcodesolutions.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode023 {
  @Test
  public void testProblemCase1() {
    ListNode[] lists = new ListNode[3];
    ListNode head = new ListNode(1);
    head.next = new ListNode(4);
    head.next.next = new ListNode(5);
    lists[0] = head;
    
    head = new ListNode(1);
    head.next = new ListNode(3);
    head.next.next = new ListNode(4);
    lists[1] = head;
    
    head = new ListNode(2);
    head.next = new ListNode(6);
    lists[2] = head;
    
    LeetCode023 solution = new LeetCode023();
    ListNode result = solution.mergeKLists(lists);
    // 1->1->2->3->4->4->5->6
    Assert.assertEquals(1, result.val);
    Assert.assertEquals(1, result.next.val);
    Assert.assertEquals(2, result.next.next.val);
    Assert.assertEquals(3, result.next.next.next.val);
    Assert.assertEquals(4, result.next.next.next.next.val);
    Assert.assertEquals(4, result.next.next.next.next.next.val);
    Assert.assertEquals(5, result.next.next.next.next.next.next.val);
    Assert.assertEquals(6, result.next.next.next.next.next.next.next.val);
    Assert.assertNull(result.next.next.next.next.next.next.next.next);
  }
}
