package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode1071;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode1071 {
  @Test
  public void testProblemCase1() {
    String str1 = "ABCABC", str2 = "ABC";
    LeetCode1071 solution = new LeetCode1071();
    Assert.assertEquals("ABC", solution.gcdOfStrings(str1, str2));
  }

  @Test
  public void testProblemCase2() {
    String str1 = "ABABAB", str2 = "ABAB";
    LeetCode1071 solution = new LeetCode1071();
    Assert.assertEquals("AB", solution.gcdOfStrings(str1, str2));
  }

  @Test
  public void testProblemCase3() {
    String str1 = "LEET", str2 = "CODE";
    LeetCode1071 solution = new LeetCode1071();
    Assert.assertEquals("", solution.gcdOfStrings(str1, str2));
  }
}
