package form;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Details implements ActionListener  {
	
	Lines lines1=new Lines();
	Lines lines2=new Lines();
	Lines lines3=new Lines();


	JOptionPane apply=new JOptionPane();
	
	JPanel mPanel=new JPanel();
	JPanel fPanel=new JPanel();
	JPanel iPanel=new JPanel();
	JPanel pPanel=new JPanel();
	JPanel rPanel=new JPanel();
	
	
	
	JButton ubtn;
	JButton abtn;

	
	JLabel name;
	JLabel age;
	JLabel phoneNumber;
	JLabel qualification;
	JLabel address;
	JLabel imageLabel ;
	JLabel singleMultiple;
	JLabel single;
	JLabel multiple;
	JLabel heading;

	
	Font font;
	
	JTextField nameField;
	JTextField ageField;
	JTextField phnoField;
	JTextField qualField;
	JTextArea addrArea;
	
	JRadioButton radio1;
	JRadioButton radio2;

	
	
	

	
	
	Details(){
		
		mPanel.setLayout(null);
		mPanel.setSize(1366,768);
		mPanel.setBackground(new Color(240,24,63));
	
	
		Form();
		form2();
	
	
		
		
	}
	
	
	public void Form() {
		
		heading=new JLabel();
		heading.setText("Recruitment form");		
		font = new Font(font.MONOSPACED, Font.BOLD, 50);
		heading.setFont(font);
		heading.setForeground(Color.white);
		heading.setBounds(20, 10, 500, 90);
		
		lines1.setBounds(20, 80, 550, 2);
		mPanel.add(lines1);
		
		lines2.setBounds(20, 90, 500, 2);
		mPanel.add(lines2);
	
		
		mPanel.add(heading);
		
		
		
		fPanel.setLayout(null);
		fPanel.setBounds(10, 152, 600, 568);
		fPanel.setBackground(new Color(255,216,0));
		fPanel.setBorder(BorderFactory.createLineBorder(Color.black));
		
		
		
		name=new JLabel("Name:");
		name.setBounds(84, 73, 50, 60);
		
		
		nameField=new JTextField();
		nameField.setBounds(130,83, 300, 30);
		nameField.setBorder(BorderFactory.createLineBorder(Color.black));
		fPanel.add(nameField);
		
		
		
		
		
		
		age=new JLabel("Age:");
		age.setBounds(94, 140, 50, 60);
		
		ageField=new JTextField();
		ageField.setBounds(130,151, 50, 30);
		ageField.setBorder(BorderFactory.createLineBorder(Color.black));
		fPanel.add(ageField);
		

		
		
		phoneNumber=new JLabel("Phone Number:");
		phoneNumber.setBounds(32, 205, 100, 60);
		
		phnoField=new JTextField();
		phnoField.setBounds(130,216, 249, 30);
		phnoField.setBorder(BorderFactory.createLineBorder(Color.black));
		fPanel.add(phnoField);
		
		qualification=new JLabel("Qualification:");
		qualification.setBounds(46, 282, 100, 60);
		
		qualField=new JTextField();
		qualField.setBounds(130,294, 250, 30);
		qualField.setBorder(BorderFactory.createLineBorder(Color.black));
		fPanel.add(qualField);
		
		address=new JLabel("Address:");
		address.setBounds(72, 346, 50, 60);
		
		addrArea=new JTextArea();
		addrArea.setBounds(130, 370, 400, 100);
		addrArea.setBorder(BorderFactory.createLineBorder(Color.black));
		fPanel.add(addrArea);
		
		
		
		
		
		
		
		fPanel.add(name);
		fPanel.add(age);
		fPanel.add(phoneNumber);
		fPanel.add(qualification);
		fPanel.add(address);
		mPanel.add(fPanel);
		
		
		
		
		
		
		
		
	}
	
	
	public void form2() {
		
		

		
		iPanel.setLayout(null);
		iPanel.setBounds(620, 20, 680, 700);
        iPanel.setBorder(BorderFactory.createLineBorder(Color.black));
		iPanel.setBackground(new Color(255,216,0));
		
		pPanel.setLayout(null);
		pPanel.setBounds(20, 20, 650, 460);
		pPanel.setBackground(new Color(255,216,0));
		
		rPanel.setLayout(null);
		rPanel.setBounds(20, 500, 650, 190);
		rPanel.setBorder(BorderFactory.createLineBorder(Color.black));
		rPanel.setBackground(new Color(255,243,79));
		
		
		
		imageLabel = new JLabel();
        imageLabel.setBounds(160, 50, 330, 330);
        imageLabel.setBackground(Color.white);
        imageLabel.setBorder(BorderFactory.createLineBorder(Color.black));
        imageLabel.setOpaque(true);
        pPanel.add(imageLabel);
		
		
		
		
//		pic=new JFileChooser();
//		pic.setBounds(30, 50, 500, 800);
		
		ubtn=new JButton("Upload Picture");
		ubtn.setFocusable(false);
		ubtn.addActionListener(this);
		ubtn.setBounds(260, 400, 120, 50);
		
		
		singleMultiple=new JLabel();
		singleMultiple.setText("Applying for single or multiple post: ");
		singleMultiple.setBounds(40, 20, 300, 30);
		rPanel.add(singleMultiple);
		
		single=new JLabel("Single");
		single.setBounds(170, 58, 60, 20);
		rPanel.add(single);
		
		radio1=new JRadioButton();
		radio1.setBounds(220, 60, 20, 20);
		radio1.setBackground(new Color(255,243,79));
		rPanel.add(radio1);
		radio1.addActionListener(this);
		
		multiple=new JLabel("Multiple");
		multiple.setBounds(310, 58, 60, 20);
		rPanel.add(multiple);
		
		
		radio2=new JRadioButton();
		radio2.setBounds(370, 60, 20, 20);
		radio2.setBackground(new Color(255,243,79));
		rPanel.add(radio2);
		radio2.addActionListener(this);
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(radio1);
		bg.add(radio2);
		

		

		abtn=new JButton("apply");
		abtn.setBounds(285, 140, 80, 30);
		abtn.addActionListener(this);
		rPanel.add(abtn);
		
		
		
		
		
		
		
		
		
		
		pPanel.add(ubtn);
		iPanel.add(pPanel);
		iPanel.add(rPanel);
		mPanel.add(iPanel);
		
		
		
		
		
		
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		
		
		
		
		
		
		
		if(e.getSource()==ubtn) {
			
			JFileChooser pic=new JFileChooser();
			pic.setCurrentDirectory(new File("."));
			
			
//			pic.showOpenDialog(null);
			
			int res=pic.showOpenDialog(null);
			
			if(res==JFileChooser.APPROVE_OPTION) {
				
				File selectedFile = pic.getSelectedFile();
                try {
                    // Read and display the selected image
                    imageLabel.setIcon(new ImageIcon(ImageIO.read(selectedFile)));
                } catch (Exception ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Error loading the image.", "Error", JOptionPane.ERROR_MESSAGE);
                }
			}
			
			
			
		}
		
		if(e.getSource()==abtn) {
			
			if(nameField.getText().isBlank()==false && phnoField.getText().isBlank()==false && radio1.isSelected()==true) {
				apply.showMessageDialog(null, "Hello "+nameField.getText()+"\nPhone no. "+phnoField.getText()+"\nPay Rs.1000/-", "Applied Successfully!", JOptionPane.INFORMATION_MESSAGE);
			
			}
			
			else if(nameField.getText().isBlank()==false && phnoField.getText().isBlank()==false && radio2.isSelected()==true) {
				apply.showMessageDialog(null, "Hello "+nameField.getText()+"\nPhone no. "+phnoField.getText()+"\nPay Rs.1200/-", "Applied Successfully!", JOptionPane.INFORMATION_MESSAGE);
			
			}
			
			
			
			
			else if(nameField.getText().isBlank()==true ||phnoField.getText().isBlank()==true|| radio1.isSelected()==false||(nameField.getText().isBlank()==true) ||(phnoField.getText().isBlank()==true)|| radio2.isSelected()==false)  {
				apply.showMessageDialog(null, "Putting in atleast  a Name and Phone number is mandatory!\nAlso select a post if not done so.", "Application not processed.", JOptionPane.WARNING_MESSAGE);

			}
			
			
			
		}

	}
	
	
	
	
	
	

}
