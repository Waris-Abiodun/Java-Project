import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class frame extends JFrame implements KeyListener{
	
	JLabel mylabel;
	ImageIcon icon;
	frame() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(1500,800);
		this.setLayout(null);
		this.addKeyListener(this);
		icon = new ImageIcon("rocket.png");
		
		mylabel = new JLabel();
		mylabel.setBounds(400,500,400, 378);
		mylabel.setText("use arrow keys to move the rocket");
		
		mylabel.setIcon(icon);
	//	mylabel.setBackground(Color.red);
	//	mylabel.setOpaque(true);
		JOptionPane.showMessageDialog(null, "Use the arrow key to move the rocket up,down,left and right ", "Game instruction",JOptionPane.INFORMATION_MESSAGE);
		

		this.getContentPane().setBackground(Color.black);
		this.add(mylabel);
		this.setVisible(true);
	}
	private static final long serialVersionUID = 1L;
	@Override
	public void keyTyped(KeyEvent e) {
		// Keytyped  : invoked when a key is typed. uses keychar output
//		switch(e.getKeyChar()) {
//			case 'a' : mylabel.setLocation(mylabel.getX() - 10, mylabel.getY());
//				break;
//			case 'b' : mylabel.setLocation(mylabel.getX() + 10, mylabel.getY());
//				break;
//			case 'c' : mylabel.setLocation(mylabel.getX(), mylabel.getY() - 10);
//				break;
//			case 'd' : mylabel.setLocation(mylabel.getX(), mylabel.getY() + 10);
//				break;
//		}
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// keypressed : invoked when a physica key is pressed down , uses keycode , int ouput
		switch(e.getKeyCode()) {
		case 37 : mylabel.setLocation(mylabel.getX() - 10, mylabel.getY());
			break;
		case 39 : mylabel.setLocation(mylabel.getX() + 10, mylabel.getY());
			break;
		case 38 : mylabel.setLocation(mylabel.getX(), mylabel.getY() - 10);
			break;
		case 40 : mylabel.setLocation(mylabel.getX(), mylabel.getY() + 10);
			break;
		}
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// Key released : called whenever a button is released  
		
		//Keychar is the character, while keycode is similar to ascii value but note both lowercase and uppercase are using the lowercase ascii value
		System.out.println("You released key character char : " +e.getKeyChar());
		System.out.println("You released key character code : " +e.getKeyCode());
		
	}
}
