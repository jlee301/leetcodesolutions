package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode831;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode831 {
  @Test
  public void testProblemCase1() {
    String S = "LeetCode@LeetCode.com";
    LeetCode831 solution = new LeetCode831();
    Assert.assertEquals("l*****e@leetcode.com", solution.maskPII(S));
  }

  @Test
  public void testProblemCase2() {
    String S = "AB@qq.com";
    LeetCode831 solution = new LeetCode831();
    Assert.assertEquals("a*****b@qq.com", solution.maskPII(S));
  }
  
  @Test
  public void testProblemCase3() {
    String S = "1(234)567-890";
    LeetCode831 solution = new LeetCode831();
    Assert.assertEquals("***-***-7890", solution.maskPII(S));
  }
  
  @Test
  public void testProblemCase4() {
    String S = "86-(10)12345678";
    LeetCode831 solution = new LeetCode831();
    Assert.assertEquals("+**-***-***-5678", solution.maskPII(S));
  }
}
