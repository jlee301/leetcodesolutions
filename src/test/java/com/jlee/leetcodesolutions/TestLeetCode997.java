package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode997;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode997 {
  @Test
  public void testProblemCase1() {
    int N = 2;
    int[][] trust = {{1,2}};
    LeetCode997 solution = new LeetCode997();
    Assert.assertEquals(2, solution.findJudge(N, trust));
  }
  
  @Test
  public void testProblemCase2() {
    int N = 3;
    int[][] trust = {{1,3},{2,3}};
    LeetCode997 solution = new LeetCode997();
    Assert.assertEquals(3, solution.findJudge(N, trust));
  }
  
  @Test
  public void testProblemCase3() {
    int N = 3;
    int[][] trust = {{1,3},{2,3},{3,1}};
    LeetCode997 solution = new LeetCode997();
    Assert.assertEquals(-1, solution.findJudge(N, trust));
  }

  @Test
  public void testProblemCase4() {
    int N = 3;
    int[][] trust = {{1,2},{2,3}};
    LeetCode997 solution = new LeetCode997();
    Assert.assertEquals(-1, solution.findJudge(N, trust));
  }

  @Test
  public void testProblemCase5() {
    int N = 4;
    int[][] trust = {{1,3},{1,4},{2,3},{2,4},{4,3}};
    LeetCode997 solution = new LeetCode997();
    Assert.assertEquals(3, solution.findJudge(N, trust));
  }

  @Test
  public void testProblemCase6() {
    int N = 1;
    int[][] trust = {};
    LeetCode997 solution = new LeetCode997();
    Assert.assertEquals(1, solution.findJudge(N, trust));
  }
}
