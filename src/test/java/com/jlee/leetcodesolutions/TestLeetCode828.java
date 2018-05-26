package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode828;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode828 {
  @Test
  public void testProblemCase1() {
    String S = "ABC";
    LeetCode828 solution = new LeetCode828();
    Assert.assertEquals(10, solution.uniqueLetterString(S));
  }

  @Test
  public void testProblemCase2() {
    String S = "ABA";
    LeetCode828 solution = new LeetCode828();
    Assert.assertEquals(8, solution.uniqueLetterString(S));
  }
}
