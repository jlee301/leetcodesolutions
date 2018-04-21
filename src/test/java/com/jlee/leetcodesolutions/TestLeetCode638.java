package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode638;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode638 {
  @Test
  public void testProblemCase1() {
    List<Integer> price = Arrays.asList(2,5);
    List<List<Integer>> special = new ArrayList<>();
    special.add(Arrays.asList(3,0,5));
    special.add(Arrays.asList(1,2,10));
    List<Integer> needs = Arrays.asList(3,2);
    LeetCode638 solution = new LeetCode638();
    Assert.assertEquals(14, solution.shoppingOffers(price, special, needs));
  }

  @Test
  public void testProblemCase2() {
    List<Integer> price = Arrays.asList(2,3,4);
    List<List<Integer>> special = new ArrayList<>();
    special.add(Arrays.asList(1,1,0,4));
    special.add(Arrays.asList(2,2,1,9));
    List<Integer> needs = Arrays.asList(1,2,1);
    LeetCode638 solution = new LeetCode638();
    Assert.assertEquals(11, solution.shoppingOffers(price, special, needs));
  }
}
