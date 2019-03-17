package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0990;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0990 {
  @Test
  public void testProblemCase1() {
    String[] equations = {"a==b","b!=a"};
    LeetCode0990 solution = new LeetCode0990();
    Assert.assertFalse(solution.equationsPossible(equations));
  }

  @Test
  public void testProblemCase2() {
    String[] equations = {"b==a","a==b"};
    LeetCode0990 solution = new LeetCode0990();
    Assert.assertTrue(solution.equationsPossible(equations));
  }

  @Test
  public void testProblemCase3() {
    String[] equations = {"a==b","b==c","a==c"};
    LeetCode0990 solution = new LeetCode0990();
    Assert.assertTrue(solution.equationsPossible(equations));
  }

  @Test
  public void testProblemCase4() {
    String[] equations = {"a==b","b!=c","c==a"};
    LeetCode0990 solution = new LeetCode0990();
    Assert.assertFalse(solution.equationsPossible(equations));
  }

  @Test
  public void testProblemCase5() {
    String[] equations = {"c==c","b==d","x!=z"};
    LeetCode0990 solution = new LeetCode0990();
    Assert.assertTrue(solution.equationsPossible(equations));
  }

  @Test
  public void testProblemCase6() {
    String[] equations = {"a==b","b!=b"};
    LeetCode0990 solution = new LeetCode0990();
    Assert.assertFalse(solution.equationsPossible(equations));
  }

  @Test
  public void testProblemCase7() {
    String[] equations = {"a==b","a!=x","x!=a"};
    LeetCode0990 solution = new LeetCode0990();
    Assert.assertTrue(solution.equationsPossible(equations));
  }

  @Test
  public void testProblemCase8() {
    String[] equations = {"a==b","a==c","a==d","x==f","a!=x","d!=x"};
    LeetCode0990 solution = new LeetCode0990();
    Assert.assertTrue(solution.equationsPossible(equations));
  }
}
