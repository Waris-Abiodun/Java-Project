package maths.eqn2;
import java.util.Scanner;

public class Maths {
	public static void main(String[] args) {
		Scanner eqn = new Scanner(System.in);
		System.out.print("Enter the value of x : ");
		double x = eqn.nextDouble();
		double ans = (Math.exp(((Math.PI)/2) * x) * Math.sin(x)) + ((Math.log( Math.pow(Math.abs(x), 5))) * (Math.cos(x)));
		System.out.format("The answer : %.2f", ans);
		
		}
	}
