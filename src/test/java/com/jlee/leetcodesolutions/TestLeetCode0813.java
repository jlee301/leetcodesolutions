package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0813;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0813 {
  @Test
  public void testProblemCase() {
    int[] A = {9,1,2,3,9};
    int K = 3;
    LeetCode0813 solution = new LeetCode0813();
    Assert.assertEquals(20.0, solution.largestSumOfAverages(A, K), 0.0);
  }

  @Test
  public void testWrongAns() {
    int[] A = {1,2,3,4,5,6,7};
    int K = 4;
    LeetCode0813 solution = new LeetCode0813();
    Assert.assertEquals(20.5, solution.largestSumOfAverages(A, K), 0.0);
  }
  
  @Test
  public void testTLE() {
    int[] A = { 4663, 3020, 7789, 1627, 9668, 1356, 4207, 1133, 8765, 4649, 205, 6455, 8864, 3554, 3916, 5925, 3995,
        4540, 3487, 5444, 8259, 8802, 6777, 7306, 989, 4958, 2921, 8155, 4922, 2469, 6923, 776, 9777, 1796, 708, 786,
        3158, 7369, 8715, 2136, 2510, 3739, 6411, 7996, 6211, 8282, 4805, 236, 1489, 7698 };
    int K = 27;
    LeetCode0813 solution = new LeetCode0813();
    Assert.assertEquals(167436.0833333333, solution.largestSumOfAverages(A, K), 0.0);
  }
}
