import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LaunchPage implements ActionListener {
	JFrame myframe = new JFrame();
	JButton launchButton = new JButton("New Window");
	
	LaunchPage(){
		/**----------------------------Button--------------------------**/
		launchButton.setBounds(100, 150, 200, 40);
		launchButton.setFocusable(false);
		launchButton.addActionListener(this);
		/**-----------------------------Frame---------------------------**/
		myframe.setSize(420,420);
		myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myframe.setLayout(null);
		myframe.add(launchButton);
		myframe.setVisible(true);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == launchButton) {
			new Window();
			myframe.dispose();    //it will exist myframe window
		}
		
	}
}
