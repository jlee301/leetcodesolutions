package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0893;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0893 {
  @Test
  public void testProblemCase1() {
    String[] A = {"a","b","c","a","c","c"};
    LeetCode0893 solution = new LeetCode0893();
    Assert.assertEquals(3, solution.numSpecialEquivGroups(A));
  }

  @Test
  public void testProblemCase2() {
    String[] A = {"aa","bb","ab","ba"};
    LeetCode0893 solution = new LeetCode0893();
    Assert.assertEquals(4, solution.numSpecialEquivGroups(A));
  }

  @Test
  public void testProblemCase3() {
    String[] A = {"abc","acb","bac","bca","cab","cba"};
    LeetCode0893 solution = new LeetCode0893();
    Assert.assertEquals(3, solution.numSpecialEquivGroups(A));
  }

  @Test
  public void testProblemCase4() {
    String[] A = {"abcd","cdab","adcb","cbad"};
    LeetCode0893 solution = new LeetCode0893();
    Assert.assertEquals(1, solution.numSpecialEquivGroups(A));
  }
}
