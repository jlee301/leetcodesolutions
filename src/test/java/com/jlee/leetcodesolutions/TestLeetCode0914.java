package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0914;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0914 {
  @Test
  public void testProblemCase1() {
    int[] deck = {1,2,3,4,4,3,2,1};
    LeetCode0914 solution = new LeetCode0914();
    Assert.assertTrue(solution.hasGroupsSizeX(deck));
  }

  @Test
  public void testProblemCase2() {
    int[] deck = {1,1,1,2,2,2,3,3};
    LeetCode0914 solution = new LeetCode0914();
    Assert.assertFalse(solution.hasGroupsSizeX(deck));
  }

  @Test
  public void testProblemCase3() {
    int[] deck = {1};
    LeetCode0914 solution = new LeetCode0914();
    Assert.assertFalse(solution.hasGroupsSizeX(deck));
  }

  @Test
  public void testProblemCase4() {
    int[] deck = {1,1};
    LeetCode0914 solution = new LeetCode0914();
    Assert.assertTrue(solution.hasGroupsSizeX(deck));
  }
  
  @Test
  public void testProblemCase5() {
    int[] deck = {1,1,2,2,2,2};
    LeetCode0914 solution = new LeetCode0914();
    Assert.assertTrue(solution.hasGroupsSizeX(deck));
  }
  
  @Test
  public void testProblemCase6() {
    int[] deck = {0,0,0,1,1,1,2,2,2};
    LeetCode0914 solution = new LeetCode0914();
    Assert.assertTrue(solution.hasGroupsSizeX(deck));
  }

  @Test
  public void testProblemCase7() {
    int[] deck = {1,1,1,1,2,2,2,2,2,2};
    LeetCode0914 solution = new LeetCode0914();
    Assert.assertTrue(solution.hasGroupsSizeX(deck));
  }

  @Test
  public void testProblemCase8() {
    int[] deck = {};
    LeetCode0914 solution = new LeetCode0914();
    Assert.assertFalse(solution.hasGroupsSizeX(deck));
  }

  @Test
  public void testProblemCase9() {
    int[] deck = null;
    LeetCode0914 solution = new LeetCode0914();
    Assert.assertFalse(solution.hasGroupsSizeX(deck));
  }
}
