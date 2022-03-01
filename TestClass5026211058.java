import java.util.Scanner;

public class TestClass5026211058{

	public static void main(String[] args){
		ComputeMethods5026211058 cm = new ComputeMethods5026211058();
		Scanner sc = new Scanner (System.in);

		System.out.print("What is the temperature in Fahrenheit right now? \n\tF= ");
		double input = sc.nextDouble();
		double temp = cm.fToC(input);
		
		System.out.print("\nWhat is the given side length of the triangle? \n\ta= ");
		int sideA = sc.nextInt();
		System.out.print("What is the given side length of the triangle? \n\tb= ");
		int sideB = sc.nextInt();
		double hyp = cm.hypotenuse(sideA, sideB);
		
		//random roll dice generator
		int rdNum = cm.roll();

		System.out.println("\nTemp in Celcius is " + temp);
		System.out.println("Hypotenuse is " + hyp);
		System.out.println("The sum of the dice is " + rdNum);


	}
}