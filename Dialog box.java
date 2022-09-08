import javax.swing.JOptionPane;
public class HelloWorld {

	public static void main(String[] args) {
		String Name = JOptionPane.showInputDialog("Enter Your name");
		if (Name == null)
		{
			JOptionPane.showMessageDialog(null,"Hello, YOU didnt typed your Name");
		}

		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter Your AGE"));
		double hei = Double.parseDouble(JOptionPane.showInputDialog("Enter Your height in inches"));
		
		JOptionPane.showMessageDialog(null,"Hello " +Name +"\n YOU are " +age +"years old, " +hei +"inches tall.");


	}

}
