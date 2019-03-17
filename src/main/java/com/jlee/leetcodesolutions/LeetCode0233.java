package com.jlee.leetcodesolutions;

public class LeetCode0233 {
  /*
   * Given an integer n, count the total number of digit 1 appearing in all
   * non-negative integers less than or equal to n.
   * 
   * https://leetcode.com/problems/number-of-digit-one/description/
   */
  public int countDigitOne(int n) {
     int count = 0;
     if(n <= 0)
       return count;
          
     // 1. every 10 numbers there's a one 1's in one's place (ie 1, 11, 21, 31...)
     // 2. every 100 numbers, there's ten 1's in ten's place (ie 10, 11, 12,...19, 110, 111, 112,...119)
     // 3. every 1000 numbers, there's 100 1's in then hundred's place (ie 100, 101, 102,...199, 1100, 1101, 1102,...1199)
     for(long i = 1; i <= n; i *= 10) {
       long r = n / i;
       long m = n % i;
       // if n = 12, we will need to calculate the remainder 12 % 10 = 2 = m, m + 1 = 3 (10, 11, 12)
      // the r+8 is balance the equation for when ie n = 20, this will automatically add the 10-19 in this scenario. Without the +8, the result would be zero.
       count += (r + 8) / 10 * i + (r % 10 == 1 ? m + 1 : 0);
     }
     return count;
   }
}
