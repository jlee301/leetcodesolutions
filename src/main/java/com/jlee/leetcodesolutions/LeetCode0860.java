package com.jlee.leetcodesolutions;

public class LeetCode0860 {
  /*
   * At a lemonade stand, each lemonade costs $5.
   * 
   * Customers are standing in a queue to buy from you, and order one at a time
   * (in the order specified by bills).
   * 
   * Each customer will only buy one lemonade and pay with either a $5, $10, or
   * $20 bill. You must provide the correct change to each customer, so that the
   * net transaction is that the customer pays $5.
   * 
   * Note that you don't have any change in hand at first.
   * 
   * Return true if and only if you can provide every customer with correct
   * change.
   * 
   * https://leetcode.com/contest/weekly-contest-91/problems/lemonade-change/
   */
  public boolean lemonadeChange(int[] bills) {
    int net = 0;
    int[] register = new int[21];
    for(int payment : bills) {
      int change = payment - 5;
      // I do not have enough cash to give customer proper change
      if(net < change) 
        return false;
      
      // Simulate adding the payment into the register
      else {
        if(payment == 20)
          register[20]++;
        else if(payment == 10)
          register[10]++;
        else
          register[5]++;
        
        // Do I have the correct denominations to give change DFS
        if(!dfs(register, change))
          return false;
        net += payment - change;
      }
    }
    return true;
  }
  
  private boolean dfs(int[] register, int change) {
    if(change == 0)
      return true;
    
    for(int i = register.length-1; i >= 5; i -= 5) {
      while(register[i] != 0 && change - i >= 0) {
        // System.out.println("change: " + change + " i: " + i);
        register[i]--;
        return dfs(register, change - i);
      }
    }
    return false;
  }
}
