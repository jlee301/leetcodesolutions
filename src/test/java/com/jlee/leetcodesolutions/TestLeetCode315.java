package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode315;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode315 {
  @Test
  public void testProblemCase1() {
    int[] nums = {5,2,6,1};
    LeetCode315 solution = new LeetCode315();
    List<Integer> result = solution.countSmaller(nums);
    Integer[] resultData = new Integer[nums.length];
    result.toArray(resultData);
    Assert.assertArrayEquals(new Integer[] {2,1,1,0}, resultData);
  }  
}
