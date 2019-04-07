package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode1023;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode1023 {
  @Test
  public void testProblemCase1() {
    String[] queries = {"FooBar","FooBarTest","FootBall","FrameBuffer","ForceFeedBack"};
    String pattern = "FB";
    LeetCode1023 solution = new LeetCode1023();
    List<Boolean> result = solution.camelMatch(queries, pattern);
    // true,false,true,true,false
    Assert.assertTrue(result.get(0));
    Assert.assertFalse(result.get(1));
    Assert.assertTrue(result.get(2));
    Assert.assertTrue(result.get(3));
    Assert.assertFalse(result.get(4));
  }

  @Test
  public void testProblemCase2() {
    String[] queries = {"FooBar","FooBarTest","FootBall","FrameBuffer","ForceFeedBack"};
    String pattern = "FoBa";
    LeetCode1023 solution = new LeetCode1023();
    List<Boolean> result = solution.camelMatch(queries, pattern);
    // true,false,true,false,false
    Assert.assertTrue(result.get(0));
    Assert.assertFalse(result.get(1));
    Assert.assertTrue(result.get(2));
    Assert.assertFalse(result.get(3));
    Assert.assertFalse(result.get(4));
  }

  @Test
  public void testProblemCase3() {
    String[] queries = {"FooBar","FooBarTest","FootBall","FrameBuffer","ForceFeedBack"};
    String pattern = "FoBaT";
    LeetCode1023 solution = new LeetCode1023();
    List<Boolean> result = solution.camelMatch(queries, pattern);
    // false,true,false,false,false
    Assert.assertFalse(result.get(0));
    Assert.assertTrue(result.get(1));
    Assert.assertFalse(result.get(2));
    Assert.assertFalse(result.get(3));
    Assert.assertFalse(result.get(4));
  }
  
  @Test
  public void testProblemCase4() {
    String[] queries = {"IXfGawluvnCa","IsXfGaxwulCa","IXfGawlqtCva","IXjfGawlmeCa","IXfGnaynwlCa","IXfGcamwelCa"};
    String pattern = "IXfGawlCa";
    LeetCode1023 solution = new LeetCode1023();
    List<Boolean> result = solution.camelMatch(queries, pattern);
    Assert.assertTrue(result.get(0));
    Assert.assertTrue(result.get(1));
    Assert.assertTrue(result.get(2));
    Assert.assertTrue(result.get(3));
    Assert.assertTrue(result.get(4));
    Assert.assertTrue(result.get(5));
  }
}
