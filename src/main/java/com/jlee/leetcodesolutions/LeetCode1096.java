package com.jlee.leetcodesolutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class LeetCode1096 {
  /*
   * https://leetcode.com/problems/brace-expansion-ii/
   */
  public List<String> braceExpansionII(String expression) {
    Stack<List<String>> stack = new Stack<>();
    char op = '*';
    
    for(int i = 0; i < expression.length(); i++) {
      char ch = expression.charAt(i);
      if(ch == '{') {
        // Advance to the end of the current expression
        // {{a,b},{b,c}}  -->  {a,b},{b,c}
        // s           e       s   e s   e
        int count = 1;
        int j = i+1;
        while(count > 0) {
          char nextCh = expression.charAt(j);
          if(nextCh == '{')
            count++;
          else if(nextCh == '}')
            count--;
          
          j++;
        }
        
        List<String> temp = braceExpansionII(expression.substring(i+1, j-1));
        if(op == '*' && !stack.isEmpty()) {
          List<String> product = productExpansion(stack.pop(), temp);
          stack.push(product);
        }
        else
          stack.push(temp);
        
        op = '*';
        i = j-1;
      }
      else if(Character.isLetter(ch)) {
        List<String> temp = new ArrayList<>();
        temp.add(ch + "");
        if(op == '*' && !stack.isEmpty()) {
          List<String> product = productExpansion(stack.pop(), temp);
          stack.push(product);
        }
        else
          stack.push(temp);
        
        op = '*';
      }
      else {
        op = ',';
      }
    }
    
    // What's remaining in the stack is comma delimited, so we union the results
    List<String> list = new ArrayList<>();
    while(!stack.isEmpty()) {
      List<String> temp = stack.pop();
      for(String exp : temp) {
        if(!list.contains(exp))
          list.add(exp);
      }
    }
    // Sort lexicographically
    Collections.sort(list);
    return list;
  }
  
  private List<String> productExpansion(List<String> list1, List<String> list2) {
    // list1: {"a", "ab"}, list2: {"c", "de", "f"}
    // --> {"ac", "ade", "af", "abc", "abde", "abf"}
    List<String> list = new ArrayList<>();
    for(String a : list1) {
      for(String b : list2) {
        list.add(a + b);
      }
    }
    return list;
  }
}
