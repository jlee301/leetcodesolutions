package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode1029;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode1029 {
  @Test
  public void testProblemCase1() {
    int[][] costs = {{10,20},{30,200},{400,50},{30,20}};
    LeetCode1029 solution = new LeetCode1029();
    Assert.assertEquals(110, solution.twoCitySchedCost(costs));
  }

  @Test
  public void testProblemCase2() {
    int[][] costs = { { 555, 594 }, { 403, 796 }, { 203, 847 }, { 292, 885 }, { 525, 478 }, { 327, 970 }, { 297, 483 },
        { 540, 102 }, { 855, 412 }, { 174, 684 }, { 591, 837 }, { 431, 385 }, { 107, 740 }, { 433, 854 }, { 472, 205 },
        { 862, 439 }, { 961, 598 }, { 440, 574 }, { 716, 156 }, { 202, 976 }, { 170, 661 }, { 661, 823 }, { 867, 44 },
        { 372, 606 }, { 8, 281 }, { 705, 704 }, { 48, 6 }, { 909, 266 }, { 675, 515 }, { 484, 749 } };
    LeetCode1029 solution = new LeetCode1029();
    Assert.assertEquals(10202, solution.twoCitySchedCost(costs));
  }
}
