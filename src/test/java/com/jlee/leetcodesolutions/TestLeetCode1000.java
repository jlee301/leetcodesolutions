package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode1000;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode1000 {
  @Test
  public void testProblemCase1() {
    int[] stones = {3,2,4,1};
    int K = 2;
    LeetCode1000 solution = new LeetCode1000();
    Assert.assertEquals(20, solution.mergeStones(stones, K));
  }

  @Test
  public void testProblemCase2() {
    int[] stones = {3,2,4,1};
    int K = 3;
    LeetCode1000 solution = new LeetCode1000();
    Assert.assertEquals(-1, solution.mergeStones(stones, K));
  }

  @Test
  public void testProblemCase3() {
    int[] stones = {3,5,1,2,6};
    int K = 3;
    LeetCode1000 solution = new LeetCode1000();
    Assert.assertEquals(25, solution.mergeStones(stones, K));
  }

  @Test
  public void testProblemCase4() {
    int[] stones = {1};
    int K = 2;
    LeetCode1000 solution = new LeetCode1000();
    Assert.assertEquals(0, solution.mergeStones(stones, K));
  }

  @Test
  public void testProblemCase5() {
    int[] stones = {69,39,79,78,16,6,36,97,79,27,14,31,4};
    int K = 2;
    LeetCode1000 solution = new LeetCode1000();
    Assert.assertEquals(1957, solution.mergeStones(stones, K));
  }

  @Test
  public void testProblemCase6() {
    int[] stones = {3,2,4,1};
    int K = 4;
    LeetCode1000 solution = new LeetCode1000();
    Assert.assertEquals(10, solution.mergeStones(stones, K));
  }
}
