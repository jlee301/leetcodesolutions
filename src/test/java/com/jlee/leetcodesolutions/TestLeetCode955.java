package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode955;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode955 {
  @Test
  public void testProblemCase1() {
    String[] A = {"ca","bb","ac"};
    LeetCode955 solution = new LeetCode955();
    Assert.assertEquals(1, solution.minDeletionSize(A));
  }

  @Test
  public void testProblemCase2() {
    String[] A = {"xc","yb","za"};
    LeetCode955 solution = new LeetCode955();
    Assert.assertEquals(0, solution.minDeletionSize(A));
  }

  @Test
  public void testProblemCase3() {
    String[] A = {"zyx","wvu","tsr"};
    LeetCode955 solution = new LeetCode955();
    Assert.assertEquals(3, solution.minDeletionSize(A));
  }
}
