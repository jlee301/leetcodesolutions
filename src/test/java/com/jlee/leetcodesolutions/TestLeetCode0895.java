package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0895;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0895 {
  @Test
  public void testProblemCase1() {
    LeetCode0895 solution = new LeetCode0895();
    solution.push(5);
    solution.push(7);
    solution.push(5);
    solution.push(7);
    solution.push(4);
    solution.push(5);
    Assert.assertEquals(5, solution.pop());
    Assert.assertEquals(7, solution.pop());
    Assert.assertEquals(5, solution.pop());
    Assert.assertEquals(4, solution.pop());
    Assert.assertEquals(7, solution.pop());
    Assert.assertEquals(5, solution.pop());
    solution.push(5);
    solution.push(5);
    Assert.assertEquals(5, solution.pop());
    Assert.assertEquals(5, solution.pop());
  }
}
