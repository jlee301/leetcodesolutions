package com.jlee.leetcodesolutions;

public class LeetCode0831 {
  /*
   * https://leetcode.com/contest/weekly-contest-83/problems/masking-personal-information/
   */
  public String maskPII(String S) {
    String masked = "";
    // Email detect
    if(S.indexOf("@") >= 0) {
      S = S.toLowerCase();
      String[] data = S.split("@");
      masked = data[0].charAt(0) + "*****" + data[0].charAt(data[0].length()-1) + "@" + data[1];
    }
    // Phone number detect
    else {
      //'+', '-', '(', ')', ' '
      String[] data = S.split("\\+|\\-|\\(|\\)| ");
      String temp = "";
      for(String seg : data) {
        if(seg.isEmpty()) continue;
        temp = temp + seg;
      }
      // Local phone number
      if(temp.length() == 10)
        masked = "***-***-" + temp.substring(6);
      else {
        // Country code included
        masked = "-***-***-" + temp.substring(temp.length()-4);
        // Fill an asterisk for the length of the country code
        for(int i = 0; i < temp.length()-10; i++)
          masked = "*" + masked;
        masked = "+" + masked;
      }
    }
    // System.out.println(masked);
    return masked;
  }
}
