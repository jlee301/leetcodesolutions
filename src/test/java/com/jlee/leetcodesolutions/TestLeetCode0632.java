package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0632;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0632 {
  @Test
  public void testProblemCase1() {
    // Input:[[4,10,15,24,26], [0,9,12,20], [5,18,22,30]]
    // Output: [20,24]
    List<List<Integer>> nums = new ArrayList<>();
    nums.add(Arrays.asList(4,10,15,24,26));
    nums.add(Arrays.asList(0,9,12,20));
    nums.add(Arrays.asList(5,18,22,30));
    LeetCode0632 solution = new LeetCode0632();
    Assert.assertArrayEquals(new int[] {20,24}, solution.smallestRange(nums));
  }

  @Test
  public void testProblemCase2() {
    // Input:[[0,1], [0,2], [0,3]]
    // Output: [0,0]
    List<List<Integer>> nums = new ArrayList<>();
    nums.add(Arrays.asList(0,1));
    nums.add(Arrays.asList(0,2));
    nums.add(Arrays.asList(0,3));
    LeetCode0632 solution = new LeetCode0632();
    Assert.assertArrayEquals(new int[] {0,0}, solution.smallestRange(nums));
  }

  @Test
  public void testProblemCase3() {
    // Input:[[0,1], [2,3], [4,5]]
    // Output: [1,4]
    List<List<Integer>> nums = new ArrayList<>();
    nums.add(Arrays.asList(0,1));
    nums.add(Arrays.asList(2,3));
    nums.add(Arrays.asList(4,5));
    LeetCode0632 solution = new LeetCode0632();
    Assert.assertArrayEquals(new int[] {1,4}, solution.smallestRange(nums));
  }
}
