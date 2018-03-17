package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode347;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode347 {
  @Test
  public void testProblemCase() {
    int[] nums = {1,1,1,2,2,3};
    int k = 2;
    LeetCode347 solution = new LeetCode347();
    List<Integer> result = solution.topKFrequent(nums, k);
    Assert.assertEquals(2, result.size());
    Assert.assertEquals(1, (int) result.get(0));
    Assert.assertEquals(2, (int) result.get(1));
  }

  @Test
  public void testGiveMeAll() {
    int[] nums = {1,1,1,2,2,3};
    int k = 3;
    LeetCode347 solution = new LeetCode347();
    List<Integer> result = solution.topKFrequent(nums, k);
    Assert.assertEquals(3, result.size());
    Assert.assertEquals(1, (int) result.get(0));
    Assert.assertEquals(2, (int) result.get(1));
    Assert.assertEquals(3, (int) result.get(2));
  }

  @Test
  public void testGiveMeTop1() {
    int[] nums = {1,1,1,2,2,3};
    int k = 1;
    LeetCode347 solution = new LeetCode347();
    List<Integer> result = solution.topKFrequent(nums, k);
    Assert.assertEquals(1, result.size());
    Assert.assertEquals(1, (int) result.get(0));
  }

  @Test
  public void testWrongAnswer() {
    int[] nums = {4,1,-1,2,-1,2,3};
    int k = 2;
    LeetCode347 solution = new LeetCode347();
    List<Integer> result = solution.topKFrequent(nums, k);
    Assert.assertEquals(2, result.size());
    Assert.assertEquals(-1, (int) result.get(0));
    Assert.assertEquals(2, (int) result.get(1));
  }

  @Test
  public void testEmpty() {
    int[] nums = {};
    int k = 1;
    LeetCode347 solution = new LeetCode347();
    List<Integer> result = solution.topKFrequent(nums, k);
    Assert.assertEquals(0, result.size());
  }

  @Test
  public void testNull() {
    int[] nums = null;
    int k = 1;
    LeetCode347 solution = new LeetCode347();
    List<Integer> result = solution.topKFrequent(nums, k);
    Assert.assertEquals(0, result.size());
  }
}
