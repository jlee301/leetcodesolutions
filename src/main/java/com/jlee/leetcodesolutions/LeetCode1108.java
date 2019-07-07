package com.jlee.leetcodesolutions;

public class LeetCode1108 {
  /*
   * https://leetcode.com/problems/defanging-an-ip-address/
   */
  public String defangIPaddr(String address) {
    StringBuilder sb = new StringBuilder();
    for(char ch : address.toCharArray()) {
      if(ch == '.')
        sb.append("[.]");
      else
        sb.append(ch);
    }
    return sb.toString();
  }
}
