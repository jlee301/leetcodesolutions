package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode658;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode658 {
  @Test
  public void testProblemCase1() {
    int[] arr = {1,2,3,4,5};
    int k = 4, x = 3;
    LeetCode658 solution = new LeetCode658();
    List<Integer> result = solution.findClosestElements(arr, k, x);
    Integer[] data = new Integer[result.size()];
    result.toArray(data);
    Assert.assertArrayEquals(new Integer[] {1,2,3,4}, data);
  }

  @Test
  public void testProblemCase2() {
    int[] arr = {1,2,3,4,5};
    int k = 4, x = -1;
    LeetCode658 solution = new LeetCode658();
    List<Integer> result = solution.findClosestElements(arr, k, x);
    Integer[] data = new Integer[result.size()];
    result.toArray(data);
    Assert.assertArrayEquals(new Integer[] {1,2,3,4}, data);
  }

  @Test
  public void testProblemCase3() {
    int[] arr = {1,2,3,4,5};
    int k = 4, x = 6;
    LeetCode658 solution = new LeetCode658();
    List<Integer> result = solution.findClosestElements(arr, k, x);
    Integer[] data = new Integer[result.size()];
    result.toArray(data);
    Assert.assertArrayEquals(new Integer[] {2,3,4,5}, data);
  }
  
  @Test
  public void testWrongAns() {
    int[] arr = {0,0,1,2,3,3,4,7,7,8};
    int k = 3, x = 5;
    LeetCode658 solution = new LeetCode658();
    List<Integer> result = solution.findClosestElements(arr, k, x);
    Integer[] data = new Integer[result.size()];
    result.toArray(data);
    Assert.assertArrayEquals(new Integer[] {3,3,4}, data);    
  }
}
