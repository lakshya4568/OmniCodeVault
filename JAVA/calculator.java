import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char choice;
        char operator;
        double num1, num2;

        do {

            System.out.print("Enter your first number : ");
            num1 = input.nextDouble();

            System.out.print("Enter your second Number : ");
            num2 = input.nextDouble();

            System.out.println("Enter The Type of Operation You want to Perform - ");
            System.out.println("The Valid Operations are :\n [+]\n [-]\n [*]\n [/]\n [%]");
            operator = input.next().charAt(0);

            switch (operator) {
                case '+' -> System.out.println("The Sum of these two number is " + (num1 + num2));
                case '-' -> System.out.println("The Differene of these two number is " + (num1 - num2));
                case '*' -> System.out.println("The roduct of these two number is " + (num1 * num2));
                case '/' -> System.out.println("The Divison of these two number is " + (num1 / num2));
                case '%' -> System.out.println("The Remainder of these two numbers is " + (num1 % num2));

                default -> System.out.println("You have entered an Invalid Operation");
            }

            System.out.println("Do you want to continue? (y/n)");
            choice = input.next().charAt(0);

        } while ((choice == 'y') || (choice == 'Y'));
         
        input.close();
    }
}

