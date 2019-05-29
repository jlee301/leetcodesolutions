package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode1054;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode1054 {
  @Test
  public void testProblemCase1() {
    int[] barcodes = {1,1,1,2,2,2};
    LeetCode1054 solution = new LeetCode1054();
    Assert.assertArrayEquals(new int[] {1,2,1,2,1,2}, solution.rearrangeBarcodes(barcodes));
  }

  @Test
  public void testProblemCase2() {
    int[] barcodes = {1,1,1,1,2,2,3,3};
    LeetCode1054 solution = new LeetCode1054();
    Assert.assertArrayEquals(new int[] {1,2,1,2,1,3,1,3}, solution.rearrangeBarcodes(barcodes));
  }
}
