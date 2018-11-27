package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode021;
import com.jlee.leetcodesolutions.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode021 {
  @Test
  public void theProblemCase1() {
    ListNode l1 = new ListNode(1);
    l1.next = new ListNode(2);
    l1.next.next = new ListNode(4);

    ListNode l2 = new ListNode(1);
    l2.next = new ListNode(3);
    l2.next.next = new ListNode(4);

    LeetCode021 solution = new LeetCode021();
    ListNode result = solution.mergeTwoLists(l1, l2);

    Assert.assertEquals(1, result.val);
    Assert.assertEquals(1, result.next.val);
    Assert.assertEquals(2, result.next.next.val);
    Assert.assertEquals(3, result.next.next.next.val);
    Assert.assertEquals(4, result.next.next.next.next.val);
    Assert.assertEquals(4, result.next.next.next.next.next.val);
    Assert.assertNull(result.next.next.next.next.next.next);
  }

  @Test
  public void theProblemCase2() {
    ListNode l1 = new ListNode(1);

    ListNode l2 = new ListNode(1);
    l2.next = new ListNode(3);
    l2.next.next = new ListNode(4);

    LeetCode021 solution = new LeetCode021();
    ListNode result = solution.mergeTwoLists(l1, l2);

    Assert.assertEquals(1, result.val);
    Assert.assertEquals(1, result.next.val);
    Assert.assertEquals(3, result.next.next.val);
    Assert.assertEquals(4, result.next.next.next.val);
    Assert.assertNull(result.next.next.next.next);
  }

  @Test
  public void theProblemCase3() {
    ListNode l1 = new ListNode(1);
    l1.next = new ListNode(2);
    l1.next.next = new ListNode(4);

    ListNode l2 = new ListNode(1);

    LeetCode021 solution = new LeetCode021();
    ListNode result = solution.mergeTwoLists(l1, l2);

    Assert.assertEquals(1, result.val);
    Assert.assertEquals(1, result.next.val);
    Assert.assertEquals(2, result.next.next.val);
    Assert.assertEquals(4, result.next.next.next.val);
    Assert.assertNull(result.next.next.next.next);
  }

  @Test
  public void theProblemCase4() {
    ListNode l2 = new ListNode(1);
    l2.next = new ListNode(3);
    l2.next.next = new ListNode(4);

    LeetCode021 solution = new LeetCode021();
    ListNode result = solution.mergeTwoLists(null, l2);

    Assert.assertEquals(1, result.val);
    Assert.assertEquals(3, result.next.val);
    Assert.assertEquals(4, result.next.next.val);
    Assert.assertNull(result.next.next.next);
  }

  @Test
  public void theProblemCase5() {
    ListNode l1 = new ListNode(1);
    l1.next = new ListNode(2);
    l1.next.next = new ListNode(4);

    LeetCode021 solution = new LeetCode021();
    ListNode result = solution.mergeTwoLists(l1, null);

    Assert.assertEquals(1, result.val);
    Assert.assertEquals(2, result.next.val);
    Assert.assertEquals(4, result.next.next.val);
    Assert.assertNull(result.next.next.next);
  }

  @Test
  public void theProblemCase6() {
    LeetCode021 solution = new LeetCode021();
    ListNode result = solution.mergeTwoLists(null, null);

    Assert.assertNull(result);
  }
}
