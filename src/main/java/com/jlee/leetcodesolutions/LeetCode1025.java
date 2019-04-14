package com.jlee.leetcodesolutions;

public class LeetCode1025 {
  /*
   * https://leetcode.com/contest/weekly-contest-132/problems/divisor-game/
   */
  public boolean divisorGame(int N) {
    // 1. If N is an even number, Player1 can force the next move to be odd
    // 2. Player2 only has two choices when dealing with an odd number N
    //    a. whatever the divisible value is used for N - x, the next value will be
    //       even because only divisible values of an odd number will lead to an even
    //       number (eg 21 - 1 == 20, 21 - 3 == 18, 21 - 7 = 14)
    //    b. if N is 1, Player2 loses
    // 3. If N is an odd number, Player1 cannot win due to rule 2a.
    return N % 2 == 0;
  }
}
