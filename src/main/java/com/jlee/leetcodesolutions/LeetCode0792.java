package com.jlee.leetcodesolutions;

public class LeetCode0792 {
  /*
   * Given string S and a dictionary of words words, find the number of words[i]
   * that is a subsequence of S.
   * 
   * Example :
   * Input:
   * S = "abcde"
   * words = ["a", "bb", "acd", "ace"]
   * Output: 3
   * Explanation: There are three words in words that are a subsequence of S: "a",
   * "acd", "ace".
   * 
   * Note:
   * 1. All words in words and S will only consists of lowercase letters.
   * 2. The length of S will be in the range of [1, 50000].
   * 3. The length of words will be in the range of [1, 5000]. 4. The length of
   * words[i] will be in the range of [1, 50].
   * 
   * https://leetcode.com/problems/number-of-matching-subsequences/description/
   */
  public int numMatchingSubseq(String S, String[] words) {
    int count = 0;
    for(String word : words) {
      int pos = 0;
      boolean subseq = true;
      for(int i = 0; i < word.length(); i++) {
        pos = S.indexOf(word.charAt(i), pos);
        if(pos++ < 0) {
          subseq = false;
          break;
        }
      }
      if(subseq) count++;
    }
    return count;
  }
}
