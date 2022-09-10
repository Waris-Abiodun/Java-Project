import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class myCar {
	Scanner bbb = new Scanner(System.in);
	String model = "Benz2022";
	String brand = "tesla";
	String date = "19 - 06 - 2022";
	String color = "White";
	int year = 2022;
	double price = 76983.09;
	
	static void open() {
		Scanner bbb = new Scanner(System.in);
		System.out.println("welcome to your car, would you like to drive or relax?");
		String option = bbb.nextLine();
		if(option.equalsIgnoreCase("drive"))
		{
			drive();
		}
		else {
			relax();
		}
		
	}
	static void drive() {
		Scanner bbb = new Scanner(System.in);
		System.out.println("Use your seat belts\nDo you want autopilot(type yes for auto pilot ) or you want to drive(type drive for manual driving");
		String nop = bbb.nextLine();
		if(nop.equalsIgnoreCase("Yes"))
			autopilot();
		else if (nop.equalsIgnoreCase("drive"))
			mandrive();
		else {
			System.out.println("i dont understand your command, type correct input");
			drive();
			}
	}
	static void autopilot() {
		Scanner bbb = new Scanner(System.in);
		System.out.println("you can play game, watch movie, do your office work or anythoing you like while we are on our way to your destination");
		System.out.println("Do you want to do any of the above type yes to relax");
		String rel = bbb.nextLine();
		if(rel.equalsIgnoreCase("yes"))
			relax();
		else
			System.out.println("sit down and relax while we drive");
		bbb.close();
	}
	static void mandrive() {
		System.out.println("the steering , brakes , gears are now accessible to you now , Enjoy the wheel");
				
	}
	static void relax() {
		Scanner bbb = new Scanner(System.in);
		System.out.println("Do you want a drink, play game or watch TV/netflix\nType 'Game' to play game, 'drink' for drinks , 'Tv' to watch TV ,or netflix");
		String ppp = bbb.nextLine();
		if(ppp.equalsIgnoreCase("drink")) {
			drink();
		}
		else if(ppp.equalsIgnoreCase("game")) {
			game();
		}
		else if(ppp.equalsIgnoreCase("TV")) {
			tv();
		}
		else {
			System.out.println("I dont understand the command, type the correct input");
			relax();
		}
		bbb.close();
	}
	static void game() {
		Scanner bbb = new Scanner(System.in);
		
		System.out.println("would you like to play a guessing game type yes or no");
		String kh = bbb.nextLine();
		if(kh.equalsIgnoreCase("yes")) {
			System.out.println("Welcome to guessing game");
			Guess();
		}
		else{
			System.out.println("That is the only game available now\nThanks for your time enjoy your ride");
		}
		bbb.close();
	}
	static void drink() {
		System.out.println("press the left button to choose the beverages you want");
	}
	static void tv() {
		System.out.println("you can enjoy the netflix , use the remote to navigate through the TV");
	}
	static void Guess() {
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
