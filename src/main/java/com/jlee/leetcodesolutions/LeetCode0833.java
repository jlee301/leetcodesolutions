package com.jlee.leetcodesolutions;

import java.util.TreeMap;

public class LeetCode0833 {
  /*
   * To some string S, we will perform some replacement operations that replace
   * groups of letters with new ones (not necessarily the same size).
   * 
   * Each replacement operation has 3 parameters: a starting index i, a source
   * word x and a target word y. The rule is that if x starts at position i in the
   * original string S, then we will replace that occurrence of x with y. If not,
   * we do nothing.
   * 
   * For example, if we have S = "abcd" and we have some replacement operation i =
   * 2, x = "cd", y = "ffff", then because "cd" starts at position 2 in the
   * original string S, we will replace it with "ffff".
   * 
   * Using another example on S = "abcd", if we have both the replacement
   * operation i = 0, x = "ab", y = "eee", as well as another replacement
   * operation i = 2, x = "ec", y = "ffff", this second operation does nothing
   * because in the original string S[2] = 'c', which doesn't match x[0] = 'e'.
   * 
   * All these operations occur simultaneously. It's guaranteed that there won't
   * be any overlap in replacement: for example, S = "abc", indexes = [0, 1],
   * sources = ["ab","bc"] is not a valid test case.
   * 
   * https://leetcode.com/contest/weekly-contest-84/problems/find-and-replace-in-string/
   */
  public String findReplaceString(String S, int[] indexes, String[] sources, String[] targets) {
    // Store index of replacement --> array[0] = source, array[1] = target
    // I use a map because there is nothing that guarantees the order of indexes
    TreeMap<Integer, String[]> map = new TreeMap<>();
    for(int i = 0; i < indexes.length; i++)
        map.put(indexes[i], new String[] {sources[i], targets[i]});
    
    StringBuilder sb = new StringBuilder();
    int pos = 0;
    for(int key : map.keySet()) {
        // Add everything from S[pos] : S[key]
        sb.append(S.substring(pos, key));
        pos = key;
        String[] replace = map.get(key);
        
        // If source is at S[key], add the target
        if(S.indexOf(replace[0], key) == key) {
            sb.append(replace[1]);
            pos += replace[0].length(); 
        }
    }
    // Finally add what's remaining
    sb.append(S.substring(pos));
    return sb.toString();
  }
}
