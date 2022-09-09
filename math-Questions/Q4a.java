import java.util.Scanner;

public class Math {

	public static void main(String[] args) {
		Scanner eqn = new Scanner(System.in);
		System.out.println("input the value of x and y");
		System.out.print("Enter the value of x: ");
		double x = eqn.nextDouble();
		System.out.print("Enter the value of y: ");
		double y = eqn.nextDouble();
		
		double c = java.lang.Math.sqrt(((java.lang.Math.pow((x - 4), 2) / 9)) + ((java.lang.Math.pow((y + 9), 2) / 16)));
		System.out.println("The answer when x and y are substituted is : " +c);
				
		
		System.out.println(c);
		eqn.close();
	}

}
