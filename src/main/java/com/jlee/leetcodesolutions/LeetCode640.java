package com.jlee.leetcodesolutions;

import java.util.ArrayList;
import java.util.List;

public class LeetCode640 {
  /*
   * Solve a given equation and return the value of x in the form of string
   * "x=#value". The equation contains only '+', '-' operation, the variable x and
   * its coefficient.
   * 
   * If there is no solution for the equation, return "No solution".
   * 
   * If there are infinite solutions for the equation, return
   * "Infinite solutions".
   * 
   * If there is exactly one solution for the equation, we ensure that the value
   * of x is an integer.
   * 
   * https://leetcode.com/problems/solve-the-equation/description/
   */
  public String solveEquation(String equation) {
    if(equation == null || equation.isEmpty())
      return "No solution";
    
    // Split left and right sides using '='
    String[] data = equation.split("=");
    
    // Obtain the sign of each x variable and integer
    List<Character> leftSigns = findSigns(data[0]);
    List<Character> rightSigns = findSigns(data[1]);
    
    // Now get the total of x and integer from left and right
    int[] left = findData(data[0], leftSigns);
    int[] right = findData(data[1], rightSigns);
    
    // Move x variable data to left, move integer data to right
    int[] total = new int[2];
    total[0] = left[0] - right[0];
    total[1] = right[1] - left[1];
    // Get rid of any multiples of x
    if(total[0] != 0) {
      total[1] /= total[0];
      total[0] /= total[0];
    }

    if(total[0] == 0 && total[1] == 0)
      return "Infinite solutions";
    else if(total[0] == 0)
      return "No solution";
    else return "x=" + total[1];
  }
  
  private List<Character> findSigns(String eq) {
    List<Character> signs = new ArrayList<>();
    if(eq.charAt(0) != '-')
      signs.add('+');
    for(int i = 0; i < eq.length(); i++) {
      char ch = eq.charAt(i);
      if(ch == '+' || ch == '-')
        signs.add(ch);
    }
    return signs;
  }
  
  private int[] findData(String equation, List<Character> signs) {
    // Chopping off leading sign to avoid empty results in sign split
    if(equation.charAt(0) == '-')
      equation = equation.substring(1);
    String[] eqData = equation.split("-|\\+");

    // data[0] = x variable sum
    // data[1] = integer sum
    int[] data = new int[2];
    for(int i = 0; i < eqData.length; i++) {
      if(eqData[i].indexOf("x") != -1) {
        // Sum x variable
        String[] xData = eqData[i].split("x");
        if(xData.length == 0) {
          // If it is just x with no multiples
          if(signs.get(i) == '+')
            data[0]++;
          else
            data[0]--;
        } else {
          // Thre is multiples of x
          if(signs.get(i) == '+')
            data[0] += Integer.valueOf(xData[0]);
          else
            data[0] -= Integer.valueOf(xData[0]);
        }
      } else {
        // Sum integers
        if(signs.get(i) == '+')
          data[1] += Integer.valueOf(eqData[i]);
        else
          data[1] -= Integer.valueOf(eqData[i]);
      }
    }
    return data;
  }
}
