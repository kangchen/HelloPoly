package com.kcorner;
import javax.swing.table.*;
import javax.swing.*;
import java.awt.*;

public class ColorTableRenderer extends DefaultTableCellRenderer 
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	 	
	public ColorTableRenderer() 
	{
	    super(); 
	}
	  	
	public Component getTableCellRendererComponent (JTable table, Object color, boolean isSelected, boolean hasFocus, int row, int column) 
	{
	    Component cell = super.getTableCellRendererComponent(table, color, isSelected, hasFocus, row, column);

	    switch (row) {
	       case 0: cell.setBackground(Color.white); break; 
	       case 1: cell.setBackground(Color.blue); break; 
	       case 2: cell.setBackground(Color.red); break; 
	       case 3: cell.setBackground(Color.cyan); break; 
	       case 4: cell.setBackground(Color.green); break; 
	       case 5: cell.setBackground(Color.yellow); break; 
	       case 6: cell.setBackground(Color.orange); break; 
	       case 7: cell.setBackground(Color.pink); break; 
	       case 8: cell.setBackground(Color.magenta); break; 
	    }	    	 
	    
	    return cell;
	}
	   
}
