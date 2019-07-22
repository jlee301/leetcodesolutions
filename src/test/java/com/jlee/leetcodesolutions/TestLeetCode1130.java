package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode1130;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode1130 {
  @Test
  public void testProblemCase1() {
    int[] arr = {6,2,4};
    LeetCode1130 solution = new LeetCode1130();
    Assert.assertEquals(32, solution.mctFromLeafValues(arr));
  }
}
