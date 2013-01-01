package com.kcorner.polygon;

import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.text.*;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.TableColumn;


public class PolygonView extends JFrame{

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JLabel polygonLbl = null;
	private JLabel polygonName = null;
	private JLabel degreesLbl = null;
	private JLabel angleInDegrees = null;
	private JLabel radiansLbl = null;
	private JLabel angleInRadians = null;
	private JLabel polygonSidesLbl = null;
	private JLabel numberOfSides = null;
	private JSlider mySlider = null;
	private Polygons myPoly = new Polygons();  
	private DrawPoly drawPoly = new DrawPoly(Color.green);  
	private JSlider lineWidthSlider = null;
	private DecimalFormat df = new DecimalFormat("#.#####");
	private JTable colorPickerTable = null;
	private JPanel drawPanel = null;
 
	private JSlider getMySlider() {
		if (mySlider == null) {
			mySlider = new JSlider();
			mySlider.setBounds(12, 318, 133, 30);
			mySlider.setMinimum(3);
			mySlider.setValue(8);
			mySlider.setMaximum(12);
			mySlider.setPreferredSize(new Dimension(140, 30));
			mySlider.setBackground(new Color(153, 188, 218));
			mySlider.addChangeListener(new javax.swing.event.ChangeListener() {
				public void stateChanged(javax.swing.event.ChangeEvent e) {
					drawPoly.setSide(mySlider.getValue());
					myPoly.setNumberOfSides(mySlider.getValue());
					update();
					drawPoly.repaint();
				}
			});
		}
		return mySlider;
	}

	/**
	 * This is the default constructor
	 */
	public PolygonView() {
		super();
		initialize();
		myPoly.setNumberOfSides(mySlider.getValue());
		drawPoly.setSide(mySlider.getValue());
		drawPoly.setLineLength(75);
		update();
		drawPoly.repaint();
	}

	/**
	 * This method initializes this
	 * 
	 */
	private void initialize() {
		this.setSize(300, 387);
		this.setContentPane(getJContentPane());
		this.setTitle("My Polygon Application");
		drawPoly.setPreferredSize(new Dimension(256, 210));
		drawPoly.setSize(new Dimension(275, 213));
		drawPoly.setBackground(new Color(153, 188, 218));
		this.setResizable(false);
	}
	
	private void update() {
		numberOfSides.setText(Integer.toString(myPoly.getNumberOfSides()));
		angleInDegrees.setText(Double.toString(myPoly.getAngleInDegrees()));
		angleInRadians.setText(df.format(myPoly.getAngleInRadians()));
		polygonName.setText(myPoly.getPolygonName());
		
	}
	
	private JPanel getDrawPanel() {
		if (drawPanel == null) {
			drawPanel = new JPanel();
			drawPanel.setBounds(31, 101, 229, 208);
			drawPanel.setBackground(new Color(153, 188, 218));
		}
		return drawPanel;
	}
	
	private void setPolygonColor(int color) {
		switch (color) {
			case 0: drawPoly.setColor(Color.white); break;
			case 1: drawPoly.setColor(Color.blue); break;
			case 2: drawPoly.setColor(Color.red); break;
			case 3: drawPoly.setColor(Color.cyan); break;
			case 4: drawPoly.setColor(Color.green); break;
			case 5: drawPoly.setColor(Color.yellow); break;
			case 6: drawPoly.setColor(Color.orange); break;
			case 7: drawPoly.setColor(Color.pink); break;
			case 8: drawPoly.setColor(Color.magenta); break;
		}
		drawPoly.repaint();
	}

