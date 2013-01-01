package com.kcorner;

import javax.swing.JFrame;
import javax.swing.UIManager;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;


public class PolyMainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 
            EventQueue.invokeLater(new Runnable() {
            	public void run() {
            		try {
            			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
            			PolygonView myPolygons = new PolygonView();                    
            			Toolkit kit = myPolygons.getToolkit();
            			Dimension d = kit.getScreenSize();
            			myPolygons.setLocation((int) (d.width-myPolygons.getWidth()) / 2, (int) (d.height-myPolygons.getHeight() ) / 2);
				
            			myPolygons.setVisible(true);
            			myPolygons.setResizable(false);
            			myPolygons.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            		} catch(Exception e) {
            			e.printStackTrace();
            		}
            	}
            });
	}

}
