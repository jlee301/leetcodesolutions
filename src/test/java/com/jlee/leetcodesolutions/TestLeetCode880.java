package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode880;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode880 {
  @Test
  public void testProblemCase1() {
    LeetCode880 solution = new LeetCode880(new int[] {1});
    for(int i = 0; i < 10; i++) {
      int index = solution.pickIndex();
      if(index != 0)
        Assert.fail("Returned an index other than 0.");
    }
  }

  @Test
  public void testProblemCase2() {
    LeetCode880 solution = new LeetCode880(new int[] {1,3});
    for(int i = 0; i < 10; i++) {
      int index = solution.pickIndex();
      if(index > 1)
        Assert.fail("Returned an index other than 0 or 1.");
    }
  }

  @Test
  public void testProblemCase3() {
    LeetCode880 solution = new LeetCode880(new int[] {2,3,5,4});
    for(int i = 0; i < 10; i++) {
      int index = solution.pickIndex();
      if(index > 4)
        Assert.fail("Returned an index other than 0, 1, 2, or 3.");
    }
  }
}
