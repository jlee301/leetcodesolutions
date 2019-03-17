package com.jlee.leetcodesolutions;

public class LeetCode0481 {
  /*
   * A magical string S consists of only '1' and '2' and obeys the following
   * rules:
   * 
   * The string S is magical because concatenating the number of contiguous
   * occurrences of characters '1' and '2' generates the string S itself.
   * 
   * The first few elements of string S is the following: S =
   * "1221121221221121122……"
   * 
   * If we group the consecutive '1's and '2's in S, it will be:
   * 1 22 11 2 1 22 1 22 11 2 11 22 ......
   * 
   * and the occurrences of '1's or '2's in each group are:
   * 1 2 2 1 1 2 1 2 2 1 2 2 ......
   * 
   * You can see that the occurrence sequence above is the S itself.
   * 
   * Given an integer N as input, return the number of '1's in the first N number
   * in the magical string S.
   * 
   * Note: N will not exceed 100,000.
   */
  public int magicalString(int n) {
    if(n <= 0)
      return 0;
    if(n < 4)
      return 1;
    
    // Add additional space in array in case last element(s) to write is two length
    int[] magStr = new int[n+1];
    magStr[0] = 1; magStr[1] = 2; magStr[2] = 2;
    
    int read = 2, write = 3;
    while(write < n) {
      int lastWritten = magStr[write-1];
      // magStr[read] dictates how many times you will write
      // lastWritten dictates what number you write, if 2 --> write 1, if 1 --> write 2
      for(int i = 0; i < magStr[read]; i++) {
        if(lastWritten == 2)
          magStr[write] = 1;
        else
          magStr[write] = 2;
        write++;
      }
      read++;
    }
    
    int result = 0;
    for(int i = 0; i < n; i++) {
      if(magStr[i] == 1)
        result++;
    }
    return result;
  }
}
