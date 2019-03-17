package com.jlee.leetcodesolutions;

import java.util.ArrayList;
import java.util.List;

public class LeetCode0722 {
  /*
   * https://leetcode.com/problems/remove-comments/description/
   */
  public List<String> removeComments(String[] source) {
    String data = "";
    for(String line : source)
      data = data + line + '\n';
    
    StringBuilder sb = new StringBuilder();
    for(int i = 0; i < data.length(); i++) {
      char ch = data.charAt(i);
      if(ch == '/') {
        char nextCh = data.charAt(i+1);

        // Line comment
        if(nextCh == '/') {
          i = i + 2;
          nextCh = data.charAt(i);
          // Advance until I find newline
          while(nextCh != '\n') {
            i++;
            nextCh = data.charAt(i);
          }
          sb.append('\n');
          continue;
        }

        // Block comment
        if(nextCh == '*') {
          i = i + 2;
          nextCh = data.charAt(i);
          // Advance until I find "*/"
          while(!(nextCh == '*' && data.charAt(i+1) == '/')) {
            i++;
            nextCh = data.charAt(i);
          }
          i++; // To cover the '/' in "*/"
          continue;
        }
      }
      sb.append(ch);
    }
    
    // Convert array into list.
    String[] result = sb.toString().split("\n");
    List<String> list = new ArrayList<>();
    for(String line : result) {
      if(line.isEmpty()) continue;
      list.add(line);
    }
    return list;
  }
}
