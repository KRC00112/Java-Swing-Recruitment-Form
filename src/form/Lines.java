package form;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class Lines extends JPanel{
	
	
	
	
	
	
	
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		Graphics2D g2d=(Graphics2D) g;
		
		g2d.setPaint(Color.white);
		g2d.setStroke(new BasicStroke(5));
		g2d.drawLine(0, 0, 550, 0);

		
		
		
		
		
	}
	
	

}
