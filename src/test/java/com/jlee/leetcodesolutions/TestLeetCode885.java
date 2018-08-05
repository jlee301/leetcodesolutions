package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode885;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode885 {
  @Test
  public void testProblemCase1() {
    int[] people = {1,2};
    int limit = 3;
    LeetCode885 solution = new LeetCode885();
    Assert.assertEquals(1, solution.numRescueBoats(people, limit));
  }

  @Test
  public void testProblemCase2() {
    int[] people = {3,2,2,1};
    int limit = 3;
    LeetCode885 solution = new LeetCode885();
    Assert.assertEquals(3, solution.numRescueBoats(people, limit));
  }

  @Test
  public void testProblemCase3() {
    int[] people = {3,5,3,4};
    int limit = 5;
    LeetCode885 solution = new LeetCode885();
    Assert.assertEquals(4, solution.numRescueBoats(people, limit));
  }

  @Test
  public void testProblemCase4() {
    int[] people = {1,1,2};
    int limit = 4;
    LeetCode885 solution = new LeetCode885();
    Assert.assertEquals(2, solution.numRescueBoats(people, limit));
  }
}
