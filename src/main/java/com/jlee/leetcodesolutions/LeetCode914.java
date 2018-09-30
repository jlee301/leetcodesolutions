package com.jlee.leetcodesolutions;

public class LeetCode914 {
  /*
   * In a deck of cards, each card has an integer written on it.
   * 
   * Return true if and only if you can choose X >= 2 such that it is possible to
   * split the entire deck into 1 or more groups of cards, where:
   * 1. Each group has exactly X cards.
   * 2. All the cards in each group have the same integer.
   * 
   * https://leetcode.com/contest/weekly-contest-104/problems/x-of-a-kind-in-a-deck-of-cards/
   */
  public boolean hasGroupsSizeX(int[] deck) {
    if(deck == null || deck.length == 0)
      return false;
    
    int[] count = new int[10000];
    for(int card : deck) {
      // Accumulate how many of each card we have
      count[card]++;
    }

    // Find the gcd for all group accumulations
    int gcd = 0;
    for(int cnt : count) {
      if(cnt < 1)
        continue;
      
      // Only be concern of gcd > 1
      gcd = gcd(gcd, cnt);
    }
    return gcd > 1;
  }
  
  private int gcd(int a, int b) {
    while(a != 0) {
      int temp = a;
      a = b % a;
      b = temp;
    }
    return b;
  }
}
