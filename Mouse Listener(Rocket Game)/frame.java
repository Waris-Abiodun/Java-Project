import java.awt.Color;

import javax.swing.JFrame;

public class myframe extends JFrame{
	
	DragPanel mypael = new DragPanel();
	myframe() {
		this.add(mypael);
		this.setTitle("Drag and Drop");
		this.setSize(600,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setVisible(true);
	}
	private static final long serialVersionUID = 1L;
}
