package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0433;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0433 {
  @Test
  public void testProblemCase1() {
    String start = "AACCGGTT", end = "AACCGGTA";
    String[] bank = {"AACCGGTA"};
    LeetCode0433 solution = new LeetCode0433();
    Assert.assertEquals(1, solution.minMutation(start, end, bank));
  }

  @Test
  public void testProblemCase2() {
    String start = "AACCGGTT", end = "AAACGGTA";
    String[] bank = {"AACCGGTA", "AACCGCTA", "AAACGGTA"};
    LeetCode0433 solution = new LeetCode0433();
    Assert.assertEquals(2, solution.minMutation(start, end, bank));
  }

  @Test
  public void testProblemCase3() {
    String start = "AAAAACCC", end = "AACCCCCC";
    String[] bank = {"AAAACCCC", "AAACCCCC", "AACCCCCC"};
    LeetCode0433 solution = new LeetCode0433();
    Assert.assertEquals(3, solution.minMutation(start, end, bank));
  }

  @Test
  public void testProblemCase4() {
    String start = "AAAAACCC", end = "AACCCCCC";
    String[] bank = {"TTTTTTTT"};
    LeetCode0433 solution = new LeetCode0433();
    Assert.assertEquals(-1, solution.minMutation(start, end, bank));
  }
}
