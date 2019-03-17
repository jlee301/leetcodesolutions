package com.jlee.leetcodesolutions;

import java.util.ArrayList;
import java.util.List;

public class LeetCode0638 {
  /*
   * In LeetCode Store, there are some kinds of items to sell. Each item has a
   * price.
   * 
   * However, there are some special offers, and a special offer consists of one
   * or more different kinds of items with a sale price.
   * 
   * You are given the each item's price, a set of special offers, and the number
   * we need to buy for each item. The job is to output the lowest price you have
   * to pay for exactly certain items as given, where you could make optimal use
   * of the special offers.
   * 
   * Each special offer is represented in the form of an array, the last number
   * represents the price you need to pay for this special offer, other numbers
   * represents how many specific items you could get if you buy this offer.
   * 
   * You could use any of special offers as many times as you want.
   * 
   * Note:
   * 1. There are at most 6 kinds of items, 100 special offers.
   * 2. For each item, you need to buy at most 6 of them.
   * 3. You are not allowed to buy more items than you want, even if that would
   * lower the overall price.
   */
  public int shoppingOffers(List<Integer> price, List<List<Integer>> special, List<Integer> needs) {
    return shoppingOffers(price, special, needs, 0);
  }
  
  private int shoppingOffers(List<Integer> price, List<List<Integer>> special, List<Integer> needs, int pos) {
    // Use direct buying price as starting min
    int min = directBuy(price, needs);
    
    // Now check if we can use specials to save money
    for(int i = pos; i < special.size(); i++) {
      List<Integer> offer = special.get(i);
      
      // Generate a new needs list if the offer can be used
      List<Integer> newNeeds = new ArrayList<>();
      for(int j = 0; j < offer.size()-1; j++) {
        // The special cannot be used if we buy more than we need
        if(needs.get(j) < offer.get(j)) {
          newNeeds = null;
          break;
        }
        newNeeds.add(needs.get(j) - offer.get(j));
      }
      if(newNeeds != null)
        min = Math.min(min, offer.get(offer.size()-1) + shoppingOffers(price, special, newNeeds, i));
    }
    return min;
  }
  
  private int directBuy(List<Integer> price, List<Integer> needs) {
    // The cost of buying what is remaining with no specials
    int sum = 0;
    for(int i = 0; i < price.size(); i++)
      sum += price.get(i) * needs.get(i);
    return sum;
  }
}
