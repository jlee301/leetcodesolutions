package com.jlee.leetcodesolutions;

public class LeetCode1109 {
  /*
   * https://leetcode.com/problems/corporate-flight-bookings/
   */
  public int[] corpFlightBookings(int[][] bookings, int n) {
    int[] result = new int[n];
    for(int[] booking : bookings) {
      for(int i = booking[0] - 1; i < booking[1]; i++)
        result[i] += booking[2];
    }
    return result;
  }
}
