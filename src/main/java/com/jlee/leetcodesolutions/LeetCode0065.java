package com.jlee.leetcodesolutions;

public class LeetCode0065 {
  /*
   * Validate if a given string can be interpreted as a decimal number.
   * 
   * https://leetcode.com/problems/valid-number/
   */
  public boolean isNumber(String s) {
    if(s == null)
      return false;
    
    // remove any outer empty spaces
    s = s.trim();
    
    // split by base and exponent
    int idx = s.indexOf("e");
    boolean baseValid = true;
    boolean expValid = true;
    String base = "";
    String exp = "";
    
    // Validate the base
    if(idx < 0) {
      base = s;
      baseValid = isBaseValid(s);
    }
    // Validate the exponent if it exist
    else if(idx > 0) {
      base = s.substring(0, idx);
      baseValid = isBaseValid(base);
      exp = s.substring(idx+1);
      expValid = isExponentValid(exp);
    }
    else {
      baseValid = false;
      expValid = false;
    }
    
    return baseValid && expValid;
  }
  
  private boolean isBaseValid(String base) {
    boolean numberFound = false;
    boolean oneDecimalFound = false;
    for(int i = 0; i < base.length(); i++) {
      char ch = base.charAt(i);

      // The + - sign can only occurs once and in the beginning
      if(i == 0 && (ch == '+' || ch == '-'))
        continue;
      
      // You can only have one decimal place
      if(ch == '.') {
        if(oneDecimalFound)
          return false;
        else
          oneDecimalFound = true;
      }      
      else if(Character.isDigit(ch)) {
        numberFound = true;
      }
      else {
        // Any other character found is invalid
        return false;
      }
    }
    return numberFound;
  }
  
  private boolean isExponentValid(String exp) {
    boolean numberFound = false;
    for(int i = 0; i < exp.length(); i++) {
      char ch = exp.charAt(i);

      // The + - sign can only occurs once and in the beginning
      if(i == 0 && (ch == '+' || ch == '-'))
        continue;
      
      if(Character.isDigit(ch)) {
        numberFound = true;
      }
      else {
        // Any other character found is invalid
        return false;
      }
    }
    return numberFound;
  }
}
