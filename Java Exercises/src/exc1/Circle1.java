package exc1;

import java.lang.Math;

 public class Circle1
 {
		private double radius;
	
		 public Circle1()
		 {
		 	radius = 1.0;
		 }
		 
		 public Circle1(double radius)
		 {
		 	
		 }
		 
		 public Circle1(double radius, String c)
		 {
		 	
		 }
		 
		 public double getRadius()
		 {
		 	return radius;
		 }
		 
		 public String getColor()
		 {
		 	return color;
		 }
		 
		 public void setRadius(double radius)
		 {
		 	 
		 }
		 
		 public double getArea()
		 {
		 	return Math.PI * radius * radius;
		 }
		 
		 public double getCircumference()
		 {
		 	return 2 * Math.PI * radius;
		 }
		 
		 public String toString()
		 {
		 	return "Circle[radius = " + radius + "]";
		 }
 
}