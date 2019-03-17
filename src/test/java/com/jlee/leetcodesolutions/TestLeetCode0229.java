package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0229;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0229 {
  @Test
  public void testMoreThan3TwoNumbers() {
    int[] nums = {3,3,3,3,4,4,4,4,4};
    LeetCode0229 solution = new LeetCode0229();
    List<Integer> result = solution.majorityElement(nums);
    Assert.assertEquals(2, result.size());
    Assert.assertEquals(3, (int) result.get(0)); 
    Assert.assertEquals(4, (int) result.get(1)); 
  }
  
  @Test
  public void testMoreThan3AllSame() {
    int[] nums = {4,4,4,4,4,4,4,4,4};
    LeetCode0229 solution = new LeetCode0229();
    List<Integer> result = solution.majorityElement(nums);
    Assert.assertEquals(1, result.size());
    Assert.assertEquals(4, (int) result.get(0)); 
  }

  @Test
  public void testMoreThan3() {
    int[] nums = {1,2,3,3,3,4,4,4,4};
    LeetCode0229 solution = new LeetCode0229();
    List<Integer> result = solution.majorityElement(nums);
    Assert.assertEquals(1, result.size());
    Assert.assertEquals(4, (int) result.get(0)); 
  }

  @Test
  public void testMoreThan2() {
    int[] nums = {1,2,2,2,3,3};
    LeetCode0229 solution = new LeetCode0229();
    List<Integer> result = solution.majorityElement(nums);
    Assert.assertEquals(1, result.size());
    Assert.assertEquals(2, (int) result.get(0)); 
  }

  @Test
  public void testMoreThan1() {
    int[] nums = {1,2,2};
    LeetCode0229 solution = new LeetCode0229();
    List<Integer> result = solution.majorityElement(nums);
    Assert.assertEquals(1, result.size());
    Assert.assertEquals(2, (int) result.get(0)); 
  }

  @Test
  public void testMoreThan0() {
    int[] nums = {1,2};
    LeetCode0229 solution = new LeetCode0229();
    List<Integer> result = solution.majorityElement(nums);
    Assert.assertEquals(2, result.size());
    Assert.assertEquals(1, (int) result.get(0)); 
    Assert.assertEquals(2, (int) result.get(1)); 
  }

  @Test
  public void testEmpty() {
    int[] nums = {};
    LeetCode0229 solution = new LeetCode0229();
    List<Integer> result = solution.majorityElement(nums);
    Assert.assertEquals(0, result.size());
  }

  @Test
  public void testNull() {
    int[] nums = null;
    LeetCode0229 solution = new LeetCode0229();
    List<Integer> result = solution.majorityElement(nums);
    Assert.assertEquals(0, result.size());
  }
}
