package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode1031;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode1031 {
  @Test
  public void testProblemCase1() {
    int[][] A = {{0,0,0,0},{1,0,1,0},{0,1,1,0},{0,0,0,0}};
    LeetCode1031 solution = new LeetCode1031();
    Assert.assertEquals(3, solution.numEnclaves(A));
  }

  @Test
  public void testProblemCase2() {
    int[][] A = {{0,1,1,0},{0,0,1,0},{0,0,1,0},{0,0,0,0}};
    LeetCode1031 solution = new LeetCode1031();
    Assert.assertEquals(0, solution.numEnclaves(A));
  }

  @Test
  public void testProblemCase3() {
    int[][] A = {{1,1,1,1,1},{1,0,0,0,1},{1,0,1,0,1},{1,0,0,0,1},{1,1,1,1,1}};
    LeetCode1031 solution = new LeetCode1031();
    Assert.assertEquals(1, solution.numEnclaves(A));
  }
}
