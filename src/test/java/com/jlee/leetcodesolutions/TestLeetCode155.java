package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode155;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode155 {
  @Test
  public void testProblemCase1() {
    // ["LeetCode155","push","push","push","getMin","pop","top","getMin"]
    // [[],[-2],[0],[-3],[],[],[],[]]
    LeetCode155 solution = new LeetCode155();
    solution.push(-2);
    solution.push(0);
    solution.push(-3);
    Assert.assertEquals(-3, solution.getMin());
    solution.pop();
    Assert.assertEquals(0, solution.top());
    Assert.assertEquals(-2, solution.getMin());
  }

  @Test
  public void testProblemCase2() {
    LeetCode155 solution = new LeetCode155();
    Assert.assertEquals(Integer.MAX_VALUE, solution.getMin());
    solution.push(1);
    Assert.assertEquals(1, solution.top());
    Assert.assertEquals(1, solution.getMin());
    solution.push(2);
    Assert.assertEquals(2, solution.top());
    Assert.assertEquals(1, solution.getMin());
    solution.push(1);
    Assert.assertEquals(1, solution.top());
    Assert.assertEquals(1, solution.getMin());
    solution.pop();
    Assert.assertEquals(2, solution.top());
    Assert.assertEquals(1, solution.getMin());
    solution.pop();
    Assert.assertEquals(1, solution.top());
    Assert.assertEquals(1, solution.getMin());
    solution.pop();
    Assert.assertEquals(Integer.MAX_VALUE, solution.getMin());
    solution.pop();
    Assert.assertEquals(Integer.MAX_VALUE, solution.getMin());
  }
}
