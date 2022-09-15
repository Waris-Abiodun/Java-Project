import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class frame extends JFrame implements ActionListener{
	JComboBox comboBox;
	frame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		/*------------------combocox---------------*/
		String[] animals = { "cat", "Dog", "Goat", "Bird", "Hen"};  //only wrapper class data type is accepted e.g Integer instead of int
		comboBox = new JComboBox(animals);
		comboBox.addActionListener(this);
		//comboBox.setEditable(true)   //allows user to search return the index on success and -1 if its not found note that it is case sensitive
		//System.out.println(comboBox.getItemCount());    //to get number of elements inthe checkbox 
		//comboBox.addItem("Horse");  //it is use to add a single item
		//comboBox.removeItemAt(2);  //use to remove item using index
		//comboBox.removeItem("cat");   //it use name to remove object
		//comboBox.removeAllItems(); //it can also be use to remove all the item
		//comboBox.insertItemAt("pig", 2);   //inserting at specific index       
		//comboBox.setSelectedIndex(1);  //use to set default selected index
		
		
		this.add(comboBox);
		this.pack();
		this.setVisible(true);
	}
	private static final long serialVersionUID = 1L;

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == comboBox)
		{
			//if(comboBox.getSelectedIndex()  == 0) can be use to set action for each button
			System.out.println(comboBox.getSelectedItem());
			System.out.println(comboBox.getSelectedIndex());
		}
	}
	

}
