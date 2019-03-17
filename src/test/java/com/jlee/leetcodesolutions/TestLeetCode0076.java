package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0076;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0076 {
  @Test
  public void testProblemCase1() {
    String s = "ADOBECODEBANC", t = "ABC";
    LeetCode0076 solution = new LeetCode0076();
    Assert.assertEquals("BANC", solution.minWindow(s, t));
  }
  
  @Test
  public void testProblemCase2() {
    String s = "a", t = "a";
    LeetCode0076 solution = new LeetCode0076();
    Assert.assertEquals("a", solution.minWindow(s, t));
  }

  @Test
  public void testProblemCase3() {
    String s = "cgklivwehljxrdzpfdqsapogwvjtvbzahjnsejwnuhmomlfsrvmrnczjzjevkdvroiluthhpqtffhlzyglrvorgnalk", t = "mqfff";
    LeetCode0076 solution = new LeetCode0076();
    Assert.assertEquals("fsrvmrnczjzjevkdvroiluthhpqtff", solution.minWindow(s, t));
  }
}
