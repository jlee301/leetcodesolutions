package com.jlee.leetcodesolutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LeetCode0763 {
  /*
   * A string S of lowercase letters is given. We want to partition this string
   * into as many parts as possible so that each letter appears in at most one
   * part, and return a list of integers representing the size of these parts.
   * 
   * Example 1:
   * Input: S = "ababcbacadefegdehijhklij"
   * Output: [9,7,8]
   * Explanation:
   * The partition is "ababcbaca", "defegde", "hijhklij". This is a partition so
   * that each letter appears in at most one part. A partition like
   * "ababcbacadefegde", "hijhklij" is incorrect, because it splits S into less
   * parts.
   * 
   * Note:
   * 1. S will have length in range [1, 500].
   * 2. S will consist of lowercase letters ('a' to 'z') only.
   * 
   * https://leetcode.com/problems/partition-labels/description/
   */
  public List<Integer> partitionLabels(String S) {
    // Create Map for the start and end index for each character
    HashMap<Character,int[]> map = new HashMap<>();
    for(int i = 0; i < S.length(); i++) {
      char ch = S.charAt(i);
      if(!map.containsKey(ch))
        map.put(ch, new int[] {i,i});
      else 
        map.get(ch)[1] = i;
    }
    
    boolean[] used = new boolean[26];
    List<int[]> list = new ArrayList<>();
    for(int i = 0; i < S.length(); i++) {
      char ch = S.charAt(i);

      // If char been used already, skip
      if(used[ch - 'a']) continue;
      used[ch - 'a'] = true;
      int[] edge = map.get(ch);

      if(list.isEmpty()) 
        list.add(edge);
      else {
        // Determine if this char belongs to an existing partition
        boolean added = false;
        for(int j = 0; j < list.size(); j++) {
          int[] temp = list.get(j);
          if(temp[1] > edge[0]) {
            // char is part of this partition
            added = true;
            if(edge[1] > temp[1]) {
              // char expands current partition
              temp[1] = edge[1];
              break;
            }
          }
        }
        // Creates a new partition
        if(!added) list.add(edge);
      }
    }
    
    // Convert to range
    List<Integer> result = new ArrayList<>();
    for(int[] range : list)
      result.add(range[1] - range[0] + 1);
    return result;
  }
}
