package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode944;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode944 {
  @Test
  public void testProblemCase1() {
    String[] A = {"cba","daf","ghi"};
    LeetCode944 solution = new LeetCode944();
    Assert.assertEquals(1, solution.minDeletionSize(A));
  }

  @Test
  public void testProblemCase2() {
    String[] A = {"a","b"};
    LeetCode944 solution = new LeetCode944();
    Assert.assertEquals(0, solution.minDeletionSize(A));
  }

  @Test
  public void testProblemCase3() {
    String[] A = {"zyx","wvu","tsr"};
    LeetCode944 solution = new LeetCode944();
    Assert.assertEquals(3, solution.minDeletionSize(A));
  }
}
