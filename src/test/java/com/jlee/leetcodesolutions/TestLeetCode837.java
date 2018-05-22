package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode837;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode837 {
  @Test
  public void testProblemCase1() {
    int N = 10, K = 1, W = 10;
    LeetCode837 solution = new LeetCode837();
    Assert.assertEquals(1.0, solution.new21Game(N, K, W), 0.1);
  }

  @Test
  public void testProblemCase2() {
    int N = 6, K = 1, W = 10;
    LeetCode837 solution = new LeetCode837();
    Assert.assertEquals(0.6, solution.new21Game(N, K, W), 0.0);
  }

  @Test
  public void testProblemCase3() {
    int N = 21, K = 17, W = 10;
    LeetCode837 solution = new LeetCode837();
    Assert.assertEquals(0.73278, solution.new21Game(N, K, W), 0.00001);
  }

  @Test
  public void testTLE() {
    int N = 7597, K = 4797, W = 5726;
    LeetCode837 solution = new LeetCode837();
    Assert.assertEquals(0.74386, solution.new21Game(N, K, W), 0.00001);
  }

  @Test
  public void testTLE2() {
    int N = 2408, K = 2109, W = 1771;
    LeetCode837 solution = new LeetCode837();
    Assert.assertEquals(0.29463, solution.new21Game(N, K, W), 0.00001);
  }
  
  @Test
  public void testK0() {
    int N = 10, K = 0, W = 10;
    LeetCode837 solution = new LeetCode837();
    Assert.assertEquals(1.0, solution.new21Game(N, K, W), 0.1);
  }

  @Test
  public void testNBiggerThanOutcome() {
    int N = 11, K = 1, W = 10;
    LeetCode837 solution = new LeetCode837();
    Assert.assertEquals(1.0, solution.new21Game(N, K, W), 0.1);
  }
}
