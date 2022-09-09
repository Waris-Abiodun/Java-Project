import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner cof = new Scanner(System.in);
		System.out.println("Given a quadrtic equation : ax^2 + bx + c = 0");
		System.out.println("input the three cooficient of quadratic equations: a , b , c");
		System.out.print("Enter the value of a: ");
		double a = cof.nextDouble();
		System.out.print("Enter the value of b: ");
		double b = cof.nextDouble();
		System.out.print("Enter the value of c: ");
		double c = cof.nextDouble();
		double d = ((Math.pow(b, 2)) - (4 * a *c));
		if(d > 0)
		{
			//System.out.println("The root is Real and DIstint root because the value of discrimant is grater than zero\nD is ");
			double root1 = (-b + Math.sqrt(d)) / (2 * a);
			double root2 = (-b - Math.sqrt(d)) / (2 * a);
			System.out.format("Root1 = %.2f \nRoot2 = %.2f", root1 , root2);
			
		}
		else if(d < 0)
		{
			//System.out.println("The root is comlex root because the value of D is less than zero\nD is " +d);
			double root1 = (Math.sqrt(-d)) / (2 * a);
			double root2 = (Math.sqrt(-d)) / (2 * a);
			double e = -b / (2 * a);
			System.out.format("Root1 = %.2f + %.2fi \nRoot2 = %.2f - %.2fi", e , root1 , e , root2);
			
			
		}else
		{
			//System.out.println("The root is Real and equal root because the value of D is  zero\nD is " +d);
			double root1 = (-b) / (2 * a);
			double root2 = (-b ) / (2 * a);
			
			System.out.format("Root1 = %.2f \nRoot2 = %.2f", root1 , root2);
		}
		
		cof.close();
	}

}
