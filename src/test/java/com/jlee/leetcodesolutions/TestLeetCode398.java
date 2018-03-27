package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode398;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode398 {
  @Test
  public void testProblemCase() {
    int[] nums = {1,2,3,3,3};
    LeetCode398 solution = new LeetCode398(nums);
    Assert.assertEquals(0, solution.pick(1));
    Assert.assertEquals(1, solution.pick(2));
    for(int i = 0; i < 10; i++) {
      int result = solution.pick(3);
      if(result == 2) {}
      else if (result == 3) {}
      else if(result == 4) {}
      else
        Assert.fail("pick(3) did not return an index of 2,3,4: " + result);
    }
  }
}
