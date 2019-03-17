package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0726;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0726 {
  @Test
  public void testProblemCase1() {
    String formula = "H2O";
    LeetCode0726 solution = new LeetCode0726();
    Assert.assertEquals("H2O", solution.countOfAtoms(formula));
  }
  
  @Test
  public void testProblemCase2() {
    String formula = "Mg(OH)2";
    LeetCode0726 solution = new LeetCode0726();
    Assert.assertEquals("H2MgO2", solution.countOfAtoms(formula));
  }
  
  @Test
  public void testProblemCase3() {
    String formula = "K4(ON(SO3)2)2";
    LeetCode0726 solution = new LeetCode0726();
    Assert.assertEquals("K4N2O14S4", solution.countOfAtoms(formula));
  }
}
