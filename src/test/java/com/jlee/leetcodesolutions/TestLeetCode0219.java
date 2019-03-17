package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0219;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0219 {
  @Test
  public void testProblemCase1() {
    int[] nums = {1,1,2,3};
    int k = 1;
    LeetCode0219 solution = new LeetCode0219();
    Assert.assertTrue(solution.containsNearbyDuplicate(nums, k));
  }

  @Test
  public void testProblemCase2() {
    int[] nums = {1,2,2,3};
    int k = 1;
    LeetCode0219 solution = new LeetCode0219();
    Assert.assertTrue(solution.containsNearbyDuplicate(nums, k));
  }

  @Test
  public void testProblemCase3() {
    int[] nums = {1,2,3,3};
    int k = 1;
    LeetCode0219 solution = new LeetCode0219();
    Assert.assertTrue(solution.containsNearbyDuplicate(nums, k));
  }

  @Test
  public void testProblemCase4() {
    int[] nums = {1,2,3,1};
    int k = 1;
    LeetCode0219 solution = new LeetCode0219();
    Assert.assertFalse(solution.containsNearbyDuplicate(nums, k));
  }

  @Test
  public void testProblemCase5() {
    int[] nums = {1,2,3,1};
    int k = 2;
    LeetCode0219 solution = new LeetCode0219();
    Assert.assertFalse(solution.containsNearbyDuplicate(nums, k));
  }

  @Test
  public void testProblemCase6() {
    int[] nums = {1,2,3,1};
    int k = 3;
    LeetCode0219 solution = new LeetCode0219();
    Assert.assertTrue(solution.containsNearbyDuplicate(nums, k));
  }

  @Test
  public void testProblemCase7() {
    int[] nums = {1,2,3,1};
    int k = 10;
    LeetCode0219 solution = new LeetCode0219();
    Assert.assertTrue(solution.containsNearbyDuplicate(nums, k));
  }

  @Test
  public void testProblemCase8() {
    int[] nums = {1, 2, 3, 1, 4, 1};
    int k = 2;
    LeetCode0219 solution = new LeetCode0219();
    Assert.assertTrue(solution.containsNearbyDuplicate(nums, k));
  }
  
  @Test
  public void testProblemCase9() {
    int[] nums = {1,2,3,1};
    int k = 0;
    LeetCode0219 solution = new LeetCode0219();
    Assert.assertFalse(solution.containsNearbyDuplicate(nums, k));
  }

  @Test
  public void testProblemCase10() {
    int[] nums = {1, 2, 3, 1};
    int k = -1;
    LeetCode0219 solution = new LeetCode0219();
    Assert.assertFalse(solution.containsNearbyDuplicate(nums, k));
  }

  @Test
  public void testProblemCase11() {
    int[] nums = {1, 2, 3, 4};
    int k = 1;
    LeetCode0219 solution = new LeetCode0219();
    Assert.assertFalse(solution.containsNearbyDuplicate(nums, k));
  }

  @Test
  public void testProblemCase12() {
    int[] nums = {1};
    int k = 1;
    LeetCode0219 solution = new LeetCode0219();
    Assert.assertFalse(solution.containsNearbyDuplicate(nums, k));
  }

  @Test
  public void testProblemCase13() {
    int[] nums = {};
    int k = 1;
    LeetCode0219 solution = new LeetCode0219();
    Assert.assertFalse(solution.containsNearbyDuplicate(nums, k));
  }
}
