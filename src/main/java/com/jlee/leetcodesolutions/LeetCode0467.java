package com.jlee.leetcodesolutions;

// import java.util.HashSet;

public class LeetCode0467 {
  /*
   * Consider the string s to be the infinite wraparound string of
   * "abcdefghijklmnopqrstuvwxyz", so s will look like this:
   * "...zabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcd....".
   * 
   * Now we have another string p. Your job is to find out how many unique
   * non-empty substrings of p are present in s. In particular, your input is the
   * string p and you need to output the number of different non-empty substrings
   * of p in the string s.
   * 
   * Note: p consists of only lowercase English letters and the size of p might be
   * over 10000.
   * 
   * https://leetcode.com/problems/unique-substrings-in-wraparound-string/description/
   */
  public int findSubstringInWraproundString(String p) {
    if(p == null || p.isEmpty())
      return 0;
    
    // HashSet<String> set = new HashSet<>();
    int[] count = new int[26];
    // For a substring starting at the same char, we only need to record the longest
    // one because it covers all the shorter substrings starting from the char. The
    // length is the number of substrings starting at the char.
    for(int i = 0; i < p.length(); i++) {
      for(int j = i; j < p.length(); j++) {
        if(j > i && p.charAt(j-1)+1 != p.charAt(j) && p.charAt(j-1) - p.charAt(j) != 25)
          break;
        // set.add(p.substring(i, j+1));
        count[p.charAt(i)-'a'] = Math.max(count[p.charAt(i)-'a'], j-i+1);
      }
    }
    // return set.size();
    int sum = 0;
    for(int num : count)
      sum += num;
    return sum;
  }
}
