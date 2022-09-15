import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class myframe extends JFrame implements ActionListener{
	ButtonGroup group;
	JRadioButton pizzabutton;
	JRadioButton hamburButton;
	JRadioButton hotdogbutton;
	myframe(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		
		/**---------------adding radio button----------**/
		pizzabutton = new JRadioButton("Pizza");
		pizzabutton.addActionListener(this);
		pizzabutton.setBackground(Color.blue);   //you can also set icon for each of the button
		
		hamburButton = new JRadioButton("Hamburger");
		hamburButton.addActionListener(this);
		hamburButton.setBackground(Color.gray);
		
		hotdogbutton = new JRadioButton("Hotdog");
		hotdogbutton.addActionListener(this);
		hotdogbutton.setBackground(Color.pink);
		/**------adding group button to limit choice to one-------*/
		ButtonGroup group = new ButtonGroup();
		group.add(pizzabutton);
		group.add(hamburButton);
		group.add(hotdogbutton);
		
		this.add(pizzabutton);
		this.add(hamburButton);
		this.add(hotdogbutton);
		this.pack();
		this.setVisible(true);
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == pizzabutton) {
			System.out.println("You ordered a pizzza");
		}
		else if (e.getSource() == hamburButton) {
			System.out.println("You order a hamburger");
		}
		else if(e.getSource() == hotdogbutton){
			System.out.println("You order a Hotdog");
		}
		else {
			System.out.println("incorrect input");
		}
		
	}
	private static final long serialVersionUID = 1L;

}
