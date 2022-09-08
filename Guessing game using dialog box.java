import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

import javax.swing.JOptionPane;
public class Main {

	public static void main(String[] args) {
        //a guessing game using the dialog box,User have three chnaces to play the game they can guess a number between 0 -9
		Random guess = new Random();
		Scanner input = new Scanner(System.in);
		JOptionPane.showMessageDialog(null, "Are you ready to win an awesome prize\nPlay our lucky game to win");
        JOptionPane.showMessageDialog(null, "Guess a number between 0 to 9\n click okay to play");
		int a = guess.nextInt(10);
		int b = 80;
		for( int i = 0 ;b != a && i < 3; i++)
		{
			if (i == 0)
			{
				//JOptionPane.showMessageDialog("Enter your first guess to win our prize");
				b = Integer.parseInt(JOptionPane.showInputDialog("Enter your first guess to win our prize"));
			}
			else if (i == 1)
			{
				b = Integer.parseInt(JOptionPane.showInputDialog("You have two chance left\n Enter your second guess: "));
				//b = input.nextInt();
			}
			else if (i == 2)
			{
				//JOptionPane.showMessageDialog("This is your last chance \n Enter your second guess: ");
				b = Integer.parseInt(JOptionPane.showInputDialog("This is your last chance \n Enter your last guess: "));
			}
		}
		if ( b == a)
			JOptionPane.showMessageDialog(null, "You Won!!!");
		else
		{
			JOptionPane.showMessageDialog(null, "You lose!!");
			JOptionPane.showMessageDialog(null , "The guess number was " +a);
		}
		
		
		
	}

}
