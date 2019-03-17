package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0771;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0771 {
  @Test
  public void testProblemCase1() {
    String J = "aA";
    String S = "aAAbbbb";
    LeetCode0771 solution = new LeetCode0771();
    Assert.assertEquals(3, solution.numJewelsInStones(J, S));
  }

  @Test
  public void testProblemCase2() {
    String J = "z";
    String S = "ZZ";
    LeetCode0771 solution = new LeetCode0771();
    Assert.assertEquals(0, solution.numJewelsInStones(J, S));
  }

  @Test
  public void testEmptyJ() {
    String J = "";
    String S = "ZZ";
    LeetCode0771 solution = new LeetCode0771();
    Assert.assertEquals(0, solution.numJewelsInStones(J, S));
  }

  @Test
  public void testEmptyS() {
    String J = "z";
    String S = "";
    LeetCode0771 solution = new LeetCode0771();
    Assert.assertEquals(0, solution.numJewelsInStones(J, S));
  }

  @Test
  public void testEmpty() {
    String J = "";
    String S = "";
    LeetCode0771 solution = new LeetCode0771();
    Assert.assertEquals(0, solution.numJewelsInStones(J, S));
  }

  @Test
  public void testNullJ() {
    String J = null;
    String S = "ZZ";
    LeetCode0771 solution = new LeetCode0771();
    Assert.assertEquals(0, solution.numJewelsInStones(J, S));
  }

  @Test
  public void testNullS() {
    String J = "z";
    String S = null;
    LeetCode0771 solution = new LeetCode0771();
    Assert.assertEquals(0, solution.numJewelsInStones(J, S));
  }

  @Test
  public void testNull() {
    String J = null;
    String S = null;
    LeetCode0771 solution = new LeetCode0771();
    Assert.assertEquals(0, solution.numJewelsInStones(J, S));
  }
}
