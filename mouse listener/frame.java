import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class frame extends JFrame implements MouseListener{

	JLabel label;
	frame(){
		this.setSize(500,500);
		this.setLayout(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		label = new JLabel();
		label.setBackground(Color.red);
		label.setOpaque(true);
		label.setBounds(0,0,100,100);
		label.addMouseListener(this);
		
		this.add(label);
		this.setVisible(true);
	}
	private static final long serialVersionUID = 1L;
	@Override
	public void mouseClicked(MouseEvent e) {
		// invoked when the mouse button has been clicked(press and released) on a component
		//this is the complete action , you pressed and release assuming you pressed on a label and reease on another components or frame it wont be recognised as click
		System.out.println("You clicked a label");
		//label.setBackground(Color.GRAY);
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// invoked when the mouse button has been pressed
		//this is when you immediately press the mouse
		System.out.println("You pressed on a label");
		label.setBackground(Color.yellow);
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// invoked when the mouse button has been released
		//this is after you released a mouse
		System.out.println("You released on what you pressed on a label");
		label.setBackground(Color.green);
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// invoked when the mouse enters the area of a componenets
		System.out.println("i am detective, I know you are in my area, you just entered the label component");
		label.setBackground(Color.blue);
	}
	@Override
	public void mouseExited(MouseEvent e) {
		//  invoked when the mouse exits the area of a componenets
		System.out.println("haa,haaa you thought i wont know when you leave my area :)");
		label.setBackground(Color.red);
	}
}
