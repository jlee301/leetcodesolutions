package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode546;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode546 {
  @Test
  public void testProblemCase1() {
    int[] boxes = {1, 3, 2, 2, 2, 3, 4, 3, 1};
    LeetCode546 solution = new LeetCode546();
    Assert.assertEquals(23, solution.removeBoxes(boxes));
  }
}
