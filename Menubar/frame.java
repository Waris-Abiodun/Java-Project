import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class frame extends JFrame implements ActionListener {
	
	JMenuItem openitem;
	JMenuItem recentitem;
	JMenuItem saveitem;
	JMenuItem restartitem;
	JMenuItem exititem;
	JMenuItem newitem;

	frame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 500);
		this.setLayout(new FlowLayout());
		this.getContentPane().setBackground(Color.red);
		
		/*----------------------------------File MenuItem-------------------------------------------------*/
	

		openitem = new JMenuItem("Open");
		openitem.setMnemonic(KeyEvent.VK_O);   //O is open
		openitem.addActionListener(this);
		//openitem.setIcon(null); //can be use to set icon for each menu item
		
		recentitem = new JMenuItem("Recent File");
		recentitem.setMnemonic(KeyEvent.VK_R);    //R is recent
		recentitem.addActionListener(this);
		
		saveitem = new JMenuItem("Save");
		saveitem.setMnemonic(KeyEvent.VK_S);
		saveitem.addActionListener(this);
		
		restartitem = new JMenuItem("Restart");
		restartitem.setMnemonic(KeyEvent.VK_W);
		restartitem.addActionListener(this);
		
		exititem = new JMenuItem("Exit");
		exititem.setMnemonic(KeyEvent.VK_E);
		exititem.addActionListener(this);
		
		newitem = new JMenuItem("New file");
		newitem.setMnemonic(KeyEvent.VK_N);
		newitem.addActionListener(this);


		/*----------------------------------Menu-----------------------------------------------------*/
		JMenu fileMenu = new JMenu("File");
		fileMenu.setMnemonic(KeyEvent.VK_F); //ALT + F
		fileMenu.add(newitem);
		fileMenu.add(openitem);
		fileMenu.add(recentitem);
		fileMenu.add(saveitem);
		fileMenu.add(restartitem);
		fileMenu.add("adding direcly");
		fileMenu.add(exititem);
		
		
		JMenu editMenu = new JMenu("Edit");
		editMenu.setMnemonic(KeyEvent.VK_E);  //ALT +  E
		// editMenu.setIconTextGap(100); //can be used to set gap between icon
		//editMenu.setIcon(null);   //can be use to set icon for each menu
		
		JMenu sourceMenu = new JMenu("Source");
		sourceMenu.setMnemonic(KeyEvent.VK_O);
		
		JMenu refactorMenu = new JMenu("Refactor");
		refactorMenu.setMnemonic(KeyEvent.VK_R);
		
		JMenu searchMenu = new JMenu("Search");
		searchMenu.setMnemonic(KeyEvent.VK_S);
		
		JMenu helpMenu = new JMenu("help");
		helpMenu.setMnemonic(KeyEvent.VK_H);
		
		/*-----------------------------------Menubar---------------------------------------------------*/
		JMenuBar mymenubar = new JMenuBar();
		mymenubar.add(fileMenu);
		mymenubar.add(editMenu);
		mymenubar.add(sourceMenu);
		mymenubar.add(refactorMenu);
		mymenubar.add(searchMenu);
		mymenubar.add(helpMenu);
		mymenubar.setBackground(Color.yellow);
		
		this.setJMenuBar(mymenubar);
		this.setVisible(true);
	}

	
	private static final long serialVersionUID = 1L;

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == openitem) {
			System.out.println("Opening a file");
		}
		else if (e.getSource() == recentitem) {
			System.out.println("Opening recent file");
		}
		else if (e.getSource() == saveitem) {
			System.out.println("Saving a file");
		}
		else if (e.getSource() == newitem) {
			System.out.println("Opening a new file");
		}
		else if (e.getSource() == restartitem) {
			System.out.println("Restating window");
		}
		else if (e.getSource() == exititem) {
			System.exit(0);
		}
		else 
		{
			System.out.println("Processing...");
		}
		
		
	}
	

}
