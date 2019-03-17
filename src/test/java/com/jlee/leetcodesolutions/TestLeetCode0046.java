package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0046;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0046 {
  @Test
  public void testProblemCase() {
    int[] nums = {1,2,3};
    LeetCode0046 solution = new LeetCode0046();
    List<List<Integer>> result = solution.permute(nums);
    Assert.assertEquals(6, result.size());
    Assert.assertEquals(3, result.get(0).size());
    Assert.assertEquals(1, (int) result.get(0).get(0));
    Assert.assertEquals(2, (int) result.get(0).get(1));
    Assert.assertEquals(3, (int) result.get(0).get(2));
    Assert.assertEquals(3, result.get(1).size());
    Assert.assertEquals(1, (int) result.get(1).get(0));
    Assert.assertEquals(3, (int) result.get(1).get(1));
    Assert.assertEquals(2, (int) result.get(1).get(2));
    Assert.assertEquals(3, result.get(2).size());
    Assert.assertEquals(2, (int) result.get(2).get(0));
    Assert.assertEquals(1, (int) result.get(2).get(1));
    Assert.assertEquals(3, (int) result.get(2).get(2));
    Assert.assertEquals(3, result.get(3).size());
    Assert.assertEquals(2, (int) result.get(3).get(0));
    Assert.assertEquals(3, (int) result.get(3).get(1));
    Assert.assertEquals(1, (int) result.get(3).get(2));
    Assert.assertEquals(3, result.get(4).size());
    Assert.assertEquals(3, (int) result.get(4).get(0));
    Assert.assertEquals(1, (int) result.get(4).get(1));
    Assert.assertEquals(2, (int) result.get(4).get(2));
    Assert.assertEquals(3, result.get(5).size());
    Assert.assertEquals(3, (int) result.get(5).get(0));
    Assert.assertEquals(2, (int) result.get(5).get(1));
    Assert.assertEquals(1, (int) result.get(5).get(2));
  }

  @Test
  public void testEmpty() {
    int[] nums = {};
    LeetCode0046 solution = new LeetCode0046();
    List<List<Integer>> result = solution.permute(nums);
    Assert.assertEquals(0, result.size());
  }

  @Test
  public void testNull() {
    int[] nums = null;
    LeetCode0046 solution = new LeetCode0046();
    List<List<Integer>> result = solution.permute(nums);
    Assert.assertEquals(0, result.size());
  }
}
