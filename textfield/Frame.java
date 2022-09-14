import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class myframe extends JFrame implements ActionListener{
	JButton mybutton;
	JTextField mytextField;
	myframe(){
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		/**--------------------------------adding the button tothe side of textfield---*/
		mybutton = new JButton("Submit");
		mybutton.setPreferredSize(new Dimension(100, 40));
		mybutton.addActionListener(this);
		/**--------------------------------textfield----------------------------**/
		mytextField = new JTextField();
		mytextField.setPreferredSize(new Dimension(250 ,40));
		mytextField.setFont(new Font("Consolas", Font.BOLD, 12));
		mytextField.setForeground(Color.red);
		mytextField.setBackground(Color.black);
		mytextField.setCaretColor(Color.white);   //the cursor that is blinking 
		mytextField.setText("username");
		
		
		this.add(mytextField);
		this.add(mybutton);
		this.pack();
		this.setVisible(true);
	}
	private static final long serialVersionUID = 1L;
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == mybutton) {
			System.out.println("Welcome "+mytextField.getText());
			mytextField.setEditable(false);  //the user wont be able to edit the text
			mybutton.setEnabled(false);
		}
		
	}

	

}
