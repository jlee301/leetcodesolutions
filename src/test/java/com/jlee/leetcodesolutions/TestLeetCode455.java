package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode455;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode455 {
  @Test
  public void testProblemCase1() {
    int[] g = {1,2,3};
    int[] s = {1,1};
    LeetCode455 solution = new LeetCode455();
    Assert.assertEquals(1, solution.findContentChildren(g, s));
  }

  @Test
  public void testProblemCase2() {
    int[] g = {1,2};
    int[] s = {1,2,3};
    LeetCode455 solution = new LeetCode455();
    Assert.assertEquals(2, solution.findContentChildren(g, s));
  }

  @Test
  public void testHungryAssKids() {
    int[] g = {5,4,3};
    int[] s = {1,1,1};
    LeetCode455 solution = new LeetCode455();
    Assert.assertEquals(0, solution.findContentChildren(g, s));
  }

  @Test
  public void testHungryAssKidsOnlyBigCookies() {
    int[] g = {5,4,3};
    int[] s = {1,1,1,2,2,2,8,8,8};
    LeetCode455 solution = new LeetCode455();
    Assert.assertEquals(3, solution.findContentChildren(g, s));
  }
  
  @Test
  public void testEmptyGreed() {
    int[] g = {};
    int[] s = {1,2,3};
    LeetCode455 solution = new LeetCode455();
    Assert.assertEquals(0, solution.findContentChildren(g, s));
  }

  @Test
  public void testEmptyCookies() {
    int[] g = {1,2,3};
    int[] s = {};
    LeetCode455 solution = new LeetCode455();
    Assert.assertEquals(0, solution.findContentChildren(g, s));
  }

  @Test
  public void testEmpty() {
    int[] g = {};
    int[] s = {};
    LeetCode455 solution = new LeetCode455();
    Assert.assertEquals(0, solution.findContentChildren(g, s));
  }

  @Test
  public void testNullGreed() {
    int[] g = null;
    int[] s = {1,2,3};
    LeetCode455 solution = new LeetCode455();
    Assert.assertEquals(0, solution.findContentChildren(g, s));
  }

  @Test
  public void testNullCookies() {
    int[] g = {1,2,3};
    int[] s = null;
    LeetCode455 solution = new LeetCode455();
    Assert.assertEquals(0, solution.findContentChildren(g, s));
  }

  @Test
  public void testNull() {
    int[] g = null;
    int[] s = null;
    LeetCode455 solution = new LeetCode455();
    Assert.assertEquals(0, solution.findContentChildren(g, s));
  }
}
