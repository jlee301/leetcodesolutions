package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode1128;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode1128 {
  @Test
  public void testProblemCase1() {
    int[][] dominoes = {{1,2},{2,1},{3,4},{5,6}};
    LeetCode1128 solution = new LeetCode1128();
    Assert.assertEquals(1, solution.numEquivDominoPairs(dominoes));
  }

  @Test
  public void testProblemCase2() {
    int[][] dominoes = {{2,2},{2,2},{2,2}};
    LeetCode1128 solution = new LeetCode1128();
    Assert.assertEquals(3, solution.numEquivDominoPairs(dominoes));
  }

  @Test
  public void testProblemCase3() {
    int[][] dominoes = {{1,2},{2,3},{3,5}};
    LeetCode1128 solution = new LeetCode1128();
    Assert.assertEquals(0, solution.numEquivDominoPairs(dominoes));
  }
}
