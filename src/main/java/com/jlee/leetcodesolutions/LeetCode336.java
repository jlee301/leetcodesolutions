package com.jlee.leetcodesolutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class LeetCode336 {
  /*
   * Given a list of unique words, find all pairs of distinct indices (i, j) in
   * the given list, so that the concatenation of the two words, i.e. words[i] +
   * words[j] is a palindrome.
   * 
   * https://leetcode.com/problems/palindrome-pairs/description/
   */
  public List<List<Integer>> palindromePairs(String[] words) {
    // Dump all words into a HashMap for faster searching
    HashMap<String,Integer> map = new HashMap<>();
    for(int i = 0; i < words.length; i++)
      map.put(words[i], i);
    
    List<List<Integer>> result = new ArrayList<>();
    // 1. If one of the words is "", then ANY word that is a palindrome itself will
    // create two pairs "" + "abba" and "abba" + ""
    if(map.containsKey("")) {
      int i = map.get("");
      for(int j = 0; j < words.length; j++) {
        if(i == j) continue;
        if(isPalindrome(words[j])) {
          result.add(Arrays.asList(i, j));
          result.add(Arrays.asList(j, i));
        }
      }
    }
    
    // 2. If the exact reverse of the word exist, then that creates another pair
    // abc + cba
    for(int i = 0; i < words.length; i++) {
      String wordR = wordReversed(words[i]);
      if(map.containsKey(wordR)) {
        int j = map.get(wordR);
        if(i == j) continue;
        result.add(Arrays.asList(i, j));
      }
    }
    
    // 3. Now if the beginning or end substring is a palindrome and it's remaining
    // in reverse exist, it can create additional pairs
    // abba-abc  cba-abba-abc
    // abc-abba  abc-abba-cba
    for(int i = 0; i < words.length; i++) {
      String curr = words[i];
      for(int j = 1; j < curr.length(); j++) {
        String str1 = curr.substring(0, j);
        String str2 = curr.substring(j);
        if(isPalindrome(str1)) {
          String remainR = wordReversed(str2);
          if(map.containsKey(remainR))
            result.add(Arrays.asList(map.get(remainR), i));
        }
        
        if(isPalindrome(str2)) {
          String remainR = wordReversed(str1);
          if(map.containsKey(remainR))
            result.add(Arrays.asList(i, map.get(remainR)));
        }
      }
    }
    return result;
  }
  
  private boolean isPalindrome(String str) {
    int left = 0;
    int right = str.length()-1;
    while(left < right) {
      if(str.charAt(left) != str.charAt(right))
        return false;
      left++;
      right--;
    }
    return true;
  }
  
  private String wordReversed(String str) {
    StringBuilder sb = new StringBuilder(str);
    return sb.reverse().toString();
  }
}
