import java.awt.Color;
import java.awt.*;

import javax.swing.*;
import javax.swing.event.*;

public class SliderDemo implements ChangeListener{
	
	JFrame myframe;
	JPanel mypanel;
	JLabel mylabel;
	JSlider myslider;
	
	SliderDemo() {
		/*----------------------------------------------------frame-------------------------------------*/
		myframe = new JFrame();
		myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myframe.setSize(420,420);
		
		/*----------------------------------------------------slider--------------------------------*/
		myslider = new JSlider(-100, 100, 0);    //(min,max,startpoint)
		myslider.setPreferredSize(new Dimension(400, 200));
		myslider.setPaintTicks(true);
		myslider.setMinorTickSpacing(10); //this mark the range betwen numbers using the number passed
		myslider.setPaintTrack(true);
		myslider.setMajorTickSpacing(20);  //this set the major thick range
		myslider.setPaintLabels(true);     //add value/number to the major thick
		myslider.setFont(new Font("my boli",Font.BOLD, 10));
		myslider.setForeground(Color.blue);
		myslider.setOrientation(SwingConstants.VERTICAL);
		myslider.addChangeListener(this);
		myslider.setBackground(Color.YELLOW);
		/*----------------------------------------------------label----------------------------------*/
		mylabel = new JLabel();
		mylabel.setText("°C = " +myslider.getValue());
		mylabel.setFont(new Font("my boli",Font.ITALIC, 18));
		mylabel.setForeground(Color.BLUE);

		
		/*----------------------------------------------------panel-----------------------------------*/
		mypanel = new JPanel();
		mypanel.add(myslider);
		mypanel.add(mylabel);
		mypanel.setBackground(Color.yellow);
		

		myframe.add(mypanel);
		myframe.setVisible(true);
		
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		if(e.getSource() == myslider) {
			mylabel.setText("°C = " +myslider.getValue());
		}
		
	}

}
