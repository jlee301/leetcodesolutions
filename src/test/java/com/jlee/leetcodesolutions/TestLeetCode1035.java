package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode1035;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode1035 {
  @Test
  public void testProblemCase1() {
    int[] A = {1,4,2}, B = {1,2,4};
    LeetCode1035 solution = new LeetCode1035();
    Assert.assertEquals(2, solution.maxUncrossedLines(A, B));
  }

  @Test
  public void testProblemCase2() {
    int[] A = {2,5,1,2,5}, B = {10,5,2,1,5,2};
    LeetCode1035 solution = new LeetCode1035();
    Assert.assertEquals(3, solution.maxUncrossedLines(A, B));
  }

  @Test
  public void testProblemCase3() {
    int[] A = {1,3,7,1,7,5}, B = {1,9,2,5,1};
    LeetCode1035 solution = new LeetCode1035();
    Assert.assertEquals(2, solution.maxUncrossedLines(A, B));
  }

  @Test
  public void testProblemCase4() {
    int[] A = {1,2,4,1,4,4,3,5,5,1,4,4,4,1,4,3,4,2,4,2}, B = {2,4,1,1,3,5,2,1,5,1,2,3,3,2,1,4,1,2,5,5};
    LeetCode1035 solution = new LeetCode1035();
    Assert.assertEquals(11, solution.maxUncrossedLines(A, B));
  }
}
