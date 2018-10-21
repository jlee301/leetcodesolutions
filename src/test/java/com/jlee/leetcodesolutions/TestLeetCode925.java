package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode925;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode925 {
  @Test
  public void testProblemCase1() {
    String name = "alex", typed = "aaleex";
    LeetCode925 solution = new LeetCode925();
    Assert.assertTrue(solution.isLongPressedName(name, typed));
  }

  @Test
  public void testProblemCase2() {
    String name = "saeed", typed = "ssaaedd";
    LeetCode925 solution = new LeetCode925();
    Assert.assertFalse(solution.isLongPressedName(name, typed));
  }

  @Test
  public void testProblemCase3() {
    String name = "leelee", typed = "lleeelee";
    LeetCode925 solution = new LeetCode925();
    Assert.assertTrue(solution.isLongPressedName(name, typed));
  }

  @Test
  public void testProblemCase4() {
    String name = "laiden", typed = "laiden";
    LeetCode925 solution = new LeetCode925();
    Assert.assertTrue(solution.isLongPressedName(name, typed));
  }

  @Test
  public void testProblemCase5() {
    String name = "laiden", typed = "l";
    LeetCode925 solution = new LeetCode925();
    Assert.assertFalse(solution.isLongPressedName(name, typed));
  }

  @Test
  public void testProblemCase6() {
    String name = "l", typed = "laiden";
    LeetCode925 solution = new LeetCode925();
    Assert.assertFalse(solution.isLongPressedName(name, typed));
  }

  @Test
  public void testProblemCase7() {
    String name = "laiden", typed = "aaiden";
    LeetCode925 solution = new LeetCode925();
    Assert.assertFalse(solution.isLongPressedName(name, typed));
  }
}
