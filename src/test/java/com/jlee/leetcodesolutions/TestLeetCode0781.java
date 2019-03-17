package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0781;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0781 {
  @Test
  public void testProblemCase1() {
    int[] answers = {1,1,2};
    LeetCode0781 solution = new LeetCode0781();
    Assert.assertEquals(5, solution.numRabbits(answers));
  }
  
  @Test
  public void testProblemCase2() {
    int[] answers = {10,10,10};
    LeetCode0781 solution = new LeetCode0781();
    Assert.assertEquals(11, solution.numRabbits(answers));
  }
  
  @Test
  public void testProblemCase3() {
    int[] answers = {1,0,1,0,0};
    LeetCode0781 solution = new LeetCode0781();
    Assert.assertEquals(5, solution.numRabbits(answers));
  }
  
  @Test
  public void test3() {
    int[] answers = {3};
    LeetCode0781 solution = new LeetCode0781();
    Assert.assertEquals(4, solution.numRabbits(answers));
  }

  @Test
  public void test33() {
    int[] answers = {3,3};
    LeetCode0781 solution = new LeetCode0781();
    Assert.assertEquals(4, solution.numRabbits(answers));
  }

  @Test
  public void test333() {
    int[] answers = {3,3,3};
    LeetCode0781 solution = new LeetCode0781();
    Assert.assertEquals(4, solution.numRabbits(answers));
  }

  @Test
  public void test3333() {
    int[] answers = {3,3,3,3};
    LeetCode0781 solution = new LeetCode0781();
    Assert.assertEquals(4, solution.numRabbits(answers));
  }

  @Test
  public void test33333() {
    int[] answers = {3,3,3,3,3};
    LeetCode0781 solution = new LeetCode0781();
    Assert.assertEquals(8, solution.numRabbits(answers));
  }

  @Test
  public void testEmpty() {
    int[] answers = {};
    LeetCode0781 solution = new LeetCode0781();
    Assert.assertEquals(0, solution.numRabbits(answers));
  }

  @Test
  public void testNull() {
    int[] answers = null;
    LeetCode0781 solution = new LeetCode0781();
    Assert.assertEquals(0, solution.numRabbits(answers));
  }
}
