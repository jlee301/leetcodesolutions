package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode904;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode904 {
  @Test
  public void testProblemCase1() {
    int[] tree = {1,2,1};
    LeetCode904 solution = new LeetCode904();
    Assert.assertEquals(3, solution.totalFruit(tree));
  }

  @Test
  public void testProblemCase2() {
    int[] tree = {0,1,2,2};
    LeetCode904 solution = new LeetCode904();
    Assert.assertEquals(3, solution.totalFruit(tree));
  }

  @Test
  public void testProblemCase3() {
    int[] tree = {1,2,3,2,2};
    LeetCode904 solution = new LeetCode904();
    Assert.assertEquals(4, solution.totalFruit(tree));
  }

  @Test
  public void testProblemCase5() {
    int[] tree = {3,3,3,1,2,1,1,2,3,3,4};
    LeetCode904 solution = new LeetCode904();
    Assert.assertEquals(5, solution.totalFruit(tree));
  }
}
