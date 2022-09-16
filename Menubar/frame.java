import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.*;
import java.io.File;

import javax.swing.*;

public class frame extends JFrame implements ActionListener {
	
	JMenuItem openitem;
	JMenuItem recentitem;
	JMenuItem saveitem;
	JMenuItem restartitem;
	JMenuItem exititem;
	JMenuItem newitem;
	
	JMenuItem backgroundColor;
	JMenuItem textColor;
	
	//JLabel mylabel;
	JTextField mytextField;
	frame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//this.setSize(500, 500);
		//this.setLayout(new FlowLayout());
		this.getContentPane().setBackground(Color.black);
		
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
		/*---------------------------------------color menuitem-------------------------------*/
		textColor = new JMenuItem("Select text color");
		textColor.setMnemonic(KeyEvent.VK_T);
		textColor.addActionListener(this);
		
		backgroundColor = new JMenuItem("Select background color");
		backgroundColor.setMnemonic(KeyEvent.VK_B);
		backgroundColor.addActionListener(this);

		


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
		
		JMenu colorMenu = new JMenu("Color");
		colorMenu.setMnemonic(KeyEvent.VK_C);
		colorMenu.add(textColor);
		colorMenu.add(backgroundColor);
		/*-----------------------------------Menubar---------------------------------------------------*/
		JMenuBar mymenubar = new JMenuBar();
		mymenubar.add(fileMenu);
		mymenubar.add(editMenu);
		mymenubar.add(sourceMenu);
		mymenubar.add(refactorMenu);
		mymenubar.add(helpMenu);
		mymenubar.add(colorMenu);
		mymenubar.add(searchMenu);
		mymenubar.setBackground(Color.yellow);
		
		mytextField = new JTextField();
		//mytextField.setPreferredSize(new Dimension(500 ,500));
		mytextField.setFont(new Font("Consolas", Font.BOLD, 12));
		mytextField.setForeground(Color.red);
		mytextField.setBackground(Color.white);
		mytextField.setCaretColor(Color.black);   //the cursor that is blinking 
		//mytextField.setText("username");
		
		this.add(mytextField);
		this.setJMenuBar(mymenubar);
		this.pack();
		this.setVisible(true);
	}

	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		/*--------------------------------File chooser----------------------*/
		JFileChooser filechooser = new JFileChooser();
		
		filechooser.setCurrentDirectory(new File("."));  //setting the directory you want to open using the file path or passing "." to select the current path
		if (e.getSource() == openitem) {
			System.out.println("Opening a file");
			int select = filechooser.showOpenDialog(null);  //this will set file to open, if a file is selected it will return 0 and 1 if not
			if (select == JFileChooser.APPROVE_OPTION) {
				File nfile = new File(filechooser.getSelectedFile().getAbsolutePath());
				System.out.println(nfile);
			}
		}
		else if (e.getSource() == recentitem) {
			System.out.println("Opening recent file");
		}
		else if (e.getSource() == saveitem) {
			System.out.println("Saving a file"); 
			filechooser.showSaveDialog(null);   //open a prompt to save afile
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
		else if(e.getSource() == backgroundColor){
			JColorChooser Colorchooser = new JColorChooser();
			Color color = JColorChooser.showDialog(null, "Pick a color", Color.red); //(parent component, title, initial color)
			mytextField.setBackground(color);
			
			
		}
		else if(e.getSource() == textColor){
			JColorChooser Colorchooser = new JColorChooser();
			Color color = JColorChooser.showDialog(null, "Pick a color", Color.red); //(parent component, title, initial color)
			mytextField.setForeground(color);
			
			
		}

		else
		{
			System.out.println("Processing...");
		}
		
		
	}
	
	private static final long serialVersionUID = 1L;
}
