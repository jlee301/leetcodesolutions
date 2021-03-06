package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0443;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0443 {
  @Test
  public void testProblemCase1() {
    LeetCode0443 solution = new LeetCode0443();
    char[] chars = {'a','a','b','b','c','c','c'};
    Assert.assertEquals(6, solution.compress(chars));
    Assert.assertEquals('a', chars[0]);
    Assert.assertEquals('2', chars[1]);
    Assert.assertEquals('b', chars[2]);
    Assert.assertEquals('2', chars[3]);
    Assert.assertEquals('c', chars[4]);
    Assert.assertEquals('3', chars[5]);
  }

  @Test
  public void testProblemCase2() {
    LeetCode0443 solution = new LeetCode0443();
    char[] chars = {'a'};
    Assert.assertEquals(1, solution.compress(chars));
    Assert.assertEquals('a', chars[0]);
  }

  @Test
  public void testProblemCase3() {
    LeetCode0443 solution = new LeetCode0443();
    char[] chars = {'a','b','b','b','b','b','b','b','b','b','b','b','b'};
    Assert.assertEquals(4, solution.compress(chars));
    Assert.assertEquals('a', chars[0]);
    Assert.assertEquals('b', chars[1]);
    Assert.assertEquals('1', chars[2]);
    Assert.assertEquals('2', chars[3]);
  }

  @Test
  public void testProblemCase4() {
    LeetCode0443 solution = new LeetCode0443();
    char[] chars = {'a','b','c','d'};
    Assert.assertEquals(4, solution.compress(chars));
    Assert.assertEquals('a', chars[0]);
    Assert.assertEquals('b', chars[1]);
    Assert.assertEquals('c', chars[2]);
    Assert.assertEquals('d', chars[3]);
  }

  @Test
  public void testProblemCase5() {
    LeetCode0443 solution = new LeetCode0443();
    char[] chars = {'!','!','@','#','#','#'};
    Assert.assertEquals(5, solution.compress(chars));
    Assert.assertEquals('!', chars[0]);
    Assert.assertEquals('2', chars[1]);
    Assert.assertEquals('@', chars[2]);
    Assert.assertEquals('#', chars[3]);
    Assert.assertEquals('3', chars[4]);
  }

  @Test
  public void testProblemCase6() {
    LeetCode0443 solution = new LeetCode0443();
    char[] chars = {'1','1','2','3','3','3'};
    Assert.assertEquals(5, solution.compress(chars));
    Assert.assertEquals('1', chars[0]);
    Assert.assertEquals('2', chars[1]);
    Assert.assertEquals('2', chars[2]);
    Assert.assertEquals('3', chars[3]);
    Assert.assertEquals('3', chars[4]);
  }

  @Test
  public void testProblemCase7() {
    LeetCode0443 solution = new LeetCode0443();
    char[] chars = {' ',' ',' '};
    Assert.assertEquals(2, solution.compress(chars));
    Assert.assertEquals(' ', chars[0]);
    Assert.assertEquals('3', chars[1]);
  }

  @Test
  public void testProblemCase8() {
    LeetCode0443 solution = new LeetCode0443();
    char[] chars = {};
    Assert.assertEquals(0, solution.compress(chars));
    Assert.assertEquals(0, chars.length);
  }
}
