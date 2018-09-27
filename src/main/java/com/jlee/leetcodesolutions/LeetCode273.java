package com.jlee.leetcodesolutions;

public class LeetCode273 {
  /*
   * Convert a non-negative integer to its english words representation. Given
   * input is guaranteed to be less than 2^31 - 1.
   * 
   * https://leetcode.com/problems/integer-to-english-words/description/
   */
  private String[] ones = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
  private String[] twos = {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
  private String[] prefix = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
  private String HUNDRED = "Hundred";
  private String[] suffix = {"", "Thousand", "Million", "Billion"};

  public String numberToWords(int num) {
    String result = "";
    
    if(num == 0)
      return ones[0];
    
    for(int i = 0; num != 0; i++) {
      int r = num % 1000;
      num /= 1000;
      
      // Prefix zero to the string so it is three digit evaluation
      String str = String.valueOf(r);
      while(str.length() != 3)
        str = "0" + str;
      
      String curr = "";
      if(str.charAt(0) > '0')
        curr = curr + " " + ones[Character.getNumericValue(str.charAt(0))] + " " + HUNDRED;
      
      if(str.charAt(1) > '1') {
        curr = curr + " " + prefix[Character.getNumericValue(str.charAt(1))];
        if(str.charAt(2) > '0')
          curr = curr + " " + ones[Character.getNumericValue(str.charAt(2))];
      }
      else if(str.charAt(1) == '1') {
        curr = curr + " " + twos[Character.getNumericValue(str.charAt(2))];
      }
      else {
        // second digit is zero
        if(str.charAt(2) > '0')
          curr = curr + " " + ones[Character.getNumericValue(str.charAt(2))];
      }
      
      // Add the suffix only if non-zero
      if(r > 0)
        curr = curr + " " + suffix[i];
      
      result = curr + result;
      // System.out.println(result);
    }
    return result.trim();
  }
}
