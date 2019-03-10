package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode1006;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode1006 {
  @Test
  public void testProblemCase1() {
    int N = 4;
    LeetCode1006 solution = new LeetCode1006();
    Assert.assertEquals(7, solution.clumsy(N));
  }

  @Test
  public void testProblemCase2() {
    int N = 10;
    LeetCode1006 solution = new LeetCode1006();
    Assert.assertEquals(12, solution.clumsy(N));
  }
  
  @Test
  public void testProblemCase3() {
    int N = 1;
    LeetCode1006 solution = new LeetCode1006();
    Assert.assertEquals(1, solution.clumsy(N));
  }

  @Test
  public void testProblemCase4() {
    int N = 2;
    LeetCode1006 solution = new LeetCode1006();
    Assert.assertEquals(2, solution.clumsy(N));
  }

  @Test
  public void testProblemCase5() {
    int N = 3;
    LeetCode1006 solution = new LeetCode1006();
    Assert.assertEquals(6, solution.clumsy(N));
  }
}
