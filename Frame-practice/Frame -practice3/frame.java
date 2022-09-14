import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class frame {
	JFrame myframe;
	frame(){
		myframe = new JFrame();
		myframe.setVisible(true);
		myframe.setSize(600,600);
		myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myframe.setLayout(new FlowLayout(FlowLayout.LEADING,70,100));  //use for setting layout (flow behaviour""trailing , center , left etc"",int,int) int,int are the vertical and horizontal dimension
		
		JPanel mypannel = new JPanel();
		mypannel.setPreferredSize(new Dimension(150,200));
		mypannel.setBackground(Color.BLUE);
		//mypannel.setBounds(234, 400, 150, 200);
		mypannel.setLayout(new FlowLayout());     //setting flow layout for my pannel 
		
		mypannel.add(new JButton("1"));          //adding the button to the layout
		mypannel.add(new JButton("2"));
		mypannel.add(new JButton("3"));
		mypannel.add(new JButton("4"));
		mypannel.add(new JButton("5"));
		mypannel.add(new JButton("6"));
		mypannel.add(new JButton("7"));
		mypannel.add(new JButton("8"));
		mypannel.add(new JButton("9"));
		mypannel.add(new JButton("0"));

		
		myframe.add(mypannel);
	
	}

	
}
