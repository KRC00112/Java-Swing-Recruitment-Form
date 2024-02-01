package form;

import javax.swing.JFrame;

public class Frame extends JFrame {
	
	
	Details details=new Details();
	
	Frame(){
		this.setTitle("Recruitment Form");
		this.setSize(1330,768);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.add(details.mPanel);
		
		this.setVisible(true);
		
	
		
		
		
	}
	
	
	
	
	
	

}
