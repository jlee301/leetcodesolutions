package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode914;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode914 {
  @Test
  public void testProblemCase1() {
    int[] deck = {1,2,3,4,4,3,2,1};
    LeetCode914 solution = new LeetCode914();
    Assert.assertTrue(solution.hasGroupsSizeX(deck));
  }

  @Test
  public void testProblemCase2() {
    int[] deck = {1,1,1,2,2,2,3,3};
    LeetCode914 solution = new LeetCode914();
    Assert.assertFalse(solution.hasGroupsSizeX(deck));
  }

  @Test
  public void testProblemCase3() {
    int[] deck = {1};
    LeetCode914 solution = new LeetCode914();
    Assert.assertFalse(solution.hasGroupsSizeX(deck));
  }

  @Test
  public void testProblemCase4() {
    int[] deck = {1,1};
    LeetCode914 solution = new LeetCode914();
    Assert.assertTrue(solution.hasGroupsSizeX(deck));
  }
  
  @Test
  public void testProblemCase5() {
    int[] deck = {1,1,2,2,2,2};
    LeetCode914 solution = new LeetCode914();
    Assert.assertTrue(solution.hasGroupsSizeX(deck));
  }
  
  @Test
  public void testProblemCase6() {
    int[] deck = {0,0,0,1,1,1,2,2,2};
    LeetCode914 solution = new LeetCode914();
    Assert.assertTrue(solution.hasGroupsSizeX(deck));
  }

  @Test
  public void testProblemCase7() {
    int[] deck = {1,1,1,1,2,2,2,2,2,2};
    LeetCode914 solution = new LeetCode914();
    Assert.assertTrue(solution.hasGroupsSizeX(deck));
  }

  @Test
  public void testProblemCase8() {
    int[] deck = {};
    LeetCode914 solution = new LeetCode914();
    Assert.assertFalse(solution.hasGroupsSizeX(deck));
  }

  @Test
  public void testProblemCase9() {
    int[] deck = null;
    LeetCode914 solution = new LeetCode914();
    Assert.assertFalse(solution.hasGroupsSizeX(deck));
  }
}
