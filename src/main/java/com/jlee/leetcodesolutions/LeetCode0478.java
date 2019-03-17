package com.jlee.leetcodesolutions;

import java.util.Random;

public class LeetCode0478 {
  /*
   * Given the radius and x-y positions of the center of a circle, write a
   * function randPoint which generates a uniform random point in the circle.
   * 
   * Note:
   * 1. input and output values are in floating-point.
   * 2. radius and x-y position of the center of the circle is passed into the
   * class constructor.
   * 3. a point on the circumference of the circle is considered to be in the
   * circle.
   * 4. randPoint returns a size 2 array containing x-position and y-position of
   * the random point, in that order.
   * 
   * https://leetcode.com/problems/generate-random-point-in-a-circle/description/
   */
  private double radius, x_center, y_center;
  private Random rand;
  
  public LeetCode0478(double radius, double x_center, double y_center) {
    this.radius = radius;
    this.x_center = x_center;
    this.y_center = y_center;
    rand = new Random();
  }
  
  public double[] randPoint() {
    // Choose random angle
    // Choose random radius
    double angle = 2 * Math.PI * rand.nextDouble();
    double r = radius * Math.sqrt(rand.nextDouble());
    
    // Calculate it's x and y coordinates on 0,0 center
    // x = r*cos(0);
    // y = r*sin(0)
    double x = r * Math.cos(angle);
    double y = r * Math.sin(angle);
    // Add the x and y to the relative center of the circle
    return new double[] { x_center + x, y_center + y };
  }
}
