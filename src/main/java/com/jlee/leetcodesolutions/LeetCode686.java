package com.jlee.leetcodesolutions;

public class LeetCode686 {
  /*
   * Given two strings A and B, find the minimum number of times A has to be
   * repeated such that B is a substring of it. If no such solution, return -1.
   * 
   * For example, with A = "abcd" and B = "cdabcdab".
   * 
   * Return 3, because by repeating A three times (“abcdabcdabcd”), B is a
   * substring of it; and B is not a substring of A repeated two times
   * ("abcdabcd").
   * 
   * Note: The length of A and B will be between 1 and 10000.
   * 
   * https://leetcode.com/problems/repeated-string-match/description/
   */
  public int repeatedStringMatch(String A, String B) {
    if(A == null || B == null || A.length() == 0 || B.length() == 0)
      return -1;
    
    int count = 1;
    while(A.length() <= B.length()) {
      if(A.indexOf(B) != -1) {
        return count;
      } else {
        A = A + A;
        count++;
      }
    }
    if(A.indexOf(B) != -1)
      return count;
    else
      return -1;
  }
}
