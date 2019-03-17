package com.jlee.leetcodesolutions;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class LeetCode0937 {
  /*
   * https://leetcode.com/contest/weekly-contest-110/problems/reorder-log-files/
   */
  public String[] reorderLogFiles(String[] logs) {
    if(logs == null || logs.length <= 1)
      return logs;
    
    String[] result = new String[logs.length];
    // Separate letter-logs and digit-logs
    Queue<String> digits = new LinkedList<>();
    PriorityQueue<String[]> letters = new PriorityQueue<>(new LetterComparator());
    
    for(String str : logs) {
      // Find index of first space
      int index = str.indexOf(" ");
      String id = str.substring(0, index);
      String data = str.substring(index+1);
      
      if(Character.isDigit(data.charAt(0)))
        digits.offer(str);
      else
        letters.offer(new String[] {id, data});
    }
    
    int i = 0;
    // Populate letters first
    while(!letters.isEmpty()) {
      String[] data = letters.poll();
      result[i++] = data[0] + " " + data[1];
    }
    // Populate digits second
    while(!digits.isEmpty())
      result[i++] = digits.poll();
    
    return result;
  }
  
  private class LetterComparator implements Comparator<String[]> {
    @Override
    public int compare(String[] a, String[] b) {
      // Lexi sort by second value (a[1]), if they are the same, lexi sort by first
      // value (a[0])
      int cmp = a[1].compareTo(b[1]);
      return cmp == 0 ? a[0].compareTo(b[0]) : cmp;
    }
  }
}
