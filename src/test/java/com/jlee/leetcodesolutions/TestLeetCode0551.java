package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0551;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0551 {
  @Test
  public void testProblemCase1() {
    String s = "PPPPPPPPPP";
    LeetCode0551 solution = new LeetCode0551();
    Assert.assertTrue(solution.checkRecord(s));
  }

  @Test
  public void testProblemCase2() {
    String s = "PPPPPAPPPP";
    LeetCode0551 solution = new LeetCode0551();
    Assert.assertTrue(solution.checkRecord(s));
  }

  @Test
  public void testProblemCase3() {
    String s = "PAPPPAPPPP";
    LeetCode0551 solution = new LeetCode0551();
    Assert.assertFalse(solution.checkRecord(s));
  }

  @Test
  public void testProblemCase4() {
    String s = "PPPLLLPPPP";
    LeetCode0551 solution = new LeetCode0551();
    Assert.assertFalse(solution.checkRecord(s));
  }

  @Test
  public void testProblemCase5() {
    String s = "PPPLLPPPPP";
    LeetCode0551 solution = new LeetCode0551();
    Assert.assertTrue(solution.checkRecord(s));
  }

  @Test
  public void testProblemCase6() {
    String s = "PPPLPPPPPP";
    LeetCode0551 solution = new LeetCode0551();
    Assert.assertTrue(solution.checkRecord(s));
  }

  @Test
  public void testProblemCase7() {
    String s = "LPLLALLPL";
    LeetCode0551 solution = new LeetCode0551();
    Assert.assertTrue(solution.checkRecord(s));
  }

  @Test
  public void testProblemCase8() {
    String s = "";
    LeetCode0551 solution = new LeetCode0551();
    Assert.assertTrue(solution.checkRecord(s));
  }
}
