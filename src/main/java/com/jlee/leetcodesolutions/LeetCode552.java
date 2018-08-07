package com.jlee.leetcodesolutions;

import java.util.Arrays;

public class LeetCode552 {
  /*
   * Given a positive integer n, return the number of all possible attendance
   * records with length n, which will be regarded as rewardable. The answer may
   * be very large, return it after mod 10^9 + 7.
   * 
   * A student attendance record is a string that only contains the following
   * three characters:
   * 'A' : Absent.
   * 'L' : Late.
   * 'P' : Present.
   * 
   * A record is regarded as rewardable if it doesn't contain more than one 'A'
   * (absent) or more than two continuous 'L' (late).
   * 
   * Note: The value of n won't exceed 100,000.
   * 
   * https://leetcode.com/problems/student-attendance-record-ii/description/
   */
  public int checkRecord(int n) {
    long MOD = 1000000007;
    
    // There are six states
    // states[0] = count with A, not ending in L
    // states[1] = count with A, ending in one L
    // states[2] = count with A, ending in two L's
    // states[3] = count w/o A, not ending in L
    // states[4] = count w/o A, ending in one L
    // states[5] = count w/o A, ending in two L's
    //
    // Inititally, n = 1
    // states = { 1, 0, 0, 1, 1, 0 }
    //            A        L  P
    long[] states = { 1, 0, 0, 1, 1, 0 };
    for(int i = 1; i < n; i++) {
      long[] temp = { 0, 0, 0, 0, 0, 0 };
      temp[0] = Arrays.stream(states).sum() % MOD; // Adding P from states[0,1,2], adding A from states[3,4,5]
      temp[1] = states[0] % MOD; // Adding L from states[0]
      temp[2] = states[1] % MOD; // Adding L from states[1];
      temp[3] = (states[3] + states[4] + states[5]) % MOD; // Adding P from states[3,4,5];
      temp[4] = states[3] % MOD; // Adding L from states[3]
      temp[5] = states[4] % MOD; // Adding L from states[4]
      states = temp;
    }
    return (int) (Arrays.stream(states).sum() % MOD);
  }
}
