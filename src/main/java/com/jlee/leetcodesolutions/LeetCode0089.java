package com.jlee.leetcodesolutions;

import java.util.ArrayList;
import java.util.List;

public class LeetCode0089 {
  /*
   * The gray code is a binary numeral system where two successive values differ
   * in only one bit.
   * 
   * Given a non-negative integer n representing the total number of bits in the
   * code, print the sequence of gray code. A gray code sequence must begin with
   * 0.
   * 
   * For example, given n = 2, return [0,1,3,2]. 
   * Binary  -->  Grey Code
   *    000  -->  000
   *    001  -->  001
   *    010  -->  011
   *    011  -->  010
   *    
   * Note:
   * 1. For a given n, a gray code sequence is not uniquely defined.
   * 2. For example, [0,2,3,1] is also a valid gray code sequence according to the
   * above definition.
   * 3. For now, the judge is able to judge based on one instance of gray code
   * sequence. Sorry about that.
   * 
   * https://leetcode.com/problems/gray-code/description/
   */
  public List<Integer> grayCode(int n) {
    List<Integer> result = new ArrayList<>();
    if(n < 0)
      return result;
    
    // n = 3 --> i < 8 (1000 binary)
    for(int i = 0; i < (1 << n); i++)
      result.add(i ^ (i >> 1));
    
    return result;
  }
}
