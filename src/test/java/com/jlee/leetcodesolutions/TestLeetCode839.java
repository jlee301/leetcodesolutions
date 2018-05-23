package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode839;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode839 {
  @Test
  public void testProblemCase() {
    String[] A = {"tars","rats","arts","star"};
    LeetCode839 solution = new LeetCode839();
    Assert.assertEquals(2, solution.numSimilarGroups(A));
  }

  @Test
  public void testOneWord() {
    String[] A = {"tars"};
    LeetCode839 solution = new LeetCode839();
    Assert.assertEquals(1, solution.numSimilarGroups(A));
  }

  @Test
  public void testEmpty() {
    String[] A = {};
    LeetCode839 solution = new LeetCode839();
    Assert.assertEquals(0, solution.numSimilarGroups(A));
  }

  @Test
  public void testNull() {
    String[] A = null;
    LeetCode839 solution = new LeetCode839();
    Assert.assertEquals(0, solution.numSimilarGroups(A));
  }
}
