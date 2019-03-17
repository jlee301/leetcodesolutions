package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0300;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0300 {
  @Test
  public void testProblemCase() {
    int[] nums = {10, 9, 2, 5, 3, 7, 101, 18};
    LeetCode0300 solution = new LeetCode0300();
    Assert.assertEquals(4, solution.lengthOfLIS(nums));
  }

  @Test
  public void testProblemCaseBiggerPatternShowsLater() {
    int[] nums = {10, 9, 2, 5, 3, 7, 101, 18, 19, 20, 21, 22};
    LeetCode0300 solution = new LeetCode0300();
    Assert.assertEquals(8, solution.lengthOfLIS(nums));
  }

  @Test
  public void testOneElement() {
    int[] nums = {1};
    LeetCode0300 solution = new LeetCode0300();
    Assert.assertEquals(1, solution.lengthOfLIS(nums));
  }

  @Test
  public void testEmpty() {
    int[] nums = {};
    LeetCode0300 solution = new LeetCode0300();
    Assert.assertEquals(0, solution.lengthOfLIS(nums));
  }

  @Test
  public void testNull() {
    int[] nums = null;
    LeetCode0300 solution = new LeetCode0300();
    Assert.assertEquals(0, solution.lengthOfLIS(nums));
  }
  
  @Test
  public void testProblemCaseBruteForce() {
    int[] nums = {10, 9, 2, 5, 3, 7, 101, 18};
    LeetCode0300 solution = new LeetCode0300();
    Assert.assertEquals(4, solution.lengthOfLISBruteForce(nums));
  }

  @Test
  public void testProblemCaseBiggerPatternShowsLaterBruteForce() {
    int[] nums = {10, 9, 2, 5, 3, 7, 101, 18, 19, 20, 21, 22};
    LeetCode0300 solution = new LeetCode0300();
    Assert.assertEquals(8, solution.lengthOfLISBruteForce(nums));
  }

  @Test
  public void testOneElementBruteForce() {
    int[] nums = {1};
    LeetCode0300 solution = new LeetCode0300();
    Assert.assertEquals(1, solution.lengthOfLISBruteForce(nums));
  }

  @Test
  public void testEmptyBruteForce() {
    int[] nums = {};
    LeetCode0300 solution = new LeetCode0300();
    Assert.assertEquals(0, solution.lengthOfLISBruteForce(nums));
  }

  @Test
  public void testNullBruteForce() {
    int[] nums = null;
    LeetCode0300 solution = new LeetCode0300();
    Assert.assertEquals(0, solution.lengthOfLISBruteForce(nums));
  }
}
