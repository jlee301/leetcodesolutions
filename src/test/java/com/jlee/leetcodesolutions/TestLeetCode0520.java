package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0520;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0520 {
  @Test
  public void testProblemCase1() {
    String word = "USA";
    LeetCode0520 solution = new LeetCode0520();
    Assert.assertTrue(solution.detectCapitalUse(word));
  }

  @Test
  public void testProblemCase2() {
    String word = "usa";
    LeetCode0520 solution = new LeetCode0520();
    Assert.assertTrue(solution.detectCapitalUse(word));
  }

  @Test
  public void testProblemCase3() {
    String word = "Usa";
    LeetCode0520 solution = new LeetCode0520();
    Assert.assertTrue(solution.detectCapitalUse(word));
  }

  @Test
  public void testProblemCase4() {
    String word = "uSa";
    LeetCode0520 solution = new LeetCode0520();
    Assert.assertFalse(solution.detectCapitalUse(word));
  }

  @Test
  public void testProblemCase5() {
    String word = "usA";
    LeetCode0520 solution = new LeetCode0520();
    Assert.assertFalse(solution.detectCapitalUse(word));
  }

  @Test
  public void testProblemCase6() {
    String word = "UsA";
    LeetCode0520 solution = new LeetCode0520();
    Assert.assertFalse(solution.detectCapitalUse(word));
  }

  @Test
  public void testProblemCase7() {
    String word = "U";
    LeetCode0520 solution = new LeetCode0520();
    Assert.assertTrue(solution.detectCapitalUse(word));
  }

  @Test
  public void testProblemCase8() {
    String word = "u";
    LeetCode0520 solution = new LeetCode0520();
    Assert.assertTrue(solution.detectCapitalUse(word));
  }
}
