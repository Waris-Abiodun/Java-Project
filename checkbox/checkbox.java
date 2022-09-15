import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class frame extends JFrame implements ActionListener{
	JCheckBox mybox;
	JButton mybutton;
	frame(){
		this.setLayout(new FlowLayout());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		/**---------------------------checkBox--------------------**/
		mybox = new JCheckBox();
		mybox.setText("Are you a robot");
		mybox.setFocusable(false);
		mybox.setBackground(Color.BLACK);
		mybox.setForeground(Color.white);
		mybox.setFont(new Font("Robo Black", Font.BOLD, 23));
		mybox.addActionListener(this);
//		mybox.setIcon(null);  //using your imageicon you can add an icon if the users have not selected anything
//		mybox.setSelectedIcon(null);   //you can add an icon after the users have selected an icon
		
		/*----------------------------submit button-------------**/
		mybutton = new JButton();
		mybutton.setText("Submit");
		mybutton.setEnabled(false);
		mybutton.addActionListener(this);
		this.add(mybutton);
		this.add(mybox);
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == mybox) {
			boolean d = mybox.isSelected();
			if (d == true) {
				mybutton.setEnabled(true);
			}
			else {
				mybutton.setEnabled(false);
			}
		}
		 if(e.getSource() == mybutton) {
			System.out.println("Your data is successfully updated");
			
		}
	}

}
