package studio7;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Rectangle {

	private double length;
	private double width;
	
	public Rectangle (double l, double w) {
		length = l;
		width = w;
	}
	
	public void area() {
		double area = length * width;
		System.out.println(area);
	}
	
	public void perimeter() {
		double perimeter = length * 2 + width * 2;
		System.out.println(perimeter);
	}
	
	public void square() {
		boolean square = false;
		if (length == width) {
			square = true;
		}
		System.out.println(square);
	}
	
	public void draw () {
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.rectangle(length,0.5,length/2.0,width/2.0);
		
	}
	
	public void compare(double area) {
		if (length * width < area) {
			System.out.println("first rectangle is smaller than the second rectangle.");
		}
		else if (length * width > area) {
			System.out.println("first rectangle is larger than the second rectangle.");
		}
		else{
			System.out.println("the two rectangles are the same size.");
		}
	}
	
	public static void main (String[]args) {
		Rectangle one = new Rectangle(0.5,0.2);
		Rectangle two = new Rectangle (0.1,0.4);
		one.area();
		one.perimeter();
		one.draw();
		one.square();
		one.compare(1);
		
	}
	

}
