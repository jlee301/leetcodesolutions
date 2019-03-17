package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0916;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0916 {
  @Test
  public void testProblemCase1() {
    String[] A = {"amazon","apple","facebook","google","leetcode"};
    String[] B = {"e","o"};
    LeetCode0916 solution = new LeetCode0916();
    List<String> result = solution.wordSubsets(A, B);
    Assert.assertEquals(3, result.size());
    Assert.assertTrue(result.contains("facebook"));
    Assert.assertTrue(result.contains("google"));
    Assert.assertTrue(result.contains("leetcode"));
  }

  @Test
  public void testProblemCase2() {
    String[] A = {"amazon","apple","facebook","google","leetcode"};
    String[] B = {"l","e"};
    LeetCode0916 solution = new LeetCode0916();
    List<String> result = solution.wordSubsets(A, B);
    Assert.assertEquals(3, result.size());
    Assert.assertTrue(result.contains("apple"));
    Assert.assertTrue(result.contains("google"));
    Assert.assertTrue(result.contains("leetcode"));
  }

  @Test
  public void testProblemCase3() {
    String[] A = {"amazon","apple","facebook","google","leetcode"};
    String[] B = {"e","oo"};
    LeetCode0916 solution = new LeetCode0916();
    List<String> result = solution.wordSubsets(A, B);
    Assert.assertEquals(2, result.size());
    Assert.assertTrue(result.contains("facebook"));
    Assert.assertTrue(result.contains("google"));
  }

  @Test
  public void testProblemCase4() {
    String[] A = {"amazon","apple","facebook","google","leetcode"};
    String[] B = {"lo","eo"};
    LeetCode0916 solution = new LeetCode0916();
    List<String> result = solution.wordSubsets(A, B);
    Assert.assertEquals(2, result.size());
    Assert.assertTrue(result.contains("google"));
    Assert.assertTrue(result.contains("leetcode"));
  }

  @Test
  public void testProblemCase5() {
    String[] A = {"amazon","apple","facebook","google","leetcode"};
    String[] B = {"ec","oc","ceo"};
    LeetCode0916 solution = new LeetCode0916();
    List<String> result = solution.wordSubsets(A, B);
    Assert.assertEquals(2, result.size());
    Assert.assertTrue(result.contains("facebook"));
    Assert.assertTrue(result.contains("leetcode"));
  }
}
