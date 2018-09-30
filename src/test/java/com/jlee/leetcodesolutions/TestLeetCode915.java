package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode915;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode915 {
  @Test
  public void testProblemCase1() {
    int[] A = {5,0,3,8,6};
    LeetCode915 solution = new LeetCode915();
    Assert.assertEquals(3, solution.partitionDisjoint(A));
  }

  @Test
  public void testProblemCase2() {
    int[] A = {1,1,1,0,6,12};
    LeetCode915 solution = new LeetCode915();
    Assert.assertEquals(4, solution.partitionDisjoint(A));
  }

  @Test
  public void testProblemCase3() {
    int[] A = {1,1};
    LeetCode915 solution = new LeetCode915();
    Assert.assertEquals(1, solution.partitionDisjoint(A));
  }

  @Test
  public void testProblemCase4() {
    int[] A = {32,57,24,19,0,24,49,67,87,87};
    LeetCode915 solution = new LeetCode915();
    Assert.assertEquals(7, solution.partitionDisjoint(A));
  }

  @Test
  public void testProblemCase5() {
    int[] A = {5,0,5,6,7};
    LeetCode915 solution = new LeetCode915();
    Assert.assertEquals(2, solution.partitionDisjoint(A));
  }
}
