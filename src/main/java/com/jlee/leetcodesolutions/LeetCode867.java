package com.jlee.leetcodesolutions;

public class LeetCode867 {
  /*
   * Find the smallest prime palindrome greater than or equal to N.
   * 
   * Recall that a number is prime if it's only divisors are 1 and itself, and it
   * is greater than 1.
   * 
   * For example, 2,3,5,7,11 and 13 are primes.
   * 
   * Recall that a number is a palindrome if it reads the same from left to right
   * as it does from right to left.
   * 
   * For example, 12321 is a palindrome.
   * 
   * Note:
   * 1. 1 <= N <= 10^8
   * 2. The answer is guaranteed to exist and be less than 2 * 10^8.
   */
  public int primePalindrome(int N) {
    // 10^8 -> 100 000 000 
    // Attempt every odd digits palindrome, check to see if it is a prime number
    // Every even digit palindrome is divisible by 11 (except 11)
    if(N > 7 && N <= 11)
      return 11;
    for(int i = 1; i < 20000; i++) {
      String front = Integer.toString(i);
      String back = new StringBuilder(front).reverse().substring(1);
      int num = Integer.valueOf(front+back);
      if(num >= N && isPrime(num))
        return num;
    }
    return -1;
  }
  
  private boolean isPrime(int num) {
    // 1 is not a prime number
    // 2 is a prime number
    // If the number is even (means it's divisble by 2) cannot be a prime number
    if(num < 2 || num % 2 == 0)
      return num == 2;
    
    // Since any even numbers has been checked above, we check all odds
    for(int i = 3; i*i <= num; i += 2) {
      if(num % i == 0)
        return false;
    }
    return true;
  }
}
