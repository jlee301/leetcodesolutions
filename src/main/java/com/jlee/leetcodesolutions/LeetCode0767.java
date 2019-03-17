package com.jlee.leetcodesolutions;

import java.util.Comparator;
import java.util.PriorityQueue;

public class LeetCode0767 {
  /*
   * Given a string S, check if the letters can be rearranged so that two
   * characters that are adjacent to each other are not the same.
   * 
   * If possible, output any possible result. If not possible, return the empty
   * string.
   * 
   * Example 1:
   * Input: S = "aab"
   * Output: "aba"
   * 
   * Example 2:
   * Input: S = "aaab"
   * Output: ""
   * 
   * Note:
   * S will consist of lowercase letters and have length in range [1, 500].
   * 
   * https://leetcode.com/problems/reorganize-string/description/
   */
  public String reorganizeString(String S) {
    // Find frequency of each char
    int[] counts = new int[26];
    for(char ch : S.toCharArray())
      counts[ch - 'a']++;

    // Organize counts to be sorted by frequency in descending order
    // Using a PriorityQueue so that way the highest frequency will constantly be
    // on top of the queue
    PriorityQueue<int[]> queue = new PriorityQueue<>(new CountDescendingComparator());
    for(int i = 0; i < counts.length; i++) {
      if(counts[i] == 0) continue;
      queue.add(new int[] { i+'a', counts[i] });
    }

    StringBuilder sb = new StringBuilder();
    while(!queue.isEmpty()) {
      // Propagate new string with highest frequency char
      int[] high = queue.poll();
      if(sb.length() == 0 || sb.charAt(sb.length()-1) != high[0]) {
        sb.append((char) high[0]);
        // Reinsert back into queue if not depleted
        if(--high[1] > 0)
          queue.add(high);
      }
      else {
        // Propogate next highest char if prev char inserted is the same as highest
        // If there is no next highest to insert, then the result is impossible
        if(queue.isEmpty()) 
          return "";
        int[] nextHigh = queue.poll();
        sb.append((char) nextHigh[0]);
        // Reinsert back into queue if not depleted
        if(--nextHigh[1] > 0)
          queue.add(nextHigh);
        queue.add(high);
      }
    }
    return sb.toString();
  }
  
  private class CountDescendingComparator implements Comparator<int[]> {
    @Override
    public int compare(int[] a, int[] b) {
      return b[1] - a[1];
    }
  }
}
