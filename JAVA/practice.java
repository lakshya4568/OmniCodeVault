import java.util.*;

public class practice {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char repeat;

        do {
            System.out.println("Choose an option:");
            System.out.println("1. Check if a number is odd or even");
            System.out.println("2. Check if a number is prime");
            System.out.println("3. Find the largest of three numbers");
            System.out.println("4. Check if a year is a leap year");
            System.out.println("5. Calculate income tax");
            System.out.println("6. Reverse of a number");
            System.out.println("7. Numeric Palindrome");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a number : ");
                    int num = input.nextInt();

                    if (num % 2 == 0) {
                        System.out.println(num + " is an even number");
                    } else {
                        System.out.println(num + " is an odd number");
                    }
                    break;
                case 2:
                    System.out.print("Enter a number : ");
                    int primeNum = input.nextInt();

                    if (isPrime(primeNum)) {
                        System.out.println(primeNum + " is prime");
                    } else {
                        System.out.println(primeNum + " is not prime");
                    }
                    break;
                case 3:
                    System.out.print("Enter 1st number : ");
                    float num1 = input.nextFloat();

                    System.out.print("Enter 2nd number : ");
                    float num2 = input.nextFloat();

                    System.out.print("Enter 3rd number : ");
                    float num3 = input.nextFloat();

                    float max = largestOfThree(num1, num2, num3);
                    System.out.println("The maximum floating numeral is " + max);
                    break;
                case 4:
                    System.out.print("Enter The Year (YYYY) : ");
                    int year = input.nextInt();

                    if (leapYear(year) == 1) {
                        System.out.println(year + " is a leap year");
                    } else {
                        System.out.println(year + " is not a leap year");
                    }
                    break;
                case 5:
                    System.out.print("Enter your income in Lakhs : ");
                    float income = input.nextFloat();
                    incomeTax(income);
                    break;
                case 6:
                    System.out.print("Enter the digit which to reverse : ");
                    int digit = input.nextInt();
                    int rev = reverse(digit);
                    System.out.println("The reverse of the digit is " + rev);
                    break;
                case 7:
                    System.out.print("Enter your number : ");
                    int number = input.nextInt();
                    if (isPalindrome(number)) {
                        System.out.println(number + " is a palindrome");
                    } else {
                        System.out.println(number + " is not the palindrome");
                    }
                    break;   
                default:
                    System.out.println("Invalid choice");
            }

            System.out.printf("Do you want to check another option? (y/n) : ");
            repeat = input.next().charAt(0);

        } while (repeat == 'y' || repeat == 'Y');

        System.out.println("Goodbye! Thank you for using the program.");

        input.close();
    }

    public static boolean isPrime(int num) {
        for (int div = 2; div <= Math.sqrt(num); div++) {
            if (num % div == 0) {
                return false;
            }
        }
        return true;
    }

    public static float largestOfThree(float A, float B, float C) {
        if ((A >= B) && (A >= C)) {
            return A;
        } else if (B >= C) {
            return B;
        } else {
            return C;
        }
    }

    public static int leapYear(int year) {
        boolean x = (year % 4 == 0);
        boolean y = (year % 100 != 0);
        boolean z = ((year % 100 == 0) && (year % 400 == 0));

        if (x && (y || z)) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void incomeTax(float income) {
        float tax;

        if (income < 5) {
            System.out.println("You have to give no tax. Stay Happy!");
        } else if ((income >= 5) && (income <= 10)) {
            tax = (0.2f * income);
            System.out.println("You need to pay 20% tax on your income which is " + tax + " Lakhs");
        } else {
            tax = (0.3f * income);
            System.out.println("You need to pay 30% tax on your income which is " + tax + " Lakhs");
        }
    }

    public static int reverse(int digit) {
        int rev = 0;

        while (digit > 0) {
            int rem = digit % 10;
            rev = rev * 10 + rem;
            digit /= 10;
        }
        return rev;
    }

    public static boolean isPalindrome(int num) {
        int reverse = reverse(num);
        if (reverse == num) {
            return true;
        } else {
            return false;
        }
    }
}
