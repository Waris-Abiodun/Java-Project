import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class progressbar {
	
	JFrame myframe;
	JProgressBar mybar;
	progressbar() {
		myframe = new JFrame();
		myframe.setSize(500,500);
		myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myframe.setLayout(null);
		
		/*------------------------------------------progressbar----------------------------------*/
		mybar = new JProgressBar(0, 200);    //you can use the parenthesis to set the lowest and heigest value whie you use set value to calculate the percentage increase
		//mybar.setValue(25);
		mybar.setBounds(0,150,500,70);
		mybar.setStringPainted(true);
		mybar.setBackground(Color.black);
		mybar.setForeground(Color.red);
		mybar.setFont(new Font("MV Boli", Font.BOLD, 12));
		//mybar.setString("Welcome"); use to modify the string display 
		
		
		
		myframe.add(mybar);
		myframe.setVisible(true);
		fill();
	}
	public void fill() {
		int counter = 0;
		while (counter <= 200) {
			mybar.setValue(counter);
			try {
				Thread.sleep(190);  //use to sleep execution by a certain miliseconds
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}   
			counter += 10;
			
			if (counter < 50) {
				mybar.setString("Today is a good day");
			}
			else if (counter < 100) {
				mybar.setString("I wish you the best in all your endeavours");
			}
			else if (counter < 170) {
				mybar.setString("Show the world kindness, little hep, kindness is a mighty one to the needy");
			}
			else 
				mybar.setString("Welcome");
		}
		
	}
	

}
