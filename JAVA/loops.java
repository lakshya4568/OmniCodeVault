import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int num = input.nextInt();
        int sum = 0;

        for (int i = 1; i <= num; i++) {
            sum += i;
        }

        System.out.println(sum);

        input.close();
    }
}

class checkPrime {  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = input.nextInt();

        if (num == 2) {
            System.out.println("2 is a Prime Number");
        } else {
            boolean isPrime = true;
            for (int div = 2; div <= num-1; div++) {
                if (num % div == 0) { // num is a multiple of div, (div is not equal to 1 or num)
                    isPrime = false;
                }
            }

            if (isPrime) {
                System.out.println(num + " is a prime number");
            } else {
                System.out.println(num + " is not a prime number");
            }

        }

        /* We can more optimised the given code while minimizing the time complexity 
        of it using Square root of num like which decreases the no.of steps to the maximum value
        of the num multiples by using this statement : 
        for (int div = 2; div <= Math.sqrt(num);  */

        input.close();
    }
}

class Multiplication_Table {
    public static void main(String[] argsStrings) {
        Scanner input = new Scanner(System.in);

        char choice;
        int number;

        do {
            System.out.println("This is a Table Program");
            System.out.print("Enter the number : ");
            number = input.nextInt();

            for (int i = 1; i <= 10; i++) {
                System.out.println(number + " X " + i + " = " + (number * i));
            }

            
            System.out.print("Do you want to check another table (y/n) : ");
            choice = input.next().charAt(0);

        } while ((choice == 'y' || choice == 'Y'));
        
        

        input.close();
    }
}

class factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int factorial = 1; // To hold factorial
        int number; // To hold number

        System.out.print("Enter the number : ");
        number = input.nextInt();

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        System.out.println("Factorial of the number is : " + factorial);


        input.close();
    }
}

