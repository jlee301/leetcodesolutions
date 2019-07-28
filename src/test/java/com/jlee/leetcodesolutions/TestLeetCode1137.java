package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode1137;
import java.util.HashMap;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode1137 {
  @Test
  public void testProblemCase1() {
    HashMap<Integer,Integer> data = new HashMap<>();
    data.put(0, 0);
    data.put(1, 1);
    data.put(2, 1);
    data.put(4, 4);
    data.put(25, 1389537);
    LeetCode1137 solution = new LeetCode1137();
    for(int n : data.keySet()) {
      int expected = data.get(n);
      Assert.assertEquals(expected, solution.tribonacci(n));
    }
  }
}
