package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode895;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode895 {
  @Test
  public void testProblemCase1() {
    LeetCode895 solution = new LeetCode895();
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
