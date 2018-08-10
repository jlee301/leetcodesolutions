package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode514;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode514 {
  @Test
  public void testProblemCase1() {
    // Input: ring = "godding", key = "gd"
    // Output: 4
    String ring = "godding", key = "gd";
    LeetCode514 solution = new LeetCode514();
    Assert.assertEquals(4, solution.findRotateSteps(ring, key));
  }

  @Test
  public void testProblemCase2() {
    // Input: ring = "xrrakuulnczywjs", key = "jrlucwzakzussrlckyjjsuwkuarnaluxnyzcnrxxwruyr"
    // Output: 4
    String ring = "xrrakuulnczywjs", key = "jrlucwzakzussrlckyjjsuwkuarnaluxnyzcnrxxwruyr";
    LeetCode514 solution = new LeetCode514();
    Assert.assertEquals(204, solution.findRotateSteps(ring, key));
  }
}
