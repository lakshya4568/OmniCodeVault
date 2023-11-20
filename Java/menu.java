import java.util.*;

public class menu {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		double num1 = input.nextDouble();

		System.out.print("Enter Second Number : ");
		double num2 = input.nextDouble();
		
		System.out.print("Enter an operator [+] [-] [*] [/] : ");
		char operator = input.next().charAt(0); 
			
		switch (operator) {
		
			case '+' : System.out.println("Addition : " + (num1 + num2));
					break;
			case '-' : System.out.println("Subtraction : " + (num1 - num2));
					break;
			case '*' : System.out.println("Multiplication : " + (num1 * num2));
					break;
			case '/' : System.out.println("Division : " + (num1 / num2));
					break;
			default  : System.out.println("You have entered the wrong operator");	
		}


		input.close();

	}

}
