package com.jlee.leetcodesolutions;

import java.util.ArrayList;
import java.util.List;

public class LeetCode1029 {
  /*
   * https://leetcode.com/contest/weekly-contest-130/problems/binary-prefix-divisible-by-5/
   */
  public List<Boolean> prefixesDivBy5(int[] A) {
    List<Boolean> list = new ArrayList<>();
    
    // next number = prev number * 2 + next digit
    // ie (0110)
    //    (0)    --> 0 * 2 + 0 = 0
    //    (01)   --> 0 * 2 + 1 = 1
    //    (011)  --> 1 * 2 + 1 = 3
    //    (0110) --> 3 * 2 + 0 = 6
    // (ab + c) % d == ((a % d)(b % d) + (c % d)) % d.
    int num = 0;
    for(int d : A) {
      num = (num * 2 + d) % 5;
      list.add(num == 0);
    }
    return list;
  }
}
