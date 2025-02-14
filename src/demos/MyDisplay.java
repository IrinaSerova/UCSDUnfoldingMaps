package demos;

import processing.core.PApplet;

/** 
 * A class to illustrate some use of the PApplet class
 * Used in module 3 of the UC San Diego MOOC Object Oriented Programming in Java
 * 
 * @author UC San Diego Intermediate Software Development MOOC team
 * 
 *
 */
public class MyDisplay extends PApplet {

	public void setup()
	{
		size(400, 400);
		background(200, 200, 200);
		
	}
	
	public void draw()
	{
		fill(0, 0, 255);
		ellipse(200, 200, 390, 390);
		fill(255, 255, 255);
		ellipse(120, 130, 60, 70);
		ellipse(280, 130, 60, 70);
		fill(0, 0, 0);
		ellipse(120, 130, 20, 20);
		ellipse(280, 130, 20, 20);
		
//		noFill();
		strokeWeight(4);
		fill(255, 0, 0);
		arc(200, 280, 75, 75, 0, PI);
	}
	
}
