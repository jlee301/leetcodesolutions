package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode232;
import com.jlee.leetcodesolutions.MyQueue;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode232 {
  @Test
  public void testClassDeclare() {
    LeetCode232 solution = new LeetCode232();
  }
  
  @Test
  public void testProblemCase() {
    MyQueue queue = new MyQueue();
    Assert.assertTrue(queue.empty());

    queue.push(1);
    Assert.assertFalse(queue.empty());
    Assert.assertEquals(1, queue.peek());

    queue.push(2);
    Assert.assertFalse(queue.empty());
    Assert.assertEquals(1, queue.peek());

    queue.push(3);
    Assert.assertFalse(queue.empty());
    Assert.assertEquals(1, queue.peek());
    
    Assert.assertEquals(1, queue.pop());
    Assert.assertFalse(queue.empty());
    Assert.assertEquals(2, queue.peek());

    Assert.assertEquals(2, queue.pop());
    Assert.assertFalse(queue.empty());
    Assert.assertEquals(3, queue.peek());

    Assert.assertEquals(3, queue.pop());
    Assert.assertTrue(queue.empty());
  }
}
