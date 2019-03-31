package com.jlee.leetcodesolutions;

public class LeetCode1028 {
  /*
   * https://leetcode.com/contest/weekly-contest-130/problems/convert-to-base-2/
   */
  public String baseNeg2(int N) {
    if(N == 0)
      return "0";
    
    StringBuilder sb = new StringBuilder();
    
    // (146)10 --> (21102)–3.
    // 146 % -3 --> -48 remainder 2
    // -48 % -3 -->  16 remainder 0
    //  16 % -3 -->  -5 remainder 1
    //  -5 % -3 -->   2 remainder 1 (1 remainder -2)
    //   2 % -3 -->   0 remainder 2
    while(N != 0) {
      int r = N % -2;
      N /= -2;
      
      if(r < 0) {
        r += 2;
        N += 1;
      }
      sb.append(r);
    }
    return sb.reverse().toString();
  }
}
