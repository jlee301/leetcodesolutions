package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0442;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0442 {
  @Test
  public void testProblemCase() {
    int[] nums = {4,3,2,7,8,2,3,1};
    LeetCode0442 solution = new LeetCode0442();
    List<Integer> result = solution.findDuplicates(nums);
    Assert.assertEquals(2, result.size());
    Assert.assertEquals(2, (int) result.get(0));
    Assert.assertEquals(3, (int) result.get(1));
  }

  @Test
  public void testNoDuplicates() {
    int[] nums = {4,3,2,7,8,1};
    LeetCode0442 solution = new LeetCode0442();
    List<Integer> result = solution.findDuplicates(nums);
    Assert.assertEquals(0, result.size());
  }

  @Test
  public void testEmpty() {
    int[] nums = {};
    LeetCode0442 solution = new LeetCode0442();
    List<Integer> result = solution.findDuplicates(nums);
    Assert.assertEquals(0, result.size());
  }

  @Test
  public void testNull() {
    int[] nums = null;
    LeetCode0442 solution = new LeetCode0442();
    List<Integer> result = solution.findDuplicates(nums);
    Assert.assertEquals(0, result.size());
  }
}
