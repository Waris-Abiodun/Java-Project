
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class frame {
	
	frame(){
		JFrame myframe = new JFrame();
		myframe.setVisible(true);
		myframe.setSize(600,600);
		myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myframe.getContentPane().setBackground(Color.GREEN);
		myframe.setLayout(new GridLayout(5,2,2,3));     //setting GRidLayout ,we can pass the row by column (Row,Column,HOrizontal spacing, vertical spacinh)
		
		myframe.add(new JButton("1"));          //adding the button to the layout
		myframe.add(new JButton("2"));
		myframe.add(new JButton("3"));
		myframe.add(new JButton("4"));
		myframe.add(new JButton("5"));
		myframe.add(new JButton("6"));
		myframe.add(new JButton("7"));
		myframe.add(new JButton("8"));
		myframe.add(new JButton("9"));
		myframe.add(new JButton("0"));

	
	}

	
}
