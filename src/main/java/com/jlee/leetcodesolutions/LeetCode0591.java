package com.jlee.leetcodesolutions;

import java.util.Stack;

public class LeetCode0591 {
  /*
   * https://leetcode.com/problems/tag-validator/description/
   */
  public boolean isValid(String code) {
    // Stack will be used to validate start and end tags
    Stack<String> stack = new Stack<>();
    for(int i = 0; i < code.length(); ) {
      
      // There is content not enclosed in a tag
      if(i > 0 && stack.isEmpty())
        return false;
      
      // Find CDATA and it's content
      // This is checked first to avoid mistaken it as a start tag
      if(code.startsWith("<![CDATA[", i)) {
        int j = code.indexOf("]]>", i + 9);
        // Appears to be CDATA was not closed
        if(j < 0)
          return false;
        // Advance past CDATA end tag
        i = j + 3;
      }
      
      // Validate end tags second to avoid mistaken it as a start tag
      else if(code.startsWith("</", i)) {
        int j = i + 2;
        i = code.indexOf(">", i);
        // Validate if tag name is valid
        // 1. Tag is closed
        // 2. Tag name is missing
        // 3. Tag name is <= 9 char count
        if(i < 0 || i == j || i - j > 9)
          return false;
        
        // Validate name is all caps
        for(int k = j; k < i; k++) {
          if(!Character.isUpperCase(code.charAt(k)))
            return false;
        }
        
        // Validate name with what is on top of the stack
        if(stack.isEmpty() || !stack.pop().equals(code.substring(j, i)))
          return false;
        i++;
      }
      
      // Validate start tags
      else if(code.startsWith("<", i)) {
        int j = i + 1;
        i = code.indexOf(">", i);
        // Validate if tag name is valid
        // 1. Tag is closed
        // 2. Tag name is missing
        // 3. Tag name is <= 9 char count
        if(i < 0 || i == j || i - j > 9)
          return false;
        
        // Validate name is all caps
        for(int k = j; k < i; k++) {
          if(!Character.isUpperCase(code.charAt(k)))
            return false;
        }
        
        // Store into stack to validate with end tag name
        stack.push(code.substring(j, i));
        i++;
      }
      
      else {
        i++;
      }
    }
    return stack.isEmpty();
  }
}
