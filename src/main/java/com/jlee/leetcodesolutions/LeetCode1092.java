package com.jlee.leetcodesolutions;

public class LeetCode1092 {
  /*
   * https://leetcode.com/problems/shortest-common-supersequence/
   */
  public String shortestCommonSupersequence(String str1, String str2) {
    String lcs = lcs(str1, str2);
    
    // Rebuild final output around the longest common subsequence of str1 and str2
    StringBuilder sb = new StringBuilder();
    int j = 0, k = 0;
    for(int i = 0; i < lcs.length(); i++) {
      char ch = lcs.charAt(i);
      while(str1.charAt(j) != ch) {
        sb.append(str1.charAt(j));
        j++;
      }
      while(str2.charAt(k) != ch) {
        sb.append(str2.charAt(k));
        k++;
      }
      sb.append(ch);
      j++;
      k++;
    }
    // Append any remaining chars (if any)
    sb.append(str1.substring(j));
    sb.append(str2.substring(k));
    return sb.toString();
  }
  
  public String lcs(String str1, String str2) {
    return lcs(str1, str2, str1.length()-1, str2.length()-1, new String[str1.length()][str2.length()]);
  }
  
  private String lcs(String str1, String str2, int i, int j, String[][] memo) {
    if(i < 0 || j < 0) {
      // Base case: if one string is empty, then there is nothing in common
      return "";
    }
    
    if(memo[i][j] != null)
      return memo[i][j];
    
    // Evaluate the last character
    String temp = "";
    if(str1.charAt(i) == str2.charAt(j)) {
      temp = lcs(str1, str2, i-1, j-1, memo) + str1.charAt(i);
    }
    else {
      // Which path will provide a longer lcs, eliminating last char from str1 or str2
      String path1 = lcs(str1, str2, i-1, j, memo);
      String path2 = lcs(str1, str2, i, j-1, memo);
      temp = path1.length() >= path2.length() ? path1 : path2;      
    }
    
    memo[i][j] = temp;
    return temp;
  }
}
