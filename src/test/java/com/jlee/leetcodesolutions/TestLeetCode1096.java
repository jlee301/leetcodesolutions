package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode1096;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode1096 {
  @Test
  public void testProblemCase1() {
    String expression = "{a,b}{c{d,e}}";
    LeetCode1096 solution = new LeetCode1096();
    List<String> result = solution.braceExpansionII(expression);
    // "acd","ace","bcd","bce"
    Assert.assertEquals(4, result.size());
    Assert.assertEquals("acd", result.get(0));
    Assert.assertEquals("ace", result.get(1));
    Assert.assertEquals("bcd", result.get(2));
    Assert.assertEquals("bce", result.get(3));
  }

  @Test
  public void testProblemCase2() {
    String expression = "{{a,z},a{b,c},{ab,z}}";
    LeetCode1096 solution = new LeetCode1096();
    List<String> result = solution.braceExpansionII(expression);
    // "a","ab","ac","z"
    Assert.assertEquals(4, result.size());
    Assert.assertEquals("a", result.get(0));
    Assert.assertEquals("ab", result.get(1));
    Assert.assertEquals("ac", result.get(2));
    Assert.assertEquals("z", result.get(3));
  }

  @Test
  public void testProblemCase3() {
    String expression = "{a,b},{c,d}";
    LeetCode1096 solution = new LeetCode1096();
    List<String> result = solution.braceExpansionII(expression);
    // "a","b","c","d"
    Assert.assertEquals(4, result.size());
    Assert.assertEquals("a", result.get(0));
    Assert.assertEquals("b", result.get(1));
    Assert.assertEquals("c", result.get(2));
    Assert.assertEquals("d", result.get(3));
  }
}
