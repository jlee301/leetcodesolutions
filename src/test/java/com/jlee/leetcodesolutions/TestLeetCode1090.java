package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode1090;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode1090 {
  @Test
  public void testProblemCase1() {
    int[] values = {5,4,3,2,1}, labels = {1,1,2,2,3};
    int num_wanted = 3, use_limit = 1;
    LeetCode1090 solution = new LeetCode1090();
    Assert.assertEquals(9, solution.largestValsFromLabels(values, labels, num_wanted, use_limit));
  }

  @Test
  public void testProblemCase2() {
    int[] values = {5,4,3,2,1}, labels = {1,3,3,3,2};
    int num_wanted = 3, use_limit = 2;
    LeetCode1090 solution = new LeetCode1090();
    Assert.assertEquals(12, solution.largestValsFromLabels(values, labels, num_wanted, use_limit));
  }

  @Test
  public void testProblemCase3() {
    int[] values = {9,8,8,7,6}, labels = {0,0,0,1,1};
    int num_wanted = 3, use_limit = 1;
    LeetCode1090 solution = new LeetCode1090();
    Assert.assertEquals(16, solution.largestValsFromLabels(values, labels, num_wanted, use_limit));
  }

  @Test
  public void testProblemCase4() {
    int[] values = {9,8,8,7,6}, labels = {0,0,0,1,1};
    int num_wanted = 3, use_limit = 2;
    LeetCode1090 solution = new LeetCode1090();
    Assert.assertEquals(24, solution.largestValsFromLabels(values, labels, num_wanted, use_limit));
  }

  @Test
  public void testProblemCase5() {
    int[] values = {16,26,48,40,74,0,92,60,87,28,98,24,89,99,12,49,37,1,29,29,30,10,59,90,28,63,41};
    int[] labels = {0,5,5,0,4,5,1,1,0,4,5,2,2,4,4,2,3,5,4,5,3,3,1,0,0,1,5,0};
    int num_wanted = 14, use_limit = 5;
    LeetCode1090 solution = new LeetCode1090();
    Assert.assertEquals(989, solution.largestValsFromLabels(values, labels, num_wanted, use_limit));
  }
}
