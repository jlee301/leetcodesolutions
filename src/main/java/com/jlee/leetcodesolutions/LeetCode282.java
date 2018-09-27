package com.jlee.leetcodesolutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class LeetCode282 {
  /*
   * Given a string that contains only digits 0-9 and a target value, return all
   * possibilities to add binary operators (not unary) +, -, or * between the
   * digits so they evaluate to the target value.
   * 
   * https://leetcode.com/problems/expression-add-operators/description/
   */
  private int target;
  private List<String> nums;
  private List<String> result;
  private String[] ops;
  private HashMap<Integer,List<String>> mapOps;
  
  public List<String> addOperators(String num, int target) {
    this.target = target;
    nums = new ArrayList<>();
    result = new ArrayList<>();
    ops = new String[] {"+","-","*"};
    mapOps = new HashMap<>();
    mapOps.put(0, new ArrayList<>());
    mapOps.put(1, new ArrayList<>(Arrays.asList(ops)));
    
    if(num == null || num.isEmpty())
      return result;
    
    splitNums(num, 0);
    // System.out.println(result);
    return result;
  }
    
  public void splitNums(String num, int pos) {
    if(pos == num.length()) {
      evaluateTarget();
    }
    
    for(int i = pos+1; i <= num.length(); i++) {
      String next = num.substring(pos, i);
      
      // We cannot have any number more than one digit start with a zero.
      if(next.length() > 1 && next.charAt(0) == '0')
        continue;
      
      // Backtracking numbers
      nums.add(next);
      splitNums(num, i);
      nums.remove(nums.size()-1);
    }
  }
  
  public void evaluateTarget() {
    if(nums.size() == 1 && Long.valueOf(nums.get(0)) == target) {
      result.add(nums.get(0));
      return;
    }
    
    List<String> operators = generateOps(nums.size()-1);
    for(String currOps : operators) {
      // Added the use of stack in order to prioritize the * operator
      Stack<String> stack = new Stack<>();
      stack.add(nums.get(0));
      String str = nums.get(0);
      
      for(int i = 1; i < nums.size(); i++) {
        char nextOp = currOps.charAt(i-1);
        if(nextOp == '+') {
          stack.add("+");
          stack.add(nums.get(i));
          str = str + "+" + nums.get(i);
        }
        else if(nextOp == '-') {
          stack.add("-");
          stack.add(nums.get(i));
          str = str + "-" + nums.get(i);
        }
        else {
          // Prioritizing the * operator
          long prev = Long.valueOf(stack.pop()) * Long.valueOf(nums.get(i));
          stack.add(String.valueOf(prev));
          str = str + "*" + nums.get(i);
        }
      }
      
      // Calculate remaining entries in the stack
      long sum = 0;
      while(!stack.isEmpty()) {
        long n = Long.valueOf(stack.pop());
        // Now pop the operator, if stack is empty, then assume plus
        String op = stack.size() == 0 ? "+" : stack.pop();
        sum = op.equals("+") ? sum + n : sum - n;
      }
      
      if(sum == target)
        result.add(str);      
    }
  }
  
  // Caching the results of ops
  private List<String> generateOps(int n) {
    if(mapOps.containsKey(n))
      return mapOps.get(n);
    
    List<String> levelBefore = generateOps(n-1);
    List<String> currLevel = new ArrayList<>();
    for(String entry : levelBefore) {
      for(String op : ops)
        currLevel.add(entry + op);
    }
    
    mapOps.put(n, currLevel);
    return currLevel;
  }
}
