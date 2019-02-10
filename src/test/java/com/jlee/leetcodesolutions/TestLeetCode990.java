package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode990;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode990 {
  @Test
  public void testProblemCase1() {
    String[] equations = {"a==b","b!=a"};
    LeetCode990 solution = new LeetCode990();
    Assert.assertFalse(solution.equationsPossible(equations));
  }

  @Test
  public void testProblemCase2() {
    String[] equations = {"b==a","a==b"};
    LeetCode990 solution = new LeetCode990();
    Assert.assertTrue(solution.equationsPossible(equations));
  }

  @Test
  public void testProblemCase3() {
    String[] equations = {"a==b","b==c","a==c"};
    LeetCode990 solution = new LeetCode990();
    Assert.assertTrue(solution.equationsPossible(equations));
  }

  @Test
  public void testProblemCase4() {
    String[] equations = {"a==b","b!=c","c==a"};
    LeetCode990 solution = new LeetCode990();
    Assert.assertFalse(solution.equationsPossible(equations));
  }

  @Test
  public void testProblemCase5() {
    String[] equations = {"c==c","b==d","x!=z"};
    LeetCode990 solution = new LeetCode990();
    Assert.assertTrue(solution.equationsPossible(equations));
  }

  @Test
  public void testProblemCase6() {
    String[] equations = {"a==b","b!=b"};
    LeetCode990 solution = new LeetCode990();
    Assert.assertFalse(solution.equationsPossible(equations));
  }

  @Test
  public void testProblemCase7() {
    String[] equations = {"a==b","a!=x","x!=a"};
    LeetCode990 solution = new LeetCode990();
    Assert.assertTrue(solution.equationsPossible(equations));
  }

  @Test
  public void testProblemCase8() {
    String[] equations = {"a==b","a==c","a==d","x==f","a!=x","d!=x"};
    LeetCode990 solution = new LeetCode990();
    Assert.assertTrue(solution.equationsPossible(equations));
  }
}
