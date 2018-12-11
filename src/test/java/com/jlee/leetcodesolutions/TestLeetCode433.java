package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode433;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode433 {
  @Test
  public void testProblemCase1() {
    String start = "AACCGGTT", end = "AACCGGTA";
    String[] bank = {"AACCGGTA"};
    LeetCode433 solution = new LeetCode433();
    Assert.assertEquals(1, solution.minMutation(start, end, bank));
  }

  @Test
  public void testProblemCase2() {
    String start = "AACCGGTT", end = "AAACGGTA";
    String[] bank = {"AACCGGTA", "AACCGCTA", "AAACGGTA"};
    LeetCode433 solution = new LeetCode433();
    Assert.assertEquals(2, solution.minMutation(start, end, bank));
  }

  @Test
  public void testProblemCase3() {
    String start = "AAAAACCC", end = "AACCCCCC";
    String[] bank = {"AAAACCCC", "AAACCCCC", "AACCCCCC"};
    LeetCode433 solution = new LeetCode433();
    Assert.assertEquals(3, solution.minMutation(start, end, bank));
  }

  @Test
  public void testProblemCase4() {
    String start = "AAAAACCC", end = "AACCCCCC";
    String[] bank = {"TTTTTTTT"};
    LeetCode433 solution = new LeetCode433();
    Assert.assertEquals(-1, solution.minMutation(start, end, bank));
  }
}
