import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Label extends JLabel {
	
	//Jlabel is a GUI display area for a string of text, an image or both 
	
	ImageIcon logo = new ImageIcon("DSC_0017.JPG");  //import pics from our library
	Border myborder = BorderFactory.createLineBorder(Color.BLACK , 2); //import bordeer color and yhickness
	Label(){
		this.setText("I am excited to code my first GUI today 9/12/2022");
		this.setHorizontalTextPosition(JLabel.CENTER); //set text Left center right of imafeIcon
		this.setVerticalTextPosition((int) JFrame.TOP_ALIGNMENT);   //set text TOP, ceter bottom of image Icon
		this.setForeground(new Color(255,255,255));  //use to set text color(you can use custom or availble color)
		this.setFont(new Font("times new roman", Font.ITALIC, 22)); //set font styling (font name, bold|italic|underline etc, font size)
		this.setFont(new Font("times new roman", Font.BOLD, 22));   //set font styling (font name, bold|italic|underline etc, font size)
		this.setIconTextGap(23); //this will set the gap between text and imageIcon
		this.setBackground(Color.yellow);  //use for setting background color. then we set opaque to true
		this.setOpaque(true);   //we can use and label to set background color for our image
		this.setBorder(myborder);//use to set the border
		this.setVerticalAlignment(JLabel.TOP);   //use for setting the position of both text and image to center center bottom
		this.setHorizontalTextPosition(JLabel.RIGHT); //use for setting the poition of both text to right, left or center
		this.setBounds(23, 34, 200, 230);  //it is use to set our label (x cordinate, y cordinate, width of image, height); in the frame
		this.setIcon(logo);  //using the image as logo
		
	}
	private static final long serialVersionUID = 1L;

}
