package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode916;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode916 {
  @Test
  public void testProblemCase1() {
    String[] A = {"amazon","apple","facebook","google","leetcode"};
    String[] B = {"e","o"};
    LeetCode916 solution = new LeetCode916();
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
    LeetCode916 solution = new LeetCode916();
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
    LeetCode916 solution = new LeetCode916();
    List<String> result = solution.wordSubsets(A, B);
    Assert.assertEquals(2, result.size());
    Assert.assertTrue(result.contains("facebook"));
    Assert.assertTrue(result.contains("google"));
  }

  @Test
  public void testProblemCase4() {
    String[] A = {"amazon","apple","facebook","google","leetcode"};
    String[] B = {"lo","eo"};
    LeetCode916 solution = new LeetCode916();
    List<String> result = solution.wordSubsets(A, B);
    Assert.assertEquals(2, result.size());
    Assert.assertTrue(result.contains("google"));
    Assert.assertTrue(result.contains("leetcode"));
  }

  @Test
  public void testProblemCase5() {
    String[] A = {"amazon","apple","facebook","google","leetcode"};
    String[] B = {"ec","oc","ceo"};
    LeetCode916 solution = new LeetCode916();
    List<String> result = solution.wordSubsets(A, B);
    Assert.assertEquals(2, result.size());
    Assert.assertTrue(result.contains("facebook"));
    Assert.assertTrue(result.contains("leetcode"));
  }
}
