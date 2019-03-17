package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0821;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0821 {
  @Test
  public void testProblemCase() {
    String S = "loveleetcode"; 
    char C = 'e';
    LeetCode0821 solution = new LeetCode0821();
    Assert.assertArrayEquals(new int[] {3,2,1,0,1,0,0,1,2,2,1,0}, solution.shortestToChar(S, C));
  }
  
  @Test
  public void testRunTimeError() {
    String S = "abba"; 
    char C = 'b';
    LeetCode0821 solution = new LeetCode0821();
    Assert.assertArrayEquals(new int[] {1,0,0,1}, solution.shortestToChar(S, C));    
  }
}
