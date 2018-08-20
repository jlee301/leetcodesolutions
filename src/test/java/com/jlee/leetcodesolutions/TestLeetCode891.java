package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode891;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode891 {
  @Test
  public void testProblemCase1() {
    int[] A = {2,1,3};
    LeetCode891 solution = new LeetCode891();
    Assert.assertEquals(6, solution.sumSubseqWidths(A));
  }

  @Test
  public void testProblemCase2() {
    int[] A = { 96, 87, 191, 197, 40, 101, 108, 35, 169, 50, 168, 182, 95, 80, 144, 43, 18, 60, 174, 13, 77, 173, 38,
        46, 80, 117, 13, 19, 11, 6, 13, 118, 39, 80, 171, 36, 86, 156, 165, 190, 53, 49, 160, 192, 57, 42, 97, 35, 124,
        200, 84, 70, 145, 180, 54, 141, 159, 42, 66, 66, 25, 95, 24, 136, 140, 159, 71, 131, 5, 140, 115, 76, 151, 137,
        63, 47, 69, 164, 60, 172, 153, 183, 6, 70, 40, 168, 133, 45, 116, 188, 20, 52, 70, 156, 44, 27, 124, 59, 42,
        172 };
    LeetCode891 solution = new LeetCode891();
    Assert.assertEquals(136988321, solution.sumSubseqWidths(A));
  }
}
