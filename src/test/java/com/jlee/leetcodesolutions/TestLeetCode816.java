package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode816;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode816 {
  @Test
  public void testProblemCase1() {
    String S = "(123)";
    LeetCode816 solution = new LeetCode816();
    List<String> result = solution.ambiguousCoordinates(S);
    Assert.assertEquals(4, result.size());
    Assert.assertTrue(result.contains("(1, 23)"));
    Assert.assertTrue(result.contains("(12, 3)"));
    Assert.assertTrue(result.contains("(1.2, 3)"));
    Assert.assertTrue(result.contains("(1, 2.3)"));
  }

  @Test
  public void testProblemCase2() {
    String S = "(00011)";
    LeetCode816 solution = new LeetCode816();
    List<String> result = solution.ambiguousCoordinates(S);
    Assert.assertEquals(2, result.size());
    Assert.assertTrue(result.contains("(0.001, 1)"));
    Assert.assertTrue(result.contains("(0, 0.011)"));
  }

  @Test
  public void testProblemCase3() {
    String S = "(0123)";
    LeetCode816 solution = new LeetCode816();
    List<String> result = solution.ambiguousCoordinates(S);
    Assert.assertEquals(6, result.size());
    Assert.assertTrue(result.contains("(0, 123)"));
    Assert.assertTrue(result.contains("(0, 12.3)"));
    Assert.assertTrue(result.contains("(0, 1.23)"));
    Assert.assertTrue(result.contains("(0.1, 23)"));
    Assert.assertTrue(result.contains("(0.1, 2.3)"));
    Assert.assertTrue(result.contains("(0.12, 3)"));
  }

  @Test
  public void testProblemCase4() {
    String S = "(100)";
    LeetCode816 solution = new LeetCode816();
    List<String> result = solution.ambiguousCoordinates(S);
    Assert.assertEquals(1, result.size());
    Assert.assertTrue(result.contains("(10, 0)"));
  }
}
