package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode771;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode771 {
  @Test
  public void testProblemCase1() {
    String J = "aA";
    String S = "aAAbbbb";
    LeetCode771 solution = new LeetCode771();
    Assert.assertEquals(3, solution.numJewelsInStones(J, S));
  }

  @Test
  public void testProblemCase2() {
    String J = "z";
    String S = "ZZ";
    LeetCode771 solution = new LeetCode771();
    Assert.assertEquals(0, solution.numJewelsInStones(J, S));
  }

  @Test
  public void testEmptyJ() {
    String J = "";
    String S = "ZZ";
    LeetCode771 solution = new LeetCode771();
    Assert.assertEquals(0, solution.numJewelsInStones(J, S));
  }

  @Test
  public void testEmptyS() {
    String J = "z";
    String S = "";
    LeetCode771 solution = new LeetCode771();
    Assert.assertEquals(0, solution.numJewelsInStones(J, S));
  }

  @Test
  public void testEmpty() {
    String J = "";
    String S = "";
    LeetCode771 solution = new LeetCode771();
    Assert.assertEquals(0, solution.numJewelsInStones(J, S));
  }

  @Test
  public void testNullJ() {
    String J = null;
    String S = "ZZ";
    LeetCode771 solution = new LeetCode771();
    Assert.assertEquals(0, solution.numJewelsInStones(J, S));
  }

  @Test
  public void testNullS() {
    String J = "z";
    String S = null;
    LeetCode771 solution = new LeetCode771();
    Assert.assertEquals(0, solution.numJewelsInStones(J, S));
  }

  @Test
  public void testNull() {
    String J = null;
    String S = null;
    LeetCode771 solution = new LeetCode771();
    Assert.assertEquals(0, solution.numJewelsInStones(J, S));
  }
}
