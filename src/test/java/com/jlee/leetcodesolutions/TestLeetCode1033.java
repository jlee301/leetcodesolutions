package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode1033;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode1033 {
  @Test
  public void testProblemCase1() {
    int a = 1, b = 2, c = 5;
    LeetCode1033 solution = new LeetCode1033();
    Assert.assertArrayEquals(new int[] {1,2}, solution.numMovesStones(a, b, c));
  }

  @Test
  public void testProblemCase2() {
    int a = 4, b = 3, c = 2;
    LeetCode1033 solution = new LeetCode1033();
    Assert.assertArrayEquals(new int[] {0,0}, solution.numMovesStones(a, b, c));
  }

  @Test
  public void testProblemCase3() {
    int a = 5, b = 8, c = 20;
    LeetCode1033 solution = new LeetCode1033();
    Assert.assertArrayEquals(new int[] {2,13}, solution.numMovesStones(a, b, c));
  }

  @Test
  public void testProblemCase4() {
    int a = 1, b = 4, c = 3;
    LeetCode1033 solution = new LeetCode1033();
    Assert.assertArrayEquals(new int[] {1,1}, solution.numMovesStones(a, b, c));
  }

  @Test
  public void testProblemCase5() {
    int a = 3, b = 5, c = 1;
    LeetCode1033 solution = new LeetCode1033();
    Assert.assertArrayEquals(new int[] {1,2}, solution.numMovesStones(a, b, c));
  }

  @Test
  public void testProblemCase6() {
    int a = 1, b = 5, c = 7;
    LeetCode1033 solution = new LeetCode1033();
    Assert.assertArrayEquals(new int[] {1,4}, solution.numMovesStones(a, b, c));
  }
}
