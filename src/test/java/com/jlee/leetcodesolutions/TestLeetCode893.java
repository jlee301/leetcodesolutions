package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode893;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode893 {
  @Test
  public void testProblemCase1() {
    String[] A = {"a","b","c","a","c","c"};
    LeetCode893 solution = new LeetCode893();
    Assert.assertEquals(3, solution.numSpecialEquivGroups(A));
  }

  @Test
  public void testProblemCase2() {
    String[] A = {"aa","bb","ab","ba"};
    LeetCode893 solution = new LeetCode893();
    Assert.assertEquals(4, solution.numSpecialEquivGroups(A));
  }

  @Test
  public void testProblemCase3() {
    String[] A = {"abc","acb","bac","bca","cab","cba"};
    LeetCode893 solution = new LeetCode893();
    Assert.assertEquals(3, solution.numSpecialEquivGroups(A));
  }

  @Test
  public void testProblemCase4() {
    String[] A = {"abcd","cdab","adcb","cbad"};
    LeetCode893 solution = new LeetCode893();
    Assert.assertEquals(1, solution.numSpecialEquivGroups(A));
  }
}
