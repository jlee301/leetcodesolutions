package com.jlee.leetcodesolutions;

public class LeetCode984 {
  /*
   * https://leetcode.com/contest/weekly-contest-121/problems/string-without-aaa-or-bbb/
   */
  public String strWithout3a3b(int A, int B) {
    StringBuilder sb = new StringBuilder();
    // diff = how many times you need to double place the higher frequency char
    int diff = 0;
    // count makes sure we do not over place the higher frequency char
    int count = 0;
    if(A > B) {
      diff = A-B;
      for(int i = 0; i < diff && sb.length() < A+B; i++) {
        sb.append('a');
        count++;
        
        if(count < A) {
          sb.append('a');
          count++;
        }
        
        if(sb.length() < A+B)
          sb.append('b');
      }

      while(sb.length() < A+B) {
        sb.append('a');
        sb.append('b');
      }
    }
    else if(A < B) {
      diff = B-A;
      for(int i = 0; i < diff && sb.length() < A+B; i++) {
        sb.append('b');
        count++;
        
        if(count < B) {
          sb.append('b');
          count++;
        }
        
        if(sb.length() < A+B)
          sb.append('a');
      }

      while(sb.length() < A+B) {  
        sb.append('b');
        sb.append('a');
      }
    }
    else {
      while(sb.length() < A+B) {
        sb.append('a');
        sb.append('b');
      }
    }
    return sb.toString();
  }
}
