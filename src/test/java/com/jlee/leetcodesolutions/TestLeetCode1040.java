package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode1040;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode1040 {
  @Test
  public void testProblemCase1() {
    int[] stones = {7,4,9};
    LeetCode1040 solution = new LeetCode1040();
    Assert.assertArrayEquals(new int[] {1,2}, solution.numMovesStonesII(stones));
  }

  @Test
  public void testProblemCase2() {
    int[] stones = {6,5,4,3,10};
    LeetCode1040 solution = new LeetCode1040();
    Assert.assertArrayEquals(new int[] {2,3}, solution.numMovesStonesII(stones));
  }

  @Test
  public void testProblemCase3() {
    int[] stones = {100,101,104,102,103};
    LeetCode1040 solution = new LeetCode1040();
    Assert.assertArrayEquals(new int[] {0,0}, solution.numMovesStonesII(stones));
  }

  @Test
  public void testProblemCase4() {
    int[] stones = {3,4,5,10};
    LeetCode1040 solution = new LeetCode1040();
    Assert.assertArrayEquals(new int[] {2,4}, solution.numMovesStonesII(stones));
  }

  @Test
  public void testProblemCase5() {
    int[] stones = {3,7,9,10};
    LeetCode1040 solution = new LeetCode1040();
    Assert.assertArrayEquals(new int[] {1,4}, solution.numMovesStonesII(stones));
  }
  
  @Test
  public void testProblemCase6() {
    int[] stones = {2,3,7,10};
    LeetCode1040 solution = new LeetCode1040();
    Assert.assertArrayEquals(new int[] {2,5}, solution.numMovesStonesII(stones));
  }

  @Test
  public void testProblemCase7() {
    int[] stones = {5,6,7,8,10};
    LeetCode1040 solution = new LeetCode1040();
    Assert.assertArrayEquals(new int[] {1,1}, solution.numMovesStonesII(stones));
  }

  @Test
  public void testProblemCase8() {
    int[] stones = {5,7,8,9,10};
    LeetCode1040 solution = new LeetCode1040();
    Assert.assertArrayEquals(new int[] {1,1}, solution.numMovesStonesII(stones));
  }
}
