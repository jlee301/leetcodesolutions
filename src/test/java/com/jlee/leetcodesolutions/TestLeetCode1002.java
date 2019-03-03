package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode1002;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode1002 {
  @Test
  public void testProblemCase1() {
    String[] A = {"bella","label","roller"};
    LeetCode1002 solution = new LeetCode1002();
    List<String> result = solution.commonChars(A);
    Assert.assertEquals(3, result.size());
    Assert.assertEquals("e", result.get(0));
    Assert.assertEquals("l", result.get(1));
    Assert.assertEquals("l", result.get(2));
  }

  @Test
  public void testProblemCase2() {
    String[] A = {"cool","lock","cook"};
    LeetCode1002 solution = new LeetCode1002();
    List<String> result = solution.commonChars(A);
    Assert.assertEquals(2, result.size());
    Assert.assertEquals("c", result.get(0));
    Assert.assertEquals("o", result.get(1));
  }
}
