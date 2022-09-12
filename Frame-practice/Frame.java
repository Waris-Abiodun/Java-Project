import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;



public class Frame extends JFrame {
	Label mylabel = new Label();
	Pane mypane = new Pane();

	ImageIcon logo = new ImageIcon("1569775766579.jpg");  //import pics from our library
	ImageIcon meme = new ImageIcon("2604.jpg");
	JPanel yellowPanel = new JPanel();
	JPanel redPanel = new JPanel();
	JPanel bluePanel = new JPanel();
	
	Frame() {
	//	JFrame this = new JFrame(); //create a this
		this.setVisible(true);     //This will show our this
		this.setTitle("Kazeem Waris Abiodun");   //the this name shows at the top corner
		this.setSize(500,500);     //set the file size
		this.setResizable(true);  //allow user to adjust the size of the this which is set to true or flase
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //we can set it to no action , hide etc
		
		this.setIconImage(logo.getImage());   //using the image as logo
		this.getContentPane().setBackground(new Color(255,255,255));  //use for setting  color it support custom color RGB(int, int,int) max is 255,255,255|| it support heaxdecimal color (0x6digit follows) including a -f if needed	
		
		this.setLayout(null); //use to manage the layout , for now let set null
		//this.pack();  //it will pack all our label and automatically give it a size, manage the label so Frame.setsize might not be needed.
		 //add our components : components are panel , labels in our program
		
		yellowPanel.setBackground(Color.yellow);
		yellowPanel.setBounds(300, 250, 300, 200);
		yellowPanel.add(mylabel);
		//yellowPanel.setLayout(new BorderLayout());
		
		redPanel.setBackground(Color.red);
		redPanel.setBounds(0, 0, 300, 250);
	//	redPanel.add(mylabel);
		redPanel.setLayout(null);   //if its not used set to null
		
		bluePanel.setBackground(Color.blue);
		bluePanel.setBounds(0, 250, 300, 200);
	//	bluePanel.add(mylabel);
		redPanel.setLayout(null);
		
		this.add(mylabel);
		this.add(bluePanel);
		this.add(yellowPanel);
		
		this.add(mypane);
		this.add(redPanel);
	}
	private static final long serialVersionUID = 1L;
}
