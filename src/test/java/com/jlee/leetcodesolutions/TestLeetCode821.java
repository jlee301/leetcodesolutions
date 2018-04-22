package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode821;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode821 {
  @Test
  public void testProblemCase() {
    String S = "loveleetcode"; 
    char C = 'e';
    LeetCode821 solution = new LeetCode821();
    Assert.assertArrayEquals(new int[] {3,2,1,0,1,0,0,1,2,2,1,0}, solution.shortestToChar(S, C));
  }
  
  @Test
  public void testRunTimeError() {
    String S = "abba"; 
    char C = 'b';
    LeetCode821 solution = new LeetCode821();
    Assert.assertArrayEquals(new int[] {1,0,0,1}, solution.shortestToChar(S, C));    
  }
}
