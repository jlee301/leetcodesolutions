package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0546;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0546 {
  @Test
  public void testProblemCase1() {
    int[] boxes = {1, 3, 2, 2, 2, 3, 4, 3, 1};
    LeetCode0546 solution = new LeetCode0546();
    Assert.assertEquals(23, solution.removeBoxes(boxes));
  }
}
