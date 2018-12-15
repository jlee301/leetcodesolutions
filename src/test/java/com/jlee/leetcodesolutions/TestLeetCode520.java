package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode520;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode520 {
  @Test
  public void testProblemCase1() {
    String word = "USA";
    LeetCode520 solution = new LeetCode520();
    Assert.assertTrue(solution.detectCapitalUse(word));
  }

  @Test
  public void testProblemCase2() {
    String word = "usa";
    LeetCode520 solution = new LeetCode520();
    Assert.assertTrue(solution.detectCapitalUse(word));
  }

  @Test
  public void testProblemCase3() {
    String word = "Usa";
    LeetCode520 solution = new LeetCode520();
    Assert.assertTrue(solution.detectCapitalUse(word));
  }

  @Test
  public void testProblemCase4() {
    String word = "uSa";
    LeetCode520 solution = new LeetCode520();
    Assert.assertFalse(solution.detectCapitalUse(word));
  }

  @Test
  public void testProblemCase5() {
    String word = "usA";
    LeetCode520 solution = new LeetCode520();
    Assert.assertFalse(solution.detectCapitalUse(word));
  }

  @Test
  public void testProblemCase6() {
    String word = "UsA";
    LeetCode520 solution = new LeetCode520();
    Assert.assertFalse(solution.detectCapitalUse(word));
  }

  @Test
  public void testProblemCase7() {
    String word = "U";
    LeetCode520 solution = new LeetCode520();
    Assert.assertTrue(solution.detectCapitalUse(word));
  }

  @Test
  public void testProblemCase8() {
    String word = "u";
    LeetCode520 solution = new LeetCode520();
    Assert.assertTrue(solution.detectCapitalUse(word));
  }
}