	/**
	 * This method initializes jContentPane
	 * 
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			numberOfSides = new JLabel();
			numberOfSides.setBounds(135, 67, 66, 16);
			numberOfSides.setText("numberOfSides");
			numberOfSides.setPreferredSize(new Dimension(125, 16));
			polygonSidesLbl = new JLabel();
			polygonSidesLbl.setBounds(5, 67, 125, 16);
			polygonSidesLbl.setText("Number of Sides :");
			polygonSidesLbl.setHorizontalAlignment(SwingConstants.RIGHT);
			polygonSidesLbl.setPreferredSize(new Dimension(125, 16));
			angleInRadians = new JLabel();
			angleInRadians.setBounds(135, 47, 125, 16);
			angleInRadians.setText("angleInRadians");
			angleInRadians.setPreferredSize(new Dimension(125, 16));
			radiansLbl = new JLabel();
			radiansLbl.setBounds(5, 47, 125, 16);
			radiansLbl.setText("Angle in Radians :");
			radiansLbl.setHorizontalAlignment(SwingConstants.RIGHT);
			radiansLbl.setPreferredSize(new Dimension(125, 16));
			angleInDegrees = new JLabel();
			angleInDegrees.setBounds(135, 26, 125, 16);
			angleInDegrees.setText("angleInDegrees");
			angleInDegrees.setPreferredSize(new Dimension(125, 16));
			degreesLbl = new JLabel();
			degreesLbl.setBounds(5, 26, 125, 16);
			degreesLbl.setText("Angle in Degrees :");
			degreesLbl.setHorizontalAlignment(SwingConstants.RIGHT);
			degreesLbl.setPreferredSize(new Dimension(125, 16));
			polygonName = new JLabel();
			polygonName.setBounds(135, 5, 125, 16);
			polygonName.setText("polygonName");
			polygonName.setPreferredSize(new Dimension(125, 16));
			polygonLbl = new JLabel();
			polygonLbl.setBounds(5, 5, 125, 16);
			polygonLbl.setText("Polygon Name :");
			polygonLbl.setPreferredSize(new Dimension(125, 16));
			polygonLbl.setHorizontalAlignment(SwingConstants.RIGHT);
			polygonLbl.setMaximumSize(new Dimension(38, 16));
			jContentPane = new JPanel();
			jContentPane.setSize(new Dimension(280, 300));
			jContentPane.setBackground(new Color(153, 188, 218));
			jContentPane.setPreferredSize(new Dimension(585, 210));
			jContentPane.setLayout(null);
			jContentPane.add(polygonLbl);
			jContentPane.add(polygonName);
			jContentPane.add(degreesLbl);
			jContentPane.add(angleInDegrees);
			jContentPane.add(radiansLbl);
			jContentPane.add(angleInRadians);
			jContentPane.add(polygonSidesLbl);
			jContentPane.add(numberOfSides);
			jContentPane.add(getColorPickerTable());
			jContentPane.add(getMySlider());
			jContentPane.add(getLineWidthSlider());	
			jContentPane.add( getDrawPanel(), null);
			drawPanel.add(drawPoly);
		}
		return jContentPane;
	}


	/**
	 * This method initializes lineWidthSlider	
	 * 	
	 */
	private JSlider getLineWidthSlider() {
		if (lineWidthSlider == null) {
			lineWidthSlider = new JSlider();
			lineWidthSlider.setBounds(159, 318, 125, 30);
			lineWidthSlider.setPreferredSize(new Dimension(125, 30));
			lineWidthSlider.setBackground(new Color(153, 188, 218));
			lineWidthSlider.setValue(75);
			lineWidthSlider.setMinimum(50);
			lineWidthSlider.addChangeListener(new javax.swing.event.ChangeListener() {
				public void stateChanged(javax.swing.event.ChangeEvent e) {
					drawPoly.setLineLength(lineWidthSlider.getValue());
					drawPoly.repaint();
				}
			});
		}
		return lineWidthSlider;
	}


	/**
	 * This method initializes colorPickerTable	
	 * 	
	 * @return javax.swing.JTable	
	 */
	private JTable getColorPickerTable() {
		if (colorPickerTable == null) {
			colorPickerTable = new JTable(9,1);
			colorPickerTable.setBounds(269, 128, 15, 144);
			colorPickerTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			colorPickerTable.setShowHorizontalLines(true);
			colorPickerTable.setShowVerticalLines(true);
			colorPickerTable.setPreferredSize(new Dimension(15, 144));
			colorPickerTable.setRowHeight(16);
			setColorPickerTable();
			colorPickerTable.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mousePressed(java.awt.event.MouseEvent e) {
//					System.out.println("mousePressed()" + colorPickerTable.getSelectedRow()); // TODO Auto-generated Event stub mousePressed()				
					setPolygonColor(colorPickerTable.getSelectedRow());
				}
			});
		}
		return colorPickerTable;
	}

	private void setColorPickerTable() {
		ColorTableRenderer render = new ColorTableRenderer();
		TableColumn tc = colorPickerTable.getColumnModel().getColumn(0);
//		colorPickerTable.setRowSelectionInterval(0, 0);
//	    render.setBackground(Color.red);
	    tc.setCellRenderer(render);		
	}
}  //  @jve:decl-index=0:visual-constraint="316,168"  