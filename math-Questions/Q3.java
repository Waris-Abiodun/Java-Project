import java.util.Scanner;
public class Sum {
	public static void main(String[] args) {
		Scanner add = new Scanner(System.in);
		System.out.println("input the two numbers you want to culculate");
		System.out.print("Enter the first number: ");
		int a = add.nextInt();
		System.out.print("Enter the second number: ");
		int b = add.nextInt();
		int sum = a + b;
		System.out.println("the sum of " +a +" and " +b +" = " +sum );
		add.close();
		}
}
