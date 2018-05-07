package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode756;
import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode756 {
  @Test
  public void testProblemCase1() {
    String bottom = "XYZ";
    List<String> allowed = Arrays.asList("XYD", "YZE", "DEA", "FFF");
    LeetCode756 solution = new LeetCode756();
    Assert.assertTrue(solution.pyramidTransition(bottom, allowed));
  }

  @Test
  public void testProblemCase2() {
    String bottom = "XXYX";
    List<String> allowed = Arrays.asList("XXX", "XXY", "XYX", "XYY", "YXZ");
    LeetCode756 solution = new LeetCode756();
    Assert.assertFalse(solution.pyramidTransition(bottom, allowed));
  }
}
