package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode1031;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode1031 {
  @Test
  public void testProblemCase1() {
    int[] A = {0,6,5,2,2,5,1,9,4};
    int L = 1, M = 2;
    LeetCode1031 solution = new LeetCode1031();
    Assert.assertEquals(20, solution.maxSumTwoNoOverlap(A, L, M));
  }

  @Test
  public void testProblemCase2() {
    int[] A = {3,8,1,3,2,1,8,9,0};
    int L = 3, M = 2;
    LeetCode1031 solution = new LeetCode1031();
    Assert.assertEquals(29, solution.maxSumTwoNoOverlap(A, L, M));
  }

  @Test
  public void testProblemCase3() {
    int[] A = {2,1,5,6,0,9,5,0,3,8};
    int L = 4, M = 3;
    LeetCode1031 solution = new LeetCode1031();
    Assert.assertEquals(31, solution.maxSumTwoNoOverlap(A, L, M));
  }

  @Test
  public void testProblemCase4() {
    int[] A = {4,5,14,16,16,20,7,13,8,15};
    int L = 3, M = 5;
    LeetCode1031 solution = new LeetCode1031();
    Assert.assertEquals(109, solution.maxSumTwoNoOverlap(A, L, M));
  }
}
