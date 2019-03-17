package com.jlee.leetcodesolutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LeetCode0736 {
  public int evaluate(String expression) {
    return evaluate(expression, new HashMap<>());
  }
  
  private int evaluate(String expression, HashMap<String,Integer> parent) {
    if(expression.charAt(0) != '(') {
      if(Character.isDigit(expression.charAt(0)) || expression.charAt(0) == '-')
        return Integer.valueOf(expression);
      return parent.get(expression);
    }
    
    // Create new scope
    HashMap<String,Integer> map = new HashMap<>();
    map.putAll(parent);
    
    // Split up the expression
    List<String> tokens = parse(expression.substring(expression.charAt(1) == 'm' ? 6 : 5, expression.length()-1));
    
    // mult
    if(expression.startsWith("(m"))
      return evaluate(tokens.get(0), map) * evaluate(tokens.get(1), map);
    
    // add
    else if(expression.startsWith("(a"))
      return evaluate(tokens.get(0), map) + evaluate(tokens.get(1), map);
    
    // let
    else {
      // Translate all variable(s) into the map and pass into next expression to evaluate
      for(int i = 0; i < tokens.size()-2; i = i+2)
        map.put(tokens.get(i), evaluate(tokens.get(i+1), map));
      
      return evaluate(tokens.get(tokens.size()-1), map);
    }
  }
  
  private List<String> parse(String expression) {
    // Break up expression into var1, val1, var2, value2, next expression
    List<String> tokens = new ArrayList<>();
    int count = 0;
    StringBuilder sb = new StringBuilder();
    for(char ch : expression.toCharArray()) {
      if(ch == '(') count++;
      if(ch == ')') count--;
      
      if(count == 0 && ch == ' ') {
        tokens.add(sb.toString());
        sb = new StringBuilder();
      }
      else
        sb.append(ch);
    }
    tokens.add(sb.toString());
    
    return tokens;
  }
}
