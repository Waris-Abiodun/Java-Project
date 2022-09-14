import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// Dialogue boxes are GUI that ask users of a value , or show them a message
//		JOptionPane.showMessageDialog(null, "Hey how far", "Waris asking", JOptionPane.PLAIN_MESSAGE); // (Parent componenets, message,title,messagetype)
//		JOptionPane.showMessageDialog(null, "Today is a good day", "Today", JOptionPane.INFORMATION_MESSAGE);
//		JOptionPane.showMessageDialog(null, "How old are you?", "Age", JOptionPane.QUESTION_MESSAGE);
//		JOptionPane.showMessageDialog(null, "Incorrect input", "input mismatch", JOptionPane.ERROR_MESSAGE);
//		JOptionPane.showMessageDialog(null, "Overiding,editing system program might let your computer misbehave", "system info", JOptionPane.WARNING_MESSAGE);  
		
		int ans = -1;
		while(ans == -1) {
			ans = JOptionPane.showConfirmDialog(null, "Do you want to win a lottery", "Food Lottery", JOptionPane.YES_NO_CANCEL_OPTION);   //(parent_components , the message, the titele , optiontyepe)
			//note if users click is as folows yes = 0, no= 1, cancel = 2 canceling is -1
			if (ans == 0) {
				JOptionPane.showMessageDialog(null, "You are about to win a lottery", "Lucky", JOptionPane.INFORMATION_MESSAGE);
				String Name = JOptionPane.showInputDialog(null, "What is your name");
				JOptionPane.showMessageDialog(null, "Hello "+Name +"\nWelcome to 419 game");
			}
			
			else if (ans == 1) {
				JOptionPane.showMessageDialog(null, "You are about to lose one time opportunity in your life \n are you sure you want to miss this great opportunity", "opportunity come but once", JOptionPane.ERROR_MESSAGE);
			}
			else if (ans == 2)
			{
				JOptionPane.showMessageDialog(null, "choose an option to avoid random choice for you", "Incorrect input", JOptionPane.ERROR_MESSAGE);  
			}
			else {
				JOptionPane.showMessageDialog(null, "you have to choose between Yes , no or cancel");
				
			}
		}
			/**--------------this combine the three showoption, show message, input ----------------**/
		
		/**you can set the option button by yourself using array of string****/
			String resp[] = {"No you are awesome", "Thank you", "Smile","whining"};
			JOptionPane.showOptionDialog(
					null,   // Parent components
					"you are great\nGod will bless you and your family \nI appreciate your greatness",  //main message to be display or qustion
					"Welcome message", //the title of the question
					JOptionPane.YES_NO_CANCEL_OPTION,    //the option you want to give the user.
					JOptionPane.INFORMATION_MESSAGE,     //the type of message or question you are asking the users
					null,                                 //you can use the to set your custom image Icon or pics
					resp,                                 //you can use this to set the custom option for the users ,if you want to use the default (yes, no ...) set it to null
					1);    								  //the button that will be selected initially
			}
		
	}


