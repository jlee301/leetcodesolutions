package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0677;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0677 {
  @Test
  public void testProblemCase() {
    LeetCode0677 solution = new LeetCode0677();
    solution.insert("apple", 3);
    Assert.assertEquals(3, solution.sum("ap"));
    solution.insert("app", 2);
    Assert.assertEquals(5, solution.sum("ap"));
    Assert.assertEquals(0, solution.sum("leet"));
  }
}
