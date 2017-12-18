package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode225;
import com.jlee.leetcodesolutions.MyStack;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode225 {
  @Test
  public void testProblemCase() {
    MyStack stack = new MyStack();
    Assert.assertTrue(stack.empty());

    stack.push(1);
    Assert.assertEquals(1, stack.top());
    Assert.assertFalse(stack.empty());

    stack.push(2);
    Assert.assertEquals(2, stack.top());
    Assert.assertFalse(stack.empty());

    stack.push(3);
    Assert.assertEquals(3, stack.top());
    Assert.assertFalse(stack.empty());

    Assert.assertEquals(3, stack.pop());
    Assert.assertEquals(2, stack.top());
    Assert.assertFalse(stack.empty());
    
    Assert.assertEquals(2, stack.pop());
    Assert.assertEquals(1, stack.top());
    Assert.assertFalse(stack.empty());

    Assert.assertEquals(1, stack.pop());
    Assert.assertTrue(stack.empty());
  }
}
