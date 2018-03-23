package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode386;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode386 {
  @Test
  public void testN1() {
    int n = 1;
    LeetCode386 solution = new LeetCode386();
    List<Integer> result = solution.lexicalOrder(n);
    Integer[] actualsArray = new Integer[1];
    actualsArray = result.toArray(actualsArray);
    Integer[] expectedArray = { 1 };
    Assert.assertEquals(1, actualsArray.length);
    Assert.assertArrayEquals(expectedArray, actualsArray);
  }

  @Test
  public void testN13() {
    int n = 13;
    LeetCode386 solution = new LeetCode386();
    List<Integer> result = solution.lexicalOrder(n);
    Integer[] actualsArray = new Integer[13];
    actualsArray = result.toArray(actualsArray);
    Integer[] expectedArray = {1, 10, 11, 12, 13, 2, 3, 4, 5, 6, 7, 8, 9};
    Assert.assertEquals(13, actualsArray.length);
    Assert.assertArrayEquals(expectedArray, actualsArray);
  }

  @Test
  public void testN105() {
    int n = 111;
    LeetCode386 solution = new LeetCode386();
    List<Integer> result = solution.lexicalOrder(n);
    Integer[] actualsArray = new Integer[111];
    actualsArray = result.toArray(actualsArray);
    Integer[] expectedArray = { 1, 10, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 11, 110, 111, 12, 13, 14, 15,
        16, 17, 18, 19, 2, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 3, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 4, 40, 41,
        42, 43, 44, 45, 46, 47, 48, 49, 5, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 6, 60, 61, 62, 63, 64, 65, 66, 67,
        68, 69, 7, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 8, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 9, 90, 91, 92, 93,
        94, 95, 96, 97, 98, 99 };
    Assert.assertEquals(111, actualsArray.length);
    Assert.assertArrayEquals(expectedArray, actualsArray);
  }
}
