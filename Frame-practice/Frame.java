import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Frame extends JFrame {
	Label mylabel = new Label();
	ImageIcon logo = new ImageIcon("NESA OAOU logo.png");  //import pics from our library
	Frame() {
	//	JFrame this = new JFrame(); //create a this
		this.setVisible(true);     //This will show our this
		this.setTitle("Kazeem Waris Abiodun");   //the this name shows at the top corner
		this.setSize(500,500);     //set the file size
		this.setResizable(true);  //allow user to adjust the size of the this which is set to true or flase
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //we can set it to no action , hide etc
		
		this.setIconImage(logo.getImage());   //using the image as logo
		this.getContentPane().setBackground(new Color(0xfff));  //use for setting  color it support custom color RGB(int, int,int) max is 255,255,255|| it support heaxdecimal color (0x6digit follows) including a -f if needed	
		
		this.setLayout(null); //use to manage the layout , for now let set null
		//this.pack();  //it will pack all our label and automatially give it a size, manage the label so Frame.setsize might not be needed.
		this.add(mylabel);
		
	}
	private static final long serialVersionUID = 1L;
}
