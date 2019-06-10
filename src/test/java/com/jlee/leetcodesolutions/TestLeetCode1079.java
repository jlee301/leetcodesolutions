package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode1079;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode1079 {
  @Test
  public void testProblemCase1() {
    String tiles = "AAB";
    LeetCode1079 solution = new LeetCode1079();
    Assert.assertEquals(8, solution.numTilePossibilities(tiles));
  }

  @Test
  public void testProblemCase2() {
    String tiles = "AAABBC";
    LeetCode1079 solution = new LeetCode1079();
    Assert.assertEquals(188, solution.numTilePossibilities(tiles));
  }
}
