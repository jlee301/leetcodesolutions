package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode201;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode201 {
  @Test
  public void testProblemCase() {
    int m = 5, n = 7;
    LeetCode201 solution = new LeetCode201();
    Assert.assertEquals(4, solution.rangeBitwiseAnd(m, n));
  }

  @Test
  public void testM5N8() {
    int m = 5, n = 8;
    LeetCode201 solution = new LeetCode201();
    Assert.assertEquals(0, solution.rangeBitwiseAnd(m, n));
  }

  @Test
  public void testM3N3() {
    int m = 3, n = 3;
    LeetCode201 solution = new LeetCode201();
    Assert.assertEquals(3, solution.rangeBitwiseAnd(m, n));
  }

  @Test
  public void testZeroes() {
    int m = 0, n = 0;
    LeetCode201 solution = new LeetCode201();
    Assert.assertEquals(0, solution.rangeBitwiseAnd(m, n));
  }

  @Test
  public void testMAXVALUE() {
    int m = Integer.MAX_VALUE, n = Integer.MAX_VALUE;
    LeetCode201 solution = new LeetCode201();
    Assert.assertEquals(Integer.MAX_VALUE, solution.rangeBitwiseAnd(m, n));
  }
}
