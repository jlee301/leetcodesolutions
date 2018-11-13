package com.jlee.leetcodesolutions;

import java.util.ArrayList;
import java.util.List;

public class LeetCode068 {
  /*
   * https://leetcode.com/problems/text-justification/
   */
  public List<String> fullJustify(String[] words, int maxWidth) {
    List<String> result = new ArrayList<>();
    
    int len = 0;
    List<String> line = new ArrayList<>();
    for(int i = 0; i < words.length; i++) {
      // check to see if you have space to add the word into the line
      if(len + line.size() + words[i].length() <= maxWidth) {
        line.add(words[i]);
        len += words[i].length();
      }
      // line is full, you can process it now
      else {
        // Add space padding
        String temp = "";
        
        if(line.size() == 1) {
          // Only one word in the line (left justified)
          temp = line.get(0);
          while(temp.length() < maxWidth)
            temp += ' ';
        }
        else {
          int d = (maxWidth - len) / (line.size() - 1);
          int r = (maxWidth - len) % (line.size() - 1);
          for(int j = 0; j < line.size()-1; j++) {
            temp += line.get(j);
            for(int k = 0; k < d + (r > 0 ? 1 : 0); k++)
              temp += ' ';
            r--;
          }
          // Adding last word of the line
          temp += line.get(line.size()-1);
        }
        result.add(temp);
        i--;
        len = 0;
        line.clear();
      }
    }
    // Add the last line into result (left justified)
    String temp = "";
    for(String word : line)
      temp += word + ' ';
    
    while(temp.length() < maxWidth)
      temp += ' ';

    if(temp.length() > maxWidth)
      temp = temp.trim();
    
    result.add(temp);
    return result;
  }
}
