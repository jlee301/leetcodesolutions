package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0839;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0839 {
  @Test
  public void testProblemCase() {
    String[] A = {"tars","rats","arts","star"};
    LeetCode0839 solution = new LeetCode0839();
    Assert.assertEquals(2, solution.numSimilarGroups(A));
  }

  @Test
  public void testOneWord() {
    String[] A = {"tars"};
    LeetCode0839 solution = new LeetCode0839();
    Assert.assertEquals(1, solution.numSimilarGroups(A));
  }

  @Test
  public void testEmpty() {
    String[] A = {};
    LeetCode0839 solution = new LeetCode0839();
    Assert.assertEquals(0, solution.numSimilarGroups(A));
  }

  @Test
  public void testNull() {
    String[] A = null;
    LeetCode0839 solution = new LeetCode0839();
    Assert.assertEquals(0, solution.numSimilarGroups(A));
  }
}
