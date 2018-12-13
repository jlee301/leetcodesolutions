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
  public void testProblemCase3() {
    int[] g = {5,4,3};
    int[] s = {1,1,1};
    LeetCode455 solution = new LeetCode455();
    Assert.assertEquals(0, solution.findContentChildren(g, s));
  }

  @Test
  public void testProblemCase4() {
    int[] g = {5,4,3};
    int[] s = {1,1,1,2,2,2,8,8,8};
    LeetCode455 solution = new LeetCode455();
    Assert.assertEquals(3, solution.findContentChildren(g, s));
  }
  
  @Test
  public void testProblemCase5() {
    int[] g = {};
    int[] s = {1,2,3};
    LeetCode455 solution = new LeetCode455();
    Assert.assertEquals(0, solution.findContentChildren(g, s));
  }

  @Test
  public void testProblemCase6() {
    int[] g = {1,2,3};
    int[] s = {};
    LeetCode455 solution = new LeetCode455();
    Assert.assertEquals(0, solution.findContentChildren(g, s));
  }

  @Test
  public void testProblemCase7() {
    int[] g = {};
    int[] s = {};
    LeetCode455 solution = new LeetCode455();
    Assert.assertEquals(0, solution.findContentChildren(g, s));
  }
}
