package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode628;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode628 {
  @Test
  public void testProblemCase1() {
    int[] nums = {3,2,1};
    LeetCode628 solution = new LeetCode628();
    Assert.assertEquals(6, solution.maximumProduct(nums));
  }

  @Test
  public void testProblemCase2() {
    int[] nums = {4,3,2,1};
    LeetCode628 solution = new LeetCode628();
    Assert.assertEquals(24, solution.maximumProduct(nums));
  }

  @Test
  public void testProblemCase3() {
    int[] nums = {-5,-4,1,2,3};
    LeetCode628 solution = new LeetCode628();
    Assert.assertEquals(60, solution.maximumProduct(nums));
  }

  @Test
  public void testProblemCase4() {
    int[] nums = {-5,-1,2,3,4};
    LeetCode628 solution = new LeetCode628();
    Assert.assertEquals(24, solution.maximumProduct(nums));
  }

  @Test
  public void testProblemCase5() {
    int[] nums = {-5,-4,-1,-2,-3};
    LeetCode628 solution = new LeetCode628();
    Assert.assertEquals(-6, solution.maximumProduct(nums));
  }

  @Test
  public void testProblemCase6() {
    int[] nums = {-5,-4,5,4};
    LeetCode628 solution = new LeetCode628();
    Assert.assertEquals(100, solution.maximumProduct(nums));
  }

  @Test
  public void testProblemCase7() {
    int[] nums = {-5,-4,3};
    LeetCode628 solution = new LeetCode628();
    Assert.assertEquals(60, solution.maximumProduct(nums));
  }
  
  @Test
  public void testProblemCase8() {
    int[] nums = {0,0,0,0};
    LeetCode628 solution = new LeetCode628();
    Assert.assertEquals(0, solution.maximumProduct(nums));
  }  

  @Test
  public void testProblemCase9() {
    int[] nums = {1,1,1,1};
    LeetCode628 solution = new LeetCode628();
    Assert.assertEquals(1, solution.maximumProduct(nums));
  }  
}
