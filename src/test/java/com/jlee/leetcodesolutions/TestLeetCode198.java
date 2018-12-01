package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode198;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode198 {
  @Test
  public void testProblemCase1() {
    LeetCode198 solution = new LeetCode198();
    int[] nums = {5, 1, 2, 10, 15, 20};
    int result = solution.rob(nums);
    Assert.assertEquals(35,  result);
  }

  @Test
  public void testProblemCase2() {
    LeetCode198 solution = new LeetCode198();
    int[] nums = {5, 1, 10, 2, 15, 20};
    int result = solution.rob(nums);
    Assert.assertEquals(35,  result);
  }
  
  @Test
  public void testProblemCase3() {
    LeetCode198 solution = new LeetCode198();
    int[] nums = {5};
    int result = solution.rob(nums);
    Assert.assertEquals(5,  result);
  }

  @Test
  public void testProblemCase4() {
    LeetCode198 solution = new LeetCode198();
    int[] nums = {1,5};
    int result = solution.rob(nums);
    Assert.assertEquals(5,  result);
  }

  @Test
  public void testProblemCase5() {
    LeetCode198 solution = new LeetCode198();
    int[] nums = {5,1};
    int result = solution.rob(nums);
    Assert.assertEquals(5,  result);
  }

  @Test
  public void testProblemCase6() {
    LeetCode198 solution = new LeetCode198();
    int[] nums = {5,5};
    int result = solution.rob(nums);
    Assert.assertEquals(5,  result);
  }
  
  @Test
  public void testProblemCase7() {
    LeetCode198 solution = new LeetCode198();
    int[] nums = {1, 2, 5};
    int result = solution.rob(nums);
    Assert.assertEquals(6,  result);
  }

  @Test
  public void testProblemCase8() {
    LeetCode198 solution = new LeetCode198();
    int[] nums = {5, 2, 1};
    int result = solution.rob(nums);
    Assert.assertEquals(6,  result);
  }
  @Test
  public void testProblemCase9() {
    LeetCode198 solution = new LeetCode198();
    int[] nums = {1, 5, 2};
    int result = solution.rob(nums);
    Assert.assertEquals(5,  result);
  }

  @Test
  public void testProblemCase10() {
    LeetCode198 solution = new LeetCode198();
    int[] nums = {5, 1, 2};
    int result = solution.rob(nums);
    Assert.assertEquals(7,  result);
  }

  @Test
  public void testProblemCase12() {
    LeetCode198 solution = new LeetCode198();
    int[] nums = {5, 5, 2};
    int result = solution.rob(nums);
    Assert.assertEquals(7,  result);
  }

  @Test
  public void testProblemCase13() {
    LeetCode198 solution = new LeetCode198();
    int[] nums = {5, 7, 5};
    int result = solution.rob(nums);
    Assert.assertEquals(10,  result);
  }

  @Test
  public void testProblemCase14() {
    LeetCode198 solution = new LeetCode198();
    int[] nums = {0, 0, 0, 0, 0, 0};
    int result = solution.rob(nums);
    Assert.assertEquals(0,  result);
  }

  @Test
  public void testProblemCase15() {
    LeetCode198 solution = new LeetCode198();
    int[] nums = {};
    int result = solution.rob(nums);
    Assert.assertEquals(0,  result);
  }
  
  @Test
  public void testProblemCase16() {
    LeetCode198 solution = new LeetCode198();
    int[] nums = null;
    int result = solution.rob(nums);
    Assert.assertEquals(0,  result);
  }
}
