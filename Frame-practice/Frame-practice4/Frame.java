import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

public class frame {
	
	frame(){
		/**---------------------------------------------Label----------------------------------------------------------------**/
		JLabel label2 = new JLabel();
		label2.setOpaque(true);
		label2.setBackground(Color.red);
		label2.setBounds(30, 30, 150, 150);
		
		JLabel label3 = new JLabel();
		label3.setOpaque(true);
		label3.setBackground(Color.blue);
		label3.setBounds(60, 60, 150, 150);
		
		JLabel label4 = new JLabel();
		label4.setOpaque(true);
		label4.setBackground(Color.GRAY);
		label4.setBounds(90, 90, 150, 150);
		
		/**--------------------------------------------LayeredPane-------------------------------------------------------------**/
		//Jlayered is third dimensional panel for positioning components just like the third block of 3-D array
		JLayeredPane myLayPane = new JLayeredPane();
		myLayPane.setBounds(150, 150, 300, 300);
		myLayPane.setOpaque(true);
		myLayPane.setBackground(Color.green);
	
		myLayPane.add(label2, Integer.valueOf(0));              //adding each label to the pane then we will add the pane to the frame
		myLayPane.add(label3, Integer.valueOf(1));           //JLayeredPane.DEFAULT_LAYER ,POPUP_LAYER ,DRAG_LAYER etc can be used to set the order of the layer
		myLayPane.add(label4, Integer.valueOf(2));    //Shortcut: each layered can be set using a number base on we want them to showINTEGER.value(num)
		
		/**---------------------------------------------Frame------------------------------------------------------------------**/
		JFrame myframe = new JFrame("JLayeredPane");
		myframe.add(myLayPane);        //adding the layered pane to the frame
		myframe.getContentPane().setBackground(Color.yellow);
		myframe.setSize(new Dimension(600,600));
		myframe.setLayout(null);
		myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myframe.setVisible(true);      //setting true at the bottom is important to show your content and all
	}
}
