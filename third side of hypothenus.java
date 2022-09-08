import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//A function that get two side of a triangle and calculate the third sides
	System.out.println("what do you want to calculate the hypothenus or the third side/second side\n input 1 for hypthenus and 2 for other side");
	Scanner size = new Scanner(System.in);
	int k = size.nextInt();
	
	if (k == 1)
	{
		System.out.print("Enter the first side: ");
		double a = size.nextDouble();
		System.out.print("Enter the second side: ");
		double b = size.nextDouble();
		
		double c = Math.sqrt((a * a) + (b * b));
		System.out.println("Hypothenus is " +c);
		
	}
	else if (k == 2)
	{
		System.out.print("Enter the hypothenus side: ");
		double a = size.nextDouble();
		System.out.print("Enter the second side: ");
		double b = size.nextDouble();
		if (Math.max(a, b) == a)
		{
				double c = Math.sqrt((a * a) - (b * b));
				System.out.println("Third side is " +c);
		}
		else 
			System.out.println("Hypothenus is the longest side in a right traingle\n input the correct input");
		
	}
	else
		System.out.println("incorrect input");
	
	}

}