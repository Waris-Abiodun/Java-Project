import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class Frame extends JFrame implements ActionListener {
	Label mylabel = new Label();
	Pane mypane = new Pane();
	JButton myButton;       //declare globally here s the actionlistiner can listen to it
	JLabel iconlabel;

	ImageIcon logo = new ImageIcon("1569775766579.jpg");  //import pics from our library
	ImageIcon meme = new ImageIcon("2604.jpg");
	ImageIcon buttonIcon = new ImageIcon("40583.jpg");
	
	JPanel yellowPanel = new JPanel();
	JPanel redPanel = new JPanel();
	JPanel bluePanel = new JPanel();
	
	
	Frame() {
		/********************************************************BUtton Practice****************************************************************/
		
		 myButton = new JButton();        
		 myButton.setBounds(200, 100, 215, 50);   //setting the dimensonnand positin
		 myButton.addActionListener(this);  //this allow our frame to send out the result if te action
		 //myButton.addActionListener(e -> System.out.println("Bro a new way to write action listener without adding the override function below this constructor")); //eitheer of the two can be use , but i think this will optimise and save time 		 
		 myButton.setText("Check the magic");
		 myButton.setFocusable(false);  //it helps to bget rid of the box around text
		 myButton.setBackground(Color.magenta);
		 myButton.setFont(new Font("New times roman",Font.ITALIC,12));
		 myButton.setForeground(Color.YELLOW);
		 myButton.setBorder(BorderFactory.createEtchedBorder());
		 myButton.setEnabled(true);   //to enable or disable our button , normally it will always be in tru
		// myButton.setIcon(logo);
		 //we can use set horizontal,vertical, alighnment with button ~~~ etc
		 /***************************************************************************************************************************************/
		 /******************************************************USing a new Label to display an icon after clicking button*************************************************************/
		 iconlabel = new JLabel();
		 iconlabel.setIcon(buttonIcon);
		 iconlabel.setBounds(200,0, 400,500);
		 iconlabel.setVisible(false);
		 
		 
		 /*************************************** using JFRame for practice****************************************************/
		 
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
	/*******************************************using panel for pracice********************************************/
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
		/*******************************adding component to the frame **********************************************************/
		
		this.add(myButton);
		this.add(iconlabel);
		this.add(mylabel);
		
		this.add(mypane);
		this.add(bluePanel);
		this.add(yellowPanel);
		this.add(redPanel);
		
	}
	
	/*********************use to write or display the response of action a=button************************************************/ 
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == myButton){
			System.out.println("Bro you just click the button");
			//myButton.setEnabled(false);   //after first cliked it will stop
			 iconlabel.setVisible(true);
			
			
			
		}
	}
	private static final long serialVersionUID = 1L;
}
