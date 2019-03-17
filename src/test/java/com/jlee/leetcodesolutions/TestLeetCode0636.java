package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0636;
import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0636 {
  @Test
  public void testProblemCase() {
    List<String> logs = Arrays.asList("0:start:0", "1:start:2", "1:end:5", "0:end:6");
    int n = 2;
    LeetCode0636 solution = new LeetCode0636();
    Assert.assertArrayEquals(new int[] {3,4}, solution.exclusiveTime(n, logs));
  }
  
  @Test
  public void testWrongAns() {
    List<String> logs = Arrays.asList("0:start:0","0:start:2","0:end:5","0:start:6","0:end:6","0:end:7");
    int n = 1;
    LeetCode0636 solution = new LeetCode0636();
    Assert.assertArrayEquals(new int[] {8}, solution.exclusiveTime(n, logs));    
  }

  @Test
  public void testNoParallel() {
    List<String> logs = Arrays.asList("0:start:0","0:end:2","1:start:3","1:end:10");
    int n = 2;
    LeetCode0636 solution = new LeetCode0636();
    Assert.assertArrayEquals(new int[] {3,8}, solution.exclusiveTime(n, logs));    
  }

  @Test
  public void testEmpty() {
    List<String> logs = Arrays.asList();
    int n = 2;
    LeetCode0636 solution = new LeetCode0636();
    Assert.assertArrayEquals(new int[] {}, solution.exclusiveTime(n, logs));
  }

  @Test
  public void testNull() {
    List<String> logs = null;
    int n = 2;
    LeetCode0636 solution = new LeetCode0636();
    Assert.assertArrayEquals(new int[] {}, solution.exclusiveTime(n, logs));
  }
}
