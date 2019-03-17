package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0744;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0744 {
  @Test
  public void testProblemCase1() {
    char[] letters = {'c', 'f', 'j'};
    char target = 'a';
    LeetCode0744 solution = new LeetCode0744();
    Assert.assertEquals('c', solution.nextGreatestLetter(letters, target));
  }

  @Test
  public void testProblemCase2() {
    char[] letters = {'c', 'f', 'j'};
    char target = 'c';
    LeetCode0744 solution = new LeetCode0744();
    Assert.assertEquals('f', solution.nextGreatestLetter(letters, target));
  }

  @Test
  public void testProblemCase3() {
    char[] letters = {'c', 'f', 'j'};
    char target = 'd';
    LeetCode0744 solution = new LeetCode0744();
    Assert.assertEquals('f', solution.nextGreatestLetter(letters, target));
  }

  @Test
  public void testProblemCase4() {
    char[] letters = {'c', 'f', 'j'};
    char target = 'g';
    LeetCode0744 solution = new LeetCode0744();
    Assert.assertEquals('j', solution.nextGreatestLetter(letters, target));
  }

  @Test
  public void testProblemCase5() {
    char[] letters = {'c', 'f', 'j'};
    char target = 'j';
    LeetCode0744 solution = new LeetCode0744();
    Assert.assertEquals('c', solution.nextGreatestLetter(letters, target));
  }

  @Test
  public void testProblemCase6() {
    char[] letters = {'c', 'f', 'j'};
    char target = 'k';
    LeetCode0744 solution = new LeetCode0744();
    Assert.assertEquals('c', solution.nextGreatestLetter(letters, target));
  }

  @Test
  public void testEmpty() {
    char[] letters = {};
    char target = 'k';
    LeetCode0744 solution = new LeetCode0744();
    Assert.assertEquals('a', solution.nextGreatestLetter(letters, target));
  }

  @Test
  public void testNull() {
    char[] letters = null;
    char target = 'k';
    LeetCode0744 solution = new LeetCode0744();
    Assert.assertEquals('a', solution.nextGreatestLetter(letters, target));
  }
}
