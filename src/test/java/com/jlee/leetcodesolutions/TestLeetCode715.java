package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode715;
import com.jlee.leetcodesolutions.LeetCode715.RangeModule;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode715 {
  @Test
  public void testProblemCase1() {
    LeetCode715 solution = new LeetCode715();
    RangeModule rm = solution.new RangeModule();
    rm.addRange(10, 20);
    rm.removeRange(14, 16);
    Assert.assertTrue(rm.queryRange(10, 14));
    Assert.assertFalse(rm.queryRange(13, 15));
    Assert.assertTrue(rm.queryRange(16, 17));
  }

  @Test
  public void testProblemCase2() {
    LeetCode715 solution = new LeetCode715();
    RangeModule rm = solution.new RangeModule();
    rm.addRange(10, 20);
    rm.addRange(9, 11);
    rm.addRange(12, 15);
    rm.addRange(19, 25);
    rm.addRange(30, 35);
    Assert.assertFalse(rm.queryRange(8, 15));
    rm.removeRange(9, 26);
    rm.removeRange(28, 29);
    rm.removeRange(29, 30);
    rm.removeRange(30, 31);
    rm.removeRange(31, 32);
    rm.removeRange(33, 34);
    rm.removeRange(34, 35);
    rm.removeRange(35, 36);
    rm.removeRange(36, 37);
  }
}
