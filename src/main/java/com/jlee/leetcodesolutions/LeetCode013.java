package com.jlee.leetcodesolutions;

public class LeetCode013 {
  /*
   * Given a roman numeral, convert it to an integer. Input is guaranteed to be
   * within the range from 1 to 3999.
   * 
   * M = 1000, D = 500, C = 100, L = 50, X = 10, V = 5, I = 1
   * 
   * Input: XIII 
   * Output: 13
   * 
   * Input: XLIX 
   * Output: 49
   * 
   * https://leetcode.com/problems/roman-to-integer/description/
   */
  public int romanToInt(String s) {
    // Map each roman numeral to it's value
    int[] map = new int[26];
    map['I' - 'A'] = 1;
    map['V' - 'A'] = 5;
    map['X' - 'A'] = 10;
    map['L' - 'A'] = 50;
    map['C' - 'A'] = 100;
    map['D' - 'A'] = 500;
    map['M' - 'A'] = 1000;
    
    int result = 0;
    for(int i = 0; i < s.length() - 1; i++) {
      // If the next roman numeral is greater, it means we must deduct
      // ie. IV = 4 --> -1 + 5 = 4
      if(map[s.charAt(i) - 'A'] < map[s.charAt(i+1) - 'A'])
        result -= map[s.charAt(i) - 'A'];
      else
        result += map[s.charAt(i) - 'A'];
    }
    result += map[s.charAt(s.length()-1) - 'A'];
    return result;
  }
}