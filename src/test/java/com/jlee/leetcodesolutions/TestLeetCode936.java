package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode936;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode936 {
  @Test
  public void testProblemCase1() {
    String stamp = "abc", target = "ababc";
    LeetCode936 solution = new LeetCode936();
    int[] result = solution.movesToStamp(stamp, target);
    Assert.assertTrue(helper(stamp, target, result));
  }
  
  @Test
  public void testProblemCase2() {
    String stamp = "abca", target = "aabcaca";
    LeetCode936 solution = new LeetCode936();
    int[] result = solution.movesToStamp(stamp, target);
    Assert.assertTrue(helper(stamp, target, result));
  }
  
  @Test
  public void testProblemCase3() {
    String stamp = "yz", target = "aabcaca";
    LeetCode936 solution = new LeetCode936();
    int[] result = solution.movesToStamp(stamp, target);
    Assert.assertFalse(helper(stamp, target, result));
  }
  
  private boolean helper(String stamp, String target, int[] pos) {
    if(pos.length == 0)
      return false;
    
    char[] build = new char[target.length()];
    for(int i : pos) {
      for(int j = 0; j < stamp.length(); i++, j++) {
        build[i] = stamp.charAt(j);
      }
    }
    return String.valueOf(build).equals(target);
  }
}
