package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode1018;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode1018 {
  @Test
  public void testProblemCase1() {
    int[] A = {0,1,1};
    LeetCode1018 solution = new LeetCode1018();
    List<Boolean> result = solution.prefixesDivBy5(A);
    Assert.assertEquals(3, result.size());
    Assert.assertTrue(result.get(0));
    Assert.assertFalse(result.get(1));
    Assert.assertFalse(result.get(2));
  }

  @Test
  public void testProblemCase2() {
    int[] A = {1,1,1};
    LeetCode1018 solution = new LeetCode1018();
    List<Boolean> result = solution.prefixesDivBy5(A);
    Assert.assertEquals(3, result.size());
    Assert.assertFalse(result.get(0));
    Assert.assertFalse(result.get(1));
    Assert.assertFalse(result.get(2));
  }

  @Test
  public void testProblemCase3() {
    int[] A = {0,1,1,1,1,1};
    LeetCode1018 solution = new LeetCode1018();
    List<Boolean> result = solution.prefixesDivBy5(A);
    Assert.assertEquals(6, result.size());
    // true,false,false,false,true,false
    Assert.assertTrue(result.get(0));
    Assert.assertFalse(result.get(1));
    Assert.assertFalse(result.get(2));
    Assert.assertFalse(result.get(3));
    Assert.assertTrue(result.get(4));
    Assert.assertFalse(result.get(5));
  }

  @Test
  public void testProblemCase4() {
    int[] A = {1,1,1,0,1};
    LeetCode1018 solution = new LeetCode1018();
    List<Boolean> result = solution.prefixesDivBy5(A);
    Assert.assertEquals(5, result.size());
    // false,false,false,false,false
    Assert.assertFalse(result.get(0));
    Assert.assertFalse(result.get(1));
    Assert.assertFalse(result.get(2));
    Assert.assertFalse(result.get(3));
    Assert.assertFalse(result.get(4));
  }
}
