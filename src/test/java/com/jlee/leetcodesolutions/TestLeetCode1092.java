package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode1092;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode1092 {
  @Test
  public void testProblemCase1() {
    String str1 = "ABCDGH";
    String str2 = "AEDFHR";
    LeetCode1092 solution = new LeetCode1092();
    Assert.assertEquals("ADH", solution.lcs(str1, str2));
  }

  @Test
  public void testProblemCase2() {
    String str1 = "AGGTAB";
    String str2 = "GXTXAYB";
    LeetCode1092 solution = new LeetCode1092();
    Assert.assertEquals("GTAB", solution.lcs(str1, str2));
  }
  
  @Test
  public void testProblemCase3() {
    String str1 = "abac";
    String str2 = "cab";
    LeetCode1092 solution = new LeetCode1092();
    Assert.assertEquals("cabac", solution.shortestCommonSupersequence(str1, str2));
  }

  @Test
  public void testProblemCase4() {
    String str1 = "cab";
    String str2 = "abac";
    LeetCode1092 solution = new LeetCode1092();
    Assert.assertEquals("cabac", solution.shortestCommonSupersequence(str1, str2));
  }
}
