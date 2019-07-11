package com.jlee.leetcodesolutions;

public class LeetCode1109 {
  /*
   * https://leetcode.com/problems/corporate-flight-bookings/
   */
  public int[] corpFlightBookings(int[][] bookings, int n) {
    int[] result = new int[n];

    for(int[] booking : bookings) {
      result[booking[0] - 1] += booking[2];
      if(booking[1] < n)
        result[booking[1]] -= booking[2];
    }
    
    for(int i = 1; i < result.length; i++)
      result[i] += result[i-1];
    
    return result;
  }
}
