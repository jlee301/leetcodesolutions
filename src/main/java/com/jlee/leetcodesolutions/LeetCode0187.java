package com.jlee.leetcodesolutions;

import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;

public class LeetCode0187 {
  /*
   * All DNA is composed of a series of nucleotides abbreviated as A, C, G, and T,
   * for example: "ACGAATTCCG". When studying DNA, it is sometimes useful to
   * identify repeated sequences within the DNA.
   * 
   * Write a function to find all the 10-letter-long sequences (substrings) that
   * occur more than once in a DNA molecule.
   * 
   * For example,
   * Given s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT",
   * Return: ["AAAAACCCCC", "CCCCCAAAAA"].
   * 
   * https://leetcode.com/problems/repeated-dna-sequences/description/
   */
  public List<String> findRepeatedDnaSequences(String s) {
    List<String> result = new ArrayList<>();
    if(s == null)
      return result;
    
    HashSet<String> seen = new HashSet<>();
    for(int i = 0; i+9 < s.length(); i++) {
      // Store every 10 characters into seen set. If it exist already in seen, then we
      // can store into result -- unless it is already in result.
      String temp = s.substring(i, i+10);
      if(seen.contains(temp)) {
        if(!result.contains(temp))
          result.add(temp);
      } else {
        seen.add(temp);
      }
    }
    return result;
  }
}
