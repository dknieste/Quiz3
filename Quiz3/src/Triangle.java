/*
 * Author: Diana Knieste
 * Date: March 10, 2015
 * Class: CISC181
 * Assignment: Quiz 3
 */

import java.lang.Math;

public class Triangle extends GeometricObject {

	double side1;
	double side2;
	double side3;

	// No-arg constructor
	public Triangle() {
		this.side1 = 1;
		this.side2 = 1;
		this.side3 = 1;
	}

	// Constructor with 3 arguments
	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	// Accessors for the sides
	public double getSide1() {
		return this.side1;
	}

	public double getSide2() {
		return this.side2;
	}

	public double getSide3() {
		return this.side3;
	}

	// Method for area using Heron's equation
	@Override
	public double getArea() {
		double halfOfPerimeter = this.getPerimeter() / 2;
		double area = Math.sqrt(halfOfPerimeter * (halfOfPerimeter - side1)
				* (halfOfPerimeter - side2) * (halfOfPerimeter - side3));
		return area;
	}

	// Method for finding perimeter
	@Override
	public double getPerimeter() {
		double perimeter = side1 + side2 + side3;
		return perimeter;
	}

	// Creates string description of triangle
	public String toString() {
		return ("The lengths of the sides of the triangle are: "
				+ getSide1() + ", " + getSide2() + ", "
				+ getSide3() + "\nThis results in a perimeter of: "
				+ getPerimeter() + "\nAnd an area of: " + getArea());
	}

	/*
	 * public static void main(String[] args){ Triangle tri = new Triangle();
	 * String string = tri.toString(); System.out.println(string); }
	 */
}
