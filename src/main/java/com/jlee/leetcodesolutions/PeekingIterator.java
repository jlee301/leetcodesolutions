package com.jlee.leetcodesolutions;

import java.util.Iterator;

/*
 * Given an Iterator class interface with methods: next() and hasNext(), design
 * and implement a PeekingIterator that support the peek() operation -- it
 * essentially peek() at the element that will be returned by the next call to
 * next().
 * 
 * Here is an example. Assume that the iterator is initialized to the beginning
 * of the list: [1, 2, 3].
 * 
 * Call next() gets you 1, the first element in the list.
 * 
 * Now you call peek() and it returns 2, the next element. Calling next() after
 * that still return 2.
 * 
 * You call next() the final time and it returns 3, the last element. Calling
 * hasNext() after that should return false.
 */
public class PeekingIterator implements Iterator<Integer> {
  private Integer next = null;
  private Iterator<Integer> iter;
  private boolean atEnd;
  
  public PeekingIterator(Iterator<Integer> iterator) {
    // initialize any member here.
    iter = iterator;
    if(iter.hasNext())
      next = iter.next();
    else
      atEnd = true;
  }

  // Returns the next element in the iteration without advancing the iterator.
  public Integer peek() {
    if(atEnd)
      return null;
    return next;
  }

  // hasNext() and next() should behave the same as in the Iterator interface.
  // Override them if needed.
  @Override
  public Integer next() {
    if(atEnd)
      return null;
    Integer result = next;
    if(iter.hasNext())
      next = iter.next();
    else {
      next = null;
      atEnd = true;
    }
    return result;
  }

  @Override
  public boolean hasNext() {
    return !atEnd;
  }
}
