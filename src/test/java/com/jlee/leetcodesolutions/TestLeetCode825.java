package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode825;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode825 {
  @Test
  public void testProblemCase1() {
    int[] ages = {16,16};
    LeetCode825 solution = new LeetCode825();
    Assert.assertEquals(2, solution.numFriendRequests(ages));
  }

  @Test
  public void testProblemCase2() {
    int[] ages = {16,17,18};
    LeetCode825 solution = new LeetCode825();
    Assert.assertEquals(2, solution.numFriendRequests(ages));
  }

  @Test
  public void testProblemCase3() {
    int[] ages = {20,30,100,110,120};
    LeetCode825 solution = new LeetCode825();
    Assert.assertEquals(3, solution.numFriendRequests(ages));
  }

  @Test
  public void testEmpty() {
    int[] ages = {};
    LeetCode825 solution = new LeetCode825();
    Assert.assertEquals(0, solution.numFriendRequests(ages));
  }

  @Test
  public void testNull() {
    int[] ages = null;
    LeetCode825 solution = new LeetCode825();
    Assert.assertEquals(0, solution.numFriendRequests(ages));
  }
}
