package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode060;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode060 {
  @Test
  public void testN3K1() {
    int n = 3;
    int k = 1;
    LeetCode060 solution = new LeetCode060();
    Assert.assertEquals("123", solution.getPermutation(n, k));
  }

  @Test
  public void testN3K2() {
    int n = 3;
    int k = 2;
    LeetCode060 solution = new LeetCode060();
    Assert.assertEquals("132", solution.getPermutation(n, k));
  }

  @Test
  public void testN3K3() {
    int n = 3;
    int k = 3;
    LeetCode060 solution = new LeetCode060();
    Assert.assertEquals("213", solution.getPermutation(n, k));
  }

  @Test
  public void testN3K4() {
    int n = 3;
    int k = 4;
    LeetCode060 solution = new LeetCode060();
    Assert.assertEquals("231", solution.getPermutation(n, k));
  }

  @Test
  public void testN3K5() {
    int n = 3;
    int k = 5;
    LeetCode060 solution = new LeetCode060();
    Assert.assertEquals("312", solution.getPermutation(n, k));
  }

  @Test
  public void testN3K6() {
    int n = 3;
    int k = 6;
    LeetCode060 solution = new LeetCode060();
    Assert.assertEquals("321", solution.getPermutation(n, k));
  }

  @Test
  public void testTimeLimit() {
    int n = 9;
    int k = 278082;
    LeetCode060 solution = new LeetCode060();
    Assert.assertEquals("792346851", solution.getPermutation(n, k));
  }
  
  @Test
  public void testN3K1Better() {
    int n = 3;
    int k = 1;
    LeetCode060 solution = new LeetCode060();
    Assert.assertEquals("123", solution.getPermutationBetter(n, k));
  }

  @Test
  public void testN3K2Better() {
    int n = 3;
    int k = 2;
    LeetCode060 solution = new LeetCode060();
    Assert.assertEquals("132", solution.getPermutationBetter(n, k));
  }

  @Test
  public void testN3K3Better() {
    int n = 3;
    int k = 3;
    LeetCode060 solution = new LeetCode060();
    Assert.assertEquals("213", solution.getPermutationBetter(n, k));
  }

  @Test
  public void testN3K4Better() {
    int n = 3;
    int k = 4;
    LeetCode060 solution = new LeetCode060();
    Assert.assertEquals("231", solution.getPermutationBetter(n, k));
  }

  @Test
  public void testN3K5Better() {
    int n = 3;
    int k = 5;
    LeetCode060 solution = new LeetCode060();
    Assert.assertEquals("312", solution.getPermutationBetter(n, k));
  }

  @Test
  public void testN3K6Better() {
    int n = 3;
    int k = 6;
    LeetCode060 solution = new LeetCode060();
    Assert.assertEquals("321", solution.getPermutationBetter(n, k));
  }

  @Test
  public void testTimeLimitBetter() {
    int n = 9;
    int k = 278082;
    LeetCode060 solution = new LeetCode060();
    Assert.assertEquals("792346851", solution.getPermutationBetter(n, k));
  }
}
