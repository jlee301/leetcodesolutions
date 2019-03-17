package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0964;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0964 {
  @Test
  public void testProblemCase1() {
    int x = 3, target = 19;
    LeetCode0964 solution = new LeetCode0964();
    Assert.assertEquals(5, solution.leastOpsExpressTarget(x, target));
  }

  @Test
  public void testProblemCase2() {
    int x = 5, target = 501;
    LeetCode0964 solution = new LeetCode0964();
    Assert.assertEquals(8, solution.leastOpsExpressTarget(x, target));
  }

  @Test
  public void testProblemCase3() {
    int x = 100, target = 100000000;
    LeetCode0964 solution = new LeetCode0964();
    Assert.assertEquals(3, solution.leastOpsExpressTarget(x, target));
  }
  
  @Test
  public void testProblemCase4() {
    int x = 100, target = 200000000;
    LeetCode0964 solution = new LeetCode0964();
    Assert.assertEquals(7, solution.leastOpsExpressTarget(x, target));
  }
}
