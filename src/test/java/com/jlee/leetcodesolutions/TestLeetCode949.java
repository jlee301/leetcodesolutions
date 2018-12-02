package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode949;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode949 {
  @Test
  public void testProblemCase1() {
    int[] A = {1,2,3,4};
    LeetCode949 solution = new LeetCode949();
    Assert.assertEquals("23:41", solution.largestTimeFromDigits(A));
  }

  @Test
  public void testProblemCase2() {
    int[] A = {5,5,5,5};
    LeetCode949 solution = new LeetCode949();
    Assert.assertEquals("", solution.largestTimeFromDigits(A));
  }

  @Test
  public void testProblemCase3() {
    int[] A = {9,5,3,2};
    LeetCode949 solution = new LeetCode949();
    Assert.assertEquals("23:59", solution.largestTimeFromDigits(A));
  }

  @Test
  public void testProblemCase4() {
    int[] A = {0,4,0,0};
    LeetCode949 solution = new LeetCode949();
    Assert.assertEquals("04:00", solution.largestTimeFromDigits(A));
  }
}
