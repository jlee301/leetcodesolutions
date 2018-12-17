package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode960;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode960 {
  @Test
  public void testProblemCase1() {
    String[] A = {"babca","bbazb"};
    LeetCode960 solution = new LeetCode960();
    Assert.assertEquals(3, solution.minDeletionSize(A));
  }

  @Test
  public void testProblemCase2() {
    String[] A = {"edcba"};
    LeetCode960 solution = new LeetCode960();
    Assert.assertEquals(4, solution.minDeletionSize(A));
  }

  @Test
  public void testProblemCase3() {
    String[] A = {"ghi","def","abc"};
    LeetCode960 solution = new LeetCode960();
    Assert.assertEquals(0, solution.minDeletionSize(A));
  }
}
