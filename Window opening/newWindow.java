import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Window {
	JFrame wframe = new JFrame();
	JLabel wlabel = new JLabel();
	Window(){
		wlabel.setBounds(90, 60, 210, 280);
		wlabel.setText("You are doing well");
		wlabel.setFont(new Font("Times new roman",Font.BOLD, 21));
		wlabel.setForeground(Color.yellow);
		
		wframe.setSize(400,400);
		wframe.setLayout(null);
		wframe.getContentPane().setBackground(Color.BLACK);
		wframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		wframe.setVisible(true);
		wframe.add(wlabel);
		
		
	}

}
