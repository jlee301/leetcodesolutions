package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode382;
import com.jlee.leetcodesolutions.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode382 {
  @Test
  public void testProblemCase() {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    LeetCode382 solution = new LeetCode382(head);
    for(int i = 0; i < 10; i++) {
      int val = solution.getRandom();
      if(val == 1) {}
      else if(val == 2) {}
      else if (val == 3) {}
      else {
        Assert.fail("getRandom() did not return a value of 1, 2, or 3: " + val);
      }
    }
  }
}
