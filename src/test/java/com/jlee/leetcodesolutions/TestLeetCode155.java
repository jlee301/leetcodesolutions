package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode155;
import com.jlee.leetcodesolutions.MinStack;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode155 {
  @Test
  public void testProblemStack() {
    // ["MinStack","push","push","push","getMin","pop","top","getMin"]
    // [[],[-2],[0],[-3],[],[],[],[]]
    MinStack solution = new MinStack();
    solution.push(-2);
    solution.push(0);
    solution.push(-3);
    Assert.assertEquals(-3, solution.getMin());
    solution.pop();
    Assert.assertEquals(0, solution.top());
    Assert.assertEquals(-2, solution.getMin());
  }

  @Test
  public void testTopNoEntry() {
    MinStack solution = new MinStack();
    Assert.assertEquals(0, solution.top());
  }

  @Test
  public void testMinNoEntry() {
    MinStack solution = new MinStack();
    Assert.assertEquals(0, solution.getMin());
  }

  @Test
  public void testAddThenClear() {
    MinStack solution = new MinStack();
    Assert.assertEquals(0, solution.top());
    Assert.assertEquals(0, solution.getMin());
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
    Assert.assertEquals(0, solution.top());
    Assert.assertEquals(0, solution.getMin());
  }
}
