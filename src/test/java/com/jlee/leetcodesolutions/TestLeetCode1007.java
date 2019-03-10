package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode1007;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode1007 {
  @Test
  public void testProblemCase1() {
    int[] A = {2,1,2,4,2,2}, B = {5,2,6,2,3,2};
    LeetCode1007 solution = new LeetCode1007();
    Assert.assertEquals(2, solution.minDominoRotations(A, B));
  }

  @Test
  public void testProblemCase2() {
    int[] A = {3,5,1,2,3}, B = {3,6,3,3,4};
    LeetCode1007 solution = new LeetCode1007();
    Assert.assertEquals(-1, solution.minDominoRotations(A, B));
  }

  @Test
  public void testProblemCase3() {
    int[] A = {3,3,3,3,3}, B = {3,3,3,3,3};
    LeetCode1007 solution = new LeetCode1007();
    Assert.assertEquals(0, solution.minDominoRotations(A, B));
  }

  @Test
  public void testProblemCase4() {
    int[] A = {3,3,3,2,1}, B = {3,3,3,3,3};
    LeetCode1007 solution = new LeetCode1007();
    Assert.assertEquals(0, solution.minDominoRotations(A, B));
  }
}
