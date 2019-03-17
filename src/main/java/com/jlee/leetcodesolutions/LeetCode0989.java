package com.jlee.leetcodesolutions;

import java.util.ArrayList;
import java.util.List;

public class LeetCode0989 {
  /*
   * https://leetcode.com/contest/weekly-contest-123/problems/add-to-array-form-of-integer/
   */
  public List<Integer> addToArrayForm(int[] A, int K) {
    List<Integer> result = new ArrayList<>();
    int carry = 0;
    int i = A.length-1;
    while(i >= 0 && K > 0) {
      // obtain digit to add with A[i]
      int d = K % 10;
      K /= 10;
      
      // A[i] + d
      int curr = A[i] + d + carry;
      d = curr % 10;
      carry = curr / 10;
      result.add(0, d);      
      i--;
    }
    
    // A still has more digits
    while(i >= 0) {
      int curr = A[i] + carry;
      carry = curr / 10;
      int d = curr % 10;
      result.add(0, d);
      i--;
    }
    
    // K still has more digits
    while(K > 0) {
      int curr = (K % 10) + carry;
      carry = curr / 10;
      int d = curr % 10;
      K /= 10;
      result.add(0, d);
    }
    
    if(carry > 0)
      result.add(0, carry);
    
    return result;
  }
}
