package com.jlee.leetcodesolutions;

public class LeetCode1037 {
  /*
   * https://leetcode.com/contest/weekly-contest-135/problems/valid-boomerang/
   */
  public boolean isBoomerang(int[][] points) {
    // y3 - y1 / x3 - x1  ==  y2 - y1 / x2 - x1  --> straight line
    // (y3 - y1) * (x2 - x1) == (y2 - y1) * (x3 - x1);
    int left = (points[2][1] - points[0][1]) * (points[1][0] - points[0][0]);
    int right = (points[1][1] - points[0][1]) * (points[2][0] - points[0][0]);
    return left != right;
  }
}
