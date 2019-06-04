package MainPackage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.*;
import javax.swing.*;
import java.util.*; 
import java.awt.Color;

class MainClass{
	public static final Color VERY_DARK_GRAY = new Color(51,51,51);
	public static final Color LIGHT_GRAY = new Color(153,153,153);
	public static final Color VERY_LIGHT_GRAY = new Color(217,217,217);
	
    public static void main(String args[]){
    	//Create the ArrayList
    	ArrayList<String> ArrayList=new ArrayList<String>();
    	
    	//Creating the Frame
        JFrame frame = new JFrame("Chat Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);

        //Create Bottom Panel
        JPanel bottompanel = new JPanel();
        
        //Create Top Panel
        JPanel toppanel = new JPanel();
        
        // Create Text Area at the Center
        JTextArea textarea = new JTextArea();
        
        //Create Bottom Panel Components
        JLabel darkmodelabel = new JLabel("Enable Dark Mode");
        JLabel entertextlabel = new JLabel("Enter List Element");
        JTextField textfield = new JTextField(15); //Limit to 15 Char
        JButton send = new JButton("Add");
        send.addActionListener(new ActionListener()
        {
        	@Override
        	public void actionPerformed(ActionEvent e) {
        	String Element = textfield.getText();
        	if (textfield.getText().equals("")) {
        		
        	}
        	else {
			ArrayList.add(Element);
			textfield.setText("");
			System.out.println(ArrayList);
        	}
        }
        }
        );
        
        JButton clearall = new JButton("Clear All");
        clearall.addActionListener(new ActionListener()
        {
        	@Override
        	public void actionPerformed(ActionEvent e) {
        	ArrayList.clear();
			
			System.out.println(ArrayList);
        	}
        });
        
        //Create Top Panel Components
        JCheckBox DarkMode = new JCheckBox();
        DarkMode.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent e) {
                if(DarkMode.isSelected()) {
                	frame.setBackground(Color.DARK_GRAY);
                	bottompanel.setBackground(VERY_DARK_GRAY);
                	toppanel.setBackground(VERY_DARK_GRAY);
                	DarkMode.setBackground(VERY_DARK_GRAY);
                	textfield.setBackground(Color.GRAY);
                	textarea.setBackground(Color.GRAY);
                	darkmodelabel.setForeground(Color.WHITE);
                	entertextlabel.setForeground(Color.WHITE);
                	System.out.println("Sel");
                }
                else {
                	frame.setBackground(LIGHT_GRAY);
                	bottompanel.setBackground(VERY_LIGHT_GRAY);
                	toppanel.setBackground(VERY_LIGHT_GRAY);
                	textfield.setBackground(Color.WHITE);
                	textarea.setBackground(Color.WHITE);
                	DarkMode.setBackground(VERY_LIGHT_GRAY);
                	darkmodelabel.setForeground(Color.BLACK);
                	entertextlabel.setForeground(Color.BLACK);
                	System.out.println("DeSel");
                }
            }
         
        });
        
        
        //Add Components to Bottom Panel (flow layout)
        bottompanel.add(entertextlabel); 
        bottompanel.add(textfield);
        bottompanel.add(send);
        bottompanel.add(clearall);

        //Add Components to Top Panel (flow layout)
        toppanel.add(darkmodelabel); 
        toppanel.add(DarkMode);

        //Adding Components to the frame.
        frame.getContentPane().add(BorderLayout.NORTH, toppanel);
        frame.getContentPane().add(BorderLayout.SOUTH, bottompanel);
        frame.getContentPane().add(BorderLayout.CENTER, textarea);
        frame.setVisible(true);
    }
}