package com.kcorner;

public class Polygons {

	private int numberOfSides = 0;
	private double angleInDegrees = 0.0;
	private double angleInRadians = 0.0;
	private String polyName;
	private final int MAX=12;
	private final int MIN=3;
	private int minNumberOfSides = 0;
	private int maxNumberOfSides = 0;
	
	public Polygons() {
		numberOfSides = 5;
		minNumberOfSides = MIN;
		maxNumberOfSides = MAX;
		polyName = getPolygonName();
	}
	
	public Polygons(int _numberOfSides, int _minNumberOfSides, int _maxNumberOfSides){
		numberOfSides = _numberOfSides;
		minNumberOfSides = _minNumberOfSides;
		maxNumberOfSides = _maxNumberOfSides;
		polyName = getPolygonName();
	}
	
	public void setNumberOfSides(int _sides) {
		numberOfSides = _sides;
	}
	
	public int getNumberOfSides() {
		return numberOfSides;
	}
	
	public int getMinNumberOfSides() {
		return minNumberOfSides;
	}
	
	public void setMinNumberOfSides(int _minNumberOfSides) {
		minNumberOfSides = _minNumberOfSides;
	}
	
	public int getMaxNumberOfSides() {
		return maxNumberOfSides;
	}
	
	public void setMaxNumberOfSides(int _maxNumberOfSides){
		maxNumberOfSides = _maxNumberOfSides;
	}
	
	public String getPolygonName() {
		
		switch(numberOfSides) {
		case 3:
			polyName = "Triangle";
			break;
		case 4:
			polyName = "Square";
			break;
		case 5:
			polyName = "Pentagon";
			break;
		case 6:
			polyName = "Hexagon";
			break;
		case 7:
			polyName = "Dheptagon";
			break;
		case 8:
			polyName = "Octagon";
			break;
		case 9:
			polyName = "Enneagon";
			break;
		case 10:
			polyName = "Decagon";
			break;
		case 11:
			polyName = "Hendecagon";
			break;
		case 12:
			polyName = "Dodecagon";
			break;
		default:
			polyName = "";
			break;
			
		}
		return polyName;
	}
	
	public double getAngleInDegrees() {
		
		angleInDegrees = (180 * (numberOfSides - 2))/numberOfSides;
		return angleInDegrees;
	}
	
	public double getAngleInRadians() {
		
		angleInRadians = getAngleInDegrees() * (Math.PI/180);
		return angleInRadians;
	}
	
//	public void drawPolygon() {
//
//	    Polygon p = new Polygon();
//	    for (int i = 0; i < 5; i++) {
//	      p.addPoint((int) (100 + 50 * Math.cos(i * 2 * Math.PI / 5)),
//	          (int) (100 + 50 * Math.sin(i * 2 * Math.PI / 5)));
//	    }
//	}
	
	public String toString() {
		String str;
		str = "This is a/an "+polyName+" with angle of "+getAngleInDegrees()+" degrees.";
		return str;
	}

}
