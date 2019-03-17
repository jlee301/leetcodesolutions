package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0956;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0956 {
  @Test
  public void testProblemCase1() {
    int[] rods = {1,2,3,6};
    LeetCode0956 solution = new LeetCode0956();
    Assert.assertEquals(6, solution.tallestBillboard(rods));
  }

  @Test
  public void testProblemCase2() {
    int[] rods = {1,2,3,4,5,6};
    LeetCode0956 solution = new LeetCode0956();
    Assert.assertEquals(10, solution.tallestBillboard(rods));
  }

  @Test
  public void testProblemCase3() {
    int[] rods = {1,2};
    LeetCode0956 solution = new LeetCode0956();
    Assert.assertEquals(0, solution.tallestBillboard(rods));
  }

  @Test
  public void testProblemCase4() {
    int[] rods = {1,2,4,8,16,32,64,128,256,512,50,50,50,150,150,150,100,100,100,123};
    LeetCode0956 solution = new LeetCode0956();
    Assert.assertEquals(1023, solution.tallestBillboard(rods));
  }

  @Test
  public void testProblemCase5() {
    int[] rods = {33,30,41,34,37,29,26,31,42,33,38,27,33,31,35,900,900,900,900,900};
    LeetCode0956 solution = new LeetCode0956();
    Assert.assertEquals(2050, solution.tallestBillboard(rods));
  }
}
