package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0216;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0216 {
  @Test
  public void testProblemCase1() {
    int k = 3, n = 7;
    LeetCode0216 solution = new LeetCode0216();
    List<List<Integer>> result = solution.combinationSum3(k, n);
    Assert.assertEquals(1, result.size());
    Assert.assertEquals(3, result.get(0).size());
    Assert.assertEquals(1, (int) result.get(0).get(0));
    Assert.assertEquals(2, (int) result.get(0).get(1));
    Assert.assertEquals(4, (int) result.get(0).get(2));
  }

  @Test
  public void testProblemCase2() {
    int k = 3, n = 9;
    LeetCode0216 solution = new LeetCode0216();
    List<List<Integer>> result = solution.combinationSum3(k, n);
    Assert.assertEquals(3, result.size());
    Assert.assertEquals(3, result.get(0).size());
    Assert.assertEquals(1, (int) result.get(0).get(0));
    Assert.assertEquals(2, (int) result.get(0).get(1));
    Assert.assertEquals(6, (int) result.get(0).get(2));
    Assert.assertEquals(3, result.get(1).size());
    Assert.assertEquals(1, (int) result.get(1).get(0));
    Assert.assertEquals(3, (int) result.get(1).get(1));
    Assert.assertEquals(5, (int) result.get(1).get(2));
    Assert.assertEquals(3, result.get(2).size());
    Assert.assertEquals(2, (int) result.get(2).get(0));
    Assert.assertEquals(3, (int) result.get(2).get(1));
    Assert.assertEquals(4, (int) result.get(2).get(2));
  }

  @Test
  public void testK0() {
    int k = 0, n = 9;
    LeetCode0216 solution = new LeetCode0216();
    List<List<Integer>> result = solution.combinationSum3(k, n);
    Assert.assertEquals(0, result.size());
  }

  @Test
  public void testKNeg() {
    int k = -1, n = 9;
    LeetCode0216 solution = new LeetCode0216();
    List<List<Integer>> result = solution.combinationSum3(k, n);
    Assert.assertEquals(0, result.size());
  }

  @Test
  public void testN0() {
    int k = 3, n = 0;
    LeetCode0216 solution = new LeetCode0216();
    List<List<Integer>> result = solution.combinationSum3(k, n);
    Assert.assertEquals(0, result.size());
  }

  @Test
  public void testNNeg() {
    int k = 3, n = -1;
    LeetCode0216 solution = new LeetCode0216();
    List<List<Integer>> result = solution.combinationSum3(k, n);
    Assert.assertEquals(0, result.size());
  }
}
