import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Pane extends JPanel {
	ImageIcon Meme = new ImageIcon("2604.jpg");
	Label mylabel = new Label();
	Pane(){
		this.setBackground(Color.pink);   //set background for each panel
		this.setBounds(300, 0, 300, 250);  //setthe dimension and where it should be located in the frame
		//this.add(mylabel);     //use to add mylabel components to the layout
		this.setLayout(null);    //allow you to move withon you panel border in respect with the aligjnment passed from mylabel
	}
	private static final long serialVersionUID = 1L;

	
public class greenPane extends JPanel{
	greenPane(){
		this.setBackground(Color.green);   //set background for each panel
		this.setBounds(000, 250, 100, 150);
		}
		private static final long serialVersionUID = 1L;
		
	}
	
	
	
	
}
