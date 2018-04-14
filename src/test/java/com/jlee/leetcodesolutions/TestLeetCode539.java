package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode539;
import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode539 {
  @Test
  public void testProblemCase() {
    List<String> timePoints = Arrays.asList("23:59","00:00");
    LeetCode539 solution = new LeetCode539();
    Assert.assertEquals(1, solution.findMinDifference(timePoints)); 
  }

  @Test
  public void testDuplicateEntries() {
    List<String> timePoints = Arrays.asList("00:00","22:25","22:30","22:30","23:59");
    LeetCode539 solution = new LeetCode539();
    Assert.assertEquals(0, solution.findMinDifference(timePoints)); 
  }

  @Test
  public void testEmpty() {
    List<String> timePoints = Arrays.asList();
    LeetCode539 solution = new LeetCode539();
    Assert.assertEquals(0, solution.findMinDifference(timePoints)); 
  }

  @Test
  public void testNull() {
    List<String> timePoints = null;
    LeetCode539 solution = new LeetCode539();
    Assert.assertEquals(0, solution.findMinDifference(timePoints)); 
  }
}
