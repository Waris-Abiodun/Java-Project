import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class frame  {
	JFrame myframe = new JFrame();
	frame(){
		/***********************Frame **************************************/
		myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myframe.setSize(400, 550);
		myframe.setVisible(true);
		myframe.setLayout(new BorderLayout(5,5));      //to add the the panels to our layout , we need to set up the frame with a border layout if (int,int) set margin between the panel vertically and horizontally
		/**********************Panels*******************************/
		JPanel panel1 = new JPanel();   //declaring each panel
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		JPanel panel5 = new JPanel();
		JPanel panel6 = new JPanel();
		JPanel panel7 = new JPanel();
		
		panel1.setBackground(Color.black);     //setting color for each panel
		panel2.setBackground(Color.YELLOW);
		panel3.setBackground(Color.BLUE);
		panel4.setBackground(Color.red);
		panel5.setBackground(Color.CYAN);
		panel6.setBackground(Color.PINK);
		panel7.setBackground(Color.WHITE);
		
		panel1.setPreferredSize(new Dimension(20, 20)); //setting prefferred sizze for each border
		panel2.setPreferredSize(new Dimension(20, 20));
		panel3.setPreferredSize(new Dimension(20, 20));
		panel4.setPreferredSize(new Dimension(20, 10));
		panel5.setPreferredSize(new Dimension(10, 10));
		panel6.setPreferredSize(new Dimension(10, 10));
		panel7.setPreferredSize(new Dimension(10, 10));
		
		/*----------------sub panels for the center --------------------------*/
		JPanel panel31 = new JPanel();   //declaring each panel
		JPanel panel32 = new JPanel();
		JPanel panel33 = new JPanel();
		JPanel panel34= new JPanel();
		JPanel panel35 = new JPanel();
		
		
		panel31.setBackground(Color.GREEN);     //setting color for each panel
		panel32.setBackground(Color.black);
		panel33.setBackground(Color.magenta);
		panel34.setBackground(Color.gray);
		panel35.setBackground(Color.orange);
		
		panel3.setLayout(new BorderLayout(20,20));  //seeting margin for the sub panel
		
		panel31.setPreferredSize(new Dimension(20, 20)); //setting prefferred sizze for each border
		panel32.setPreferredSize(new Dimension(20, 20));
		panel33.setPreferredSize(new Dimension(20, 20));
		panel34.setPreferredSize(new Dimension(20, 20));
		panel35.setPreferredSize(new Dimension(20, 20));
		
		
		/*****************adding components to the frame********/
	
		myframe.add(panel1, BorderLayout.NORTH);    //can be use for top panel
		//myframe.add(panel6, BorderLayout.PAGE_START);     //main top panel that will overide the north if used
		myframe.add(panel2,BorderLayout.SOUTH);      //buttom panel
	//	myframe.add(panel7, BorderLayout.PAGE_END);  //main buttom panel that will overide the south panel when used 
		myframe.add(panel3, BorderLayout.CENTER);     //middle panel
		myframe.add(panel4, BorderLayout.WEST);
		myframe.add(panel5, BorderLayout.EAST);	
		
		/***** adding the sub panel to panel3 ,it is a panel inside panel****/
		panel3.add(panel31, BorderLayout.NORTH);    //can be use for top panel
		panel3.add(panel32,BorderLayout.SOUTH);      //buttom panel 
		panel3.add(panel33, BorderLayout.CENTER);     //middle panel
		panel3.add(panel34, BorderLayout.WEST);
		panel3.add(panel35, BorderLayout.EAST);	
		
		
	}
	
}
