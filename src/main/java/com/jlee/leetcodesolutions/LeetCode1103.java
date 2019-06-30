package com.jlee.leetcodesolutions;

public class LeetCode1103 {
  /*
   * https://leetcode.com/problems/distribute-candies-to-people/
   */
  public int[] distributeCandies(int candies, int num_people) {
    int[] result = new int[num_people];
    int curr = 1;
    int i = 0;
    while(candies > 0) {
      result[i] += candies >= curr ? curr : candies;
      candies -= curr;
      curr++;
      i = i == num_people-1 ? 0 : i + 1;
    }
    return result;
  }
}
