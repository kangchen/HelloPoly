package com.kcorner;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Polygon;


public class DrawPoly extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int side;
	private int lineLength;
	private Color color;
	private Dimension dimension = new Dimension();
	
	public DrawPoly(Dimension newDimension) {
		dimension.width  = newDimension.width;
		dimension.height = newDimension.height;
		lineLength = 75;
		color = Color.white;
	}
	
	public DrawPoly(Color newColor){
		init();
		color = newColor;
	}

	private void init() {
		dimension.width  = 256;
		dimension.height = 210;
		lineLength = 75;
	}
	
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		Polygon p = new Polygon();
		Graphics q = g;
		
		for (int i=0; i<side; i++) {
			p.addPoint((int) (dimension.width/2  + lineLength * Math.cos((i+0.25) * 2 *Math.PI / side)), 
					   (int) (dimension.height/2 + lineLength * Math.sin((i+0.25) * 2 *Math.PI / side)));
		}
		
		// create s shadow
		g.drawPolygon(p);
		g.setColor(Color.gray);
		g.fillPolygon(p);

		q.translate(dimension.width/2-133, dimension.height/2-105);
		q.setColor(color);
		q.fillPolygon(p);
		
	}
	
	public void setColor(Color newColor){
		color = newColor;
	}

	
	public void setSide(int newSide) {
		
		if (newSide <= 2 || newSide > 12) {
			side = 3;
		}
		else {
			side = newSide;
		}
	}
	
	public int getSide() {
		return side;
	}
	
	public void setDimension(Dimension newDimension) {
		
		if(newDimension.width <= 0 || newDimension.height <= 0) {
			dimension.width  = 100;
			dimension.height = 100;
		}
		else {
			dimension = newDimension;
		}
	}
	
	public void setLineLength(int newLineLength) {
		if (newLineLength < 10 || newLineLength > 100){
			lineLength = 75;
		}
		else {
			lineLength = newLineLength;
		}
	}
}

