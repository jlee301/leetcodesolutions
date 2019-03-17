package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0062;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0062 {
  @Test
  public void test1By1() {
    int m = 1, n = 1;
    LeetCode0062 solution = new LeetCode0062();
    Assert.assertEquals(1, solution.uniquePaths(m, n));
  }

  @Test
  public void test1By2() {
    int m = 1, n = 2;
    LeetCode0062 solution = new LeetCode0062();
    Assert.assertEquals(1, solution.uniquePaths(m, n));
  }

  @Test
  public void test1By3() {
    int m = 1, n = 3;
    LeetCode0062 solution = new LeetCode0062();
    Assert.assertEquals(1, solution.uniquePaths(m, n));
  }

  @Test
  public void test2By1() {
    int m = 2, n = 1;
    LeetCode0062 solution = new LeetCode0062();
    Assert.assertEquals(1, solution.uniquePaths(m, n));
  }

  @Test
  public void test2By2() {
    int m = 2, n = 2;
    LeetCode0062 solution = new LeetCode0062();
    Assert.assertEquals(2, solution.uniquePaths(m, n));
  }

  @Test
  public void test2By3() {
    int m = 2, n = 3;
    LeetCode0062 solution = new LeetCode0062();
    Assert.assertEquals(3, solution.uniquePaths(m, n));
  }

  @Test
  public void test3By1() {
    int m = 3, n = 1;
    LeetCode0062 solution = new LeetCode0062();
    Assert.assertEquals(1, solution.uniquePaths(m, n));
  }

  @Test
  public void test3By2() {
    int m = 3, n = 2;
    LeetCode0062 solution = new LeetCode0062();
    Assert.assertEquals(3, solution.uniquePaths(m, n));
  }

  @Test
  public void test3By3() {
    int m = 3, n = 3;
    LeetCode0062 solution = new LeetCode0062();
    Assert.assertEquals(6, solution.uniquePaths(m, n));
  }

  @Test
  public void testM0() {
    int m = 0, n = 1;
    LeetCode0062 solution = new LeetCode0062();
    Assert.assertEquals(0, solution.uniquePaths(m, n));
  }

  @Test
  public void testN0() {
    int m = 1, n = 0;
    LeetCode0062 solution = new LeetCode0062();
    Assert.assertEquals(0, solution.uniquePaths(m, n));
  }
}
