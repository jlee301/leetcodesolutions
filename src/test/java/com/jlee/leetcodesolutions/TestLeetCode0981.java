package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0981;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0981 {
  @Test
  public void testProblemCase1() {
    LeetCode0981 solution = new LeetCode0981();
    solution.set("foo", "bar", 1);
    Assert.assertEquals("bar", solution.get("foo", 1));
    Assert.assertEquals("bar", solution.get("foo", 3));
    solution.set("foo", "bar2", 4);
    Assert.assertEquals("bar2", solution.get("foo", 4));
    Assert.assertEquals("bar2", solution.get("foo", 5));
  }

  @Test
  public void testProblemCase2() {
    LeetCode0981 solution = new LeetCode0981();
    solution.set("love", "high", 10);
    solution.set("love", "low", 20);
    Assert.assertEquals("", solution.get("love", 5));
    Assert.assertEquals("high", solution.get("love", 10));
    Assert.assertEquals("high", solution.get("love", 15));
    Assert.assertEquals("low", solution.get("love", 20));
    Assert.assertEquals("low", solution.get("love", 25));
    Assert.assertEquals("", solution.get("leet", 5));
  }
}
