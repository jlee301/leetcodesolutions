package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode1039;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode1039 {
  @Test
  public void testProblemCase1() {
    int[] A = {1,2,3};
    LeetCode1039 solution = new LeetCode1039();
    Assert.assertEquals(6, solution.minScoreTriangulation(A));
  }

  @Test
  public void testProblemCase2() {
    int[] A = {3,7,4,5};
    LeetCode1039 solution = new LeetCode1039();
    Assert.assertEquals(144, solution.minScoreTriangulation(A));
  }

  @Test
  public void testProblemCase3() {
    int[] A = {1,3,1,4,1,5};
    LeetCode1039 solution = new LeetCode1039();
    Assert.assertEquals(13, solution.minScoreTriangulation(A));
  }
}
