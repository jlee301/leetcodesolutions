package com.jlee.leetcodesolutions;

import java.util.LinkedList;
import java.util.Queue;

public class LeetCode1078 {
  /*
   * https://leetcode.com/problems/occurrences-after-bigram/
   */
  public String[] findOcurrences(String text, String first, String second) {
    String search = first + " " + second + " ";
    Queue<String> queue = new LinkedList<>();
    
    int idx = text.indexOf(search, 0);
    while(idx >= 0) {
      int idx2 = idx + search.length();
      // Skip ahead to next space separator
      while(idx2 < text.length() && text.charAt(idx2) != ' ')
        idx2++;
      
      String temp = text.substring(idx + search.length(), idx2);
      if(!temp.isEmpty())
        queue.add(temp);
      
      idx = text.indexOf(search, idx + search.length());
    }
    
    String[] result = new String[queue.size()];
    idx = 0;
    while(!queue.isEmpty())
      result[idx++] = queue.poll();
    
    return result;
  }
}
