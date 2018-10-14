package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode921;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode921 {
  @Test
  public void testProblemCase1() {
    String S = "())";
    LeetCode921 solution = new LeetCode921();
    Assert.assertEquals(1, solution.minAddToMakeValid(S));
  }

  @Test
  public void testProblemCase2() {
    String S = "(((";
    LeetCode921 solution = new LeetCode921();
    Assert.assertEquals(3, solution.minAddToMakeValid(S));
  }

  @Test
  public void testProblemCase3() {
    String S = "()";
    LeetCode921 solution = new LeetCode921();
    Assert.assertEquals(0, solution.minAddToMakeValid(S));
  }

  @Test
  public void testProblemCase4() {
    String S = "()))((";
    LeetCode921 solution = new LeetCode921();
    Assert.assertEquals(4, solution.minAddToMakeValid(S));
  }
}
