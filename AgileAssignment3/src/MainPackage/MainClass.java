package MainPackage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;
import java.util.*;

class MainClass{
    public static void main(String args[]){
    	//Create the ArrayList
    	ArrayList<String> ArrayList=new ArrayList<String>();
    	
    	//Creating the Frame
        JFrame frame = new JFrame("Agile Coding Assignment 3!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);

        //Create Bottom Panel
        JPanel bottompanel = new JPanel();
        
        //Create Top Panel
        JPanel toppanel = new JPanel();
        
        //Create Bottom Panel Components
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
        
        
        //Add Components to Bottom Panel (flow layout)
        bottompanel.add(entertextlabel); 
        bottompanel.add(textfield);
        bottompanel.add(send);
        bottompanel.add(clearall);
        
        // Create Text Area at the Center
        JTextArea textarea = new JTextArea();

        //Adding Components to the frame.
        frame.getContentPane().add(BorderLayout.SOUTH, bottompanel);
        frame.getContentPane().add(BorderLayout.CENTER, textarea);
        frame.setVisible(true);
    }
}