package com.jlee.leetcodesolutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode0017 {
  /*
   * Given a digit string, return all possible letter combinations that the number
   * could represent.
   * 
   * Input: Digit string "23"
   * 
   * Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
   * 
   * Note: Although the above answer is in lexicographical order, your answer
   * could be in any order you want.
   * 
   * https://leetcode.com/problems/letter-combinations-of-a-phone-number/description/
   */
  public List<String> letterCombinations(String digits){
    List<String> answer = new ArrayList<String>();
    if(digits == null || digits.length() == 0 || digits.indexOf("1") != -1 || digits.indexOf("0") != -1)
      return answer;
    
    String[][] map = { {}, {}, { "a", "b", "c" }, { "d", "e", "f" }, { "g", "h", "i" }, { "j", "k", "l" },
        { "m", "n", "o" }, { "p", "q", "r", "s" }, { "t", "u", "v" }, { "w", "x", "y", "z" } };
    
    String[] result = map[Character.getNumericValue(digits.charAt(0))];
    for(int i = 1; i < digits.length(); i++) {
      String[] temp = map[Character.getNumericValue(digits.charAt(i))];
      String[] newResult = new String[result.length * temp.length];
      int count = 0;
      for(int j = 0; j < result.length; j++) {
        for(int k = 0; k < temp.length; k++)
          newResult[count++] = result[j] + temp[k];
      }
      result = newResult;
    }
    answer = Arrays.asList(result);
    return answer;
  }
}
