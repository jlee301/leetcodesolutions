package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0828;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0828 {
  @Test
  public void testProblemCase1() {
    String S = "ABC";
    LeetCode0828 solution = new LeetCode0828();
    Assert.assertEquals(10, solution.uniqueLetterString(S));
  }

  @Test
  public void testProblemCase2() {
    String S = "ABA";
    LeetCode0828 solution = new LeetCode0828();
    Assert.assertEquals(8, solution.uniqueLetterString(S));
  }
}
