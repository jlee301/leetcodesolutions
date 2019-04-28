package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode1036;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode1036 {
  @Test
  public void testProblemCase1() {
    int[][] blocked = {{0,1},{1,0}};
    int[] source = {0,0}, target = {0,2};
    LeetCode1036 solution = new LeetCode1036();
    Assert.assertFalse(solution.isEscapePossible(blocked, source, target));
  }

  @Test
  public void testProblemCase2() {
    int[][] blocked = {};
    int[] source = {0,0}, target = {999999,999999};
    LeetCode1036 solution = new LeetCode1036();
    Assert.assertTrue(solution.isEscapePossible(blocked, source, target));
  }
  
  @Test
  public void testProblemCase3() {
    int[][] blocked = {{3,4},{5,4},{4,3},{4,5}};
    int[] source = {0,0}, target = {4,4};
    LeetCode1036 solution = new LeetCode1036();
    Assert.assertFalse(solution.isEscapePossible(blocked, source, target));
  }

  @Test
  public void testProblemCase4() {
    int[][] blocked = {{3,4},{5,4},{4,3},{4,5}};
    int[] source = {999999,0}, target = {0,2};
    LeetCode1036 solution = new LeetCode1036();
    Assert.assertTrue(solution.isEscapePossible(blocked, source, target));
  }

  @Test
  public void testProblemCase5() {
    int[][] blocked = {{3,4},{5,4},{4,3},{4,5}};
    int[] source = {999999,999999}, target = {0,2};
    LeetCode1036 solution = new LeetCode1036();
    Assert.assertTrue(solution.isEscapePossible(blocked, source, target));
  }

  @Test
  public void testProblemCase6() {
    int[][] blocked = {{3,4},{5,4},{4,3},{4,5}};
    int[] source = {0,999999}, target = {0,2};
    LeetCode1036 solution = new LeetCode1036();
    Assert.assertTrue(solution.isEscapePossible(blocked, source, target));
  }

  @Test
  public void testProblemCase7() {
    int[][] blocked = {{3,4},{5,4},{4,3},{4,5}};
    int[] source = {0,0}, target = {0,1};
    LeetCode1036 solution = new LeetCode1036();
    Assert.assertTrue(solution.isEscapePossible(blocked, source, target));
  }
}
