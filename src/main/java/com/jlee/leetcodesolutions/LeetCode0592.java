package com.jlee.leetcodesolutions;

import java.util.ArrayList;
import java.util.List;

public class LeetCode0592 {
  /*
   * Given a string representing an expression of fraction addition and
   * subtraction, you need to return the calculation result in string format. The
   * final result should be irreducible fraction. If your final result is an
   * integer, say 2, you need to change it to the format of fraction that has
   * denominator 1. So in this case, 2 should be converted to 2/1.
   * 
   * https://leetcode.com/problems/fraction-addition-and-subtraction/description/
   */
  public String fractionAddition(String expression) {
    if(expression == null || expression.isEmpty())
      return expression;
    
    // Split up and store signs, numerators, denominators
    List<Character> signs = new ArrayList<>();
    List<Integer> numerators = new ArrayList<>();
    List<Integer> denominators = new ArrayList<>();
    
    // 1. Signs
    for(int i = 0; i < expression.length(); i++) {
      char ch = expression.charAt(i);
      if(ch == '+' || ch == '-')
        signs.add(ch);
    }
    // If first character is a positive fraction
    if(expression.charAt(0) != '-')
      signs.add(0, '+');
    // 2. Numerators and Denominators
    for(String sub : expression.split("\\+|-")) {
      if(sub.isEmpty()) continue;
      String[] fraction = sub.split("/");
      numerators.add(Integer.valueOf(fraction[0]));
      denominators.add(Integer.valueOf(fraction[1]));
    }
    
    // 3. Find the least common denominator amongst all denominators
    int lcd = 1;
    for(int x : denominators)
      lcd = lcd(lcd, x);
    
    // 4. Sum all the numerators. lcd / denominators.get(i) gives multiplier for numerators.get(i)
    int result = 0;
    int len = signs.size();
    for(int i = 0; i < len; i++) {
      if(signs.get(i) == '+')
        result += lcd / denominators.get(i) * numerators.get(i);
      else
        result -= lcd / denominators.get(i) * numerators.get(i);
    }
    
    // 5. Make sure result is irreducible
    int gcd = gcd(Math.abs(result), lcd);
    return (result/gcd) + "/" + (lcd/gcd);
  }
  
  private int lcd(int a, int b) {
    return a*b / gcd(a,b);
  }
  
  private int gcd(int a, int b) {
    while(b != 0) {
      int temp = b;
      b = a % b;
      a = temp;
    }
    return a;
  }
}
