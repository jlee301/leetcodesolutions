package com.jlee.leetcodesolutions;

import java.util.TreeMap;

public class LeetCode838 {
  /*
   * There are N dominoes in a line, and we place each domino vertically upright.
   * 
   * In the beginning, we simultaneously push some of the dominoes either to the
   * left or to the right.
   * 
   * After each second, each domino that is falling to the left pushes the
   * adjacent domino on the left.
   * 
   * Similarly, the dominoes falling to the right push their adjacent dominoes
   * standing on the right.
   * 
   * When a vertical domino has dominoes falling on it from both sides, it stays
   * still due to the balance of the forces.
   * 
   * For the purposes of this question, we will consider that a falling domino
   * expends no additional force to a falling or already fallen domino.
   * 
   * Given a string "S" representing the initial state. S[i] = 'L', if the i-th
   * domino has been pushed to the left; S[i] = 'R', if the i-th domino has been
   * pushed to the right; S[i] = '.', if the i-th domino has not been pushed.
   * 
   * Return a string representing the final state.
   * 
   * Note:
   * 1. 0 <= N <= 10^5
   * 2. String dominoes contains only 'L', 'R' and '.'
   * 
   * https://leetcode.com/problems/push-dominoes/description/
   */
  public String pushDominoes(String dominoes) {
    String curr = dominoes;
    
    // Simulate dominoes fall
    boolean sim = true;
    while(sim) {
      String next = curr;
      // Replace any stalemates with X and continue to sim
      next = next.replaceAll("R\\.L", "X");
      next = next.replaceAll("\\.L", "LL").replaceAll("R\\.", "RR");
      if(curr.equals(next))
        sim = false;
      curr = next;
    }
    // Switch the X's back
    return curr.replaceAll("X", "R.L");
  }
  
  public String pushDominoesToo(String dominoes) {
    TreeMap<Integer,Character> map = new TreeMap<>();
    for(int i = 0; i < dominoes.length(); i++) {
      char ch = dominoes.charAt(i);
      if(ch != '.')
        map.put(i, ch);
    }
    
    StringBuilder sb = new StringBuilder();
    for(int i = 0; i < dominoes.length(); i++) {
      char ch = dominoes.charAt(i);
      if(ch != '.')
        sb.append(ch);
      else {
        Integer floor = map.floorKey(i);
        Integer ceil = map.ceilingKey(i);
        if(floor == null && ceil == null)
          sb.append('.');
        
        else if(floor == null) {
          if(map.get(ceil) == 'L')
            sb.append('L');
          else
            sb.append('.');
        }
        
        else if(ceil == null) {
          if(map.get(floor) == 'R')
            sb.append('R');
          else
            sb.append('.');
        }
        
        else { // floor != null && ceil != null
          char ceilCh = map.get(ceil);
          char floorCh = map.get(floor);
          int ceilDist = ceil - i;
          int floorDist = i - floor;
          if(floorCh == 'R' && ceilCh == 'L') {
            if(ceilDist > floorDist)
              sb.append('R');
            else if(ceilDist < floorDist)
              sb.append('L');
            else
              sb.append('.');
          }
          else if(floorCh == 'R')
            sb.append('R');
          else if(ceilCh == 'L')
            sb.append('L');
          else
            sb.append('.');
        }
      }
    }
    return sb.toString();
  }
}
