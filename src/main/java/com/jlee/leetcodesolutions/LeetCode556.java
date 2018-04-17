package com.jlee.leetcodesolutions;

import java.util.Arrays;

public class LeetCode556 {
  /*
   * Given a positive 32-bit integer n, you need to find the smallest 32-bit
   * integer which has exactly the same digits existing in the integer n and is
   * greater in value than n. If no such positive 32-bit integer exists, you need
   * to return -1.
   * 
   * Example 1:
   * Input: 12 
   * Output: 21
   * 
   * Example 2:
   * Input: 21 
   * Output: -1
   * 
   * https://leetcode.com/problems/next-greater-element-iii/description/
   */
  public int nextGreaterElement(int n) {
    // if entire number is descending, then not possible
    // if entire number is ascending, then swap last two digits
    
    char[] data = Integer.toString(n).toCharArray();
    // 1. Traverse digits in reverse until we find the next digit is smaller (last
    // instance of ascending of two digits)
    int i;
    for(i = data.length-1; i > 0; i--)
      if(data[i-1] < data[i]) break;
    // 2. If entire number is descending, then not possible
    if(i == 0) return -1;
    // 3. Sort everything right ascending
    Arrays.sort(data, i, data.length);
    // 4. Check all digits right of the smaller digit and obtain position of the
    // least greater number
    char temp = data[i-1];
    int j = i;
    // Move position j until temp < data[j]
    while(temp >= data[j]) j++;
    // 6. Now swap numbers
    data[i-1] = data[j];
    data[j] = temp;
    // 7. Reassemble number for return. Use Long in case it exceeds 32 bit
    long result = Long.valueOf(String.valueOf(data));
    return result > Integer.MAX_VALUE ? -1 : (int) result;
  }
}
