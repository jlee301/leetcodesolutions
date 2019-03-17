package com.jlee.leetcodesolutions;

import java.util.ArrayList;
import java.util.List;

public class LeetCode0412 {
  /*
   * Write a program that outputs the string representation of numbers from 1 to
   * n.
   * 
   * But for multiples of three it should output “Fizz” instead of the number and
   * for the multiples of five output “Buzz”. For numbers which are multiples of
   * both three and five output “FizzBuzz”.
   * 
   * https://leetcode.com/problems/fizz-buzz/description/
   */
  public List<String> fizzBuzz(int n) {
    List<String> result = new ArrayList<>();
    for(int i = 1; i <= n; i++) {
      String str = "";
      if(i % 5 == 0)
        str = "Buzz" + str;
      
      if(i % 3 == 0)
        str = "Fizz" + str;
      
      result.add((str.isEmpty() ? str+i : str));
    }
    return result;
  }
}
