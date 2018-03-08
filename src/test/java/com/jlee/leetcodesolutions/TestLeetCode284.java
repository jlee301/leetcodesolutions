package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.PeekingIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode284 {
  @Test
  public void testProblemCase() {
    List<Integer> list = Arrays.asList(1,2,3);
    PeekingIterator solution = new PeekingIterator(list.iterator());
    Assert.assertEquals(1, (int) solution.peek());
    Assert.assertTrue(solution.hasNext());
    Assert.assertEquals(1, (int) solution.next());

    Assert.assertEquals(2, (int) solution.peek());
    Assert.assertTrue(solution.hasNext());
    Assert.assertEquals(2, (int) solution.next());
    
    Assert.assertEquals(3, (int) solution.peek());
    Assert.assertTrue(solution.hasNext());
    Assert.assertEquals(3, (int) solution.next());

    Assert.assertFalse(solution.hasNext());
    Assert.assertNull(solution.peek());
    Assert.assertNull(solution.next());
  }

  @Test
  public void testEmpty() {
    List<Integer> list = new ArrayList<>();
    PeekingIterator solution = new PeekingIterator(list.iterator());
    Assert.assertFalse(solution.hasNext());
    Assert.assertNull(solution.peek());
    Assert.assertNull(solution.next());
  }
}
