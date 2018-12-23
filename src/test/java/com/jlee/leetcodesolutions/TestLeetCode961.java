package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode961;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode961 {
  @Test
  public void testProblemCase1() {
    int[] A = {1,2,3,3};
    LeetCode961 solution = new LeetCode961();
    Assert.assertEquals(3, solution.repeatedNTimes(A));
  }

  @Test
  public void testProblemCase2() {
    int[] A = {2,1,2,5,3,2};
    LeetCode961 solution = new LeetCode961();
    Assert.assertEquals(2, solution.repeatedNTimes(A));
  }

  @Test
  public void testProblemCase3() {
    int[] A = {5,1,5,2,5,3,5,4};
    LeetCode961 solution = new LeetCode961();
    Assert.assertEquals(5, solution.repeatedNTimes(A));
  }

  @Test
  public void testProblemCase4() {
    int[] A = {1,1,1,1,2,3,4,5};
    LeetCode961 solution = new LeetCode961();
    Assert.assertEquals(1, solution.repeatedNTimes(A));
  }
}
