import java.util.*;

public class practice {
    public static void main(String[] aStrings) {
        Scanner input = new Scanner(System.in);

        // character data type with its size
        // byte[1] < short[2] < int[4] < float[4] < long[8] < double[8]

        char repeat;

        do {
            System.out.println("Enter a number : ");
            int num = input.nextInt();

            if (num % 2 == 0) {
                System.out.println(num + "is an even number");
            } else {
                System.out.println(num + "is an odd number");
            }

            System.out.printf("Do you want to check another number? (y/n) : ");
            repeat = input.next().charAt(0);
        } while (repeat == 'y' || repeat == 'Y');

        System.out.println("Goodbye!, Thank you for using odd even program ");

        input.close();
    }
}


class practice2 {

    public static float largest_of_three(float A, float B, float C) {
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
            System.out.println("BROTHER YOU ARE FUCKED with 30% tax on your income which is " + tax + " Lakhs");
        } 
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        {
            System.out.println("Enter The Year (YYYY)");
            int year = input.nextInt();

            if (leapYear(year) == 1) {
                System.out.println("THIS IS A LEAP YEAR");
            } else {
                System.out.println("This is not a leap year");
            }
        }

        {
            System.out.println("Enter 1st number :");
            float num1 = input.nextInt();

            System.out.println("Enter 2nd number : ");
            float num2 = input.nextInt();

            System.out.println("Enter 3rd number : ");
            float num3 = input.nextInt();

            float max = largest_of_three(num1, num2, num3);
            System.out.println("The maximum floating numeral is " + max);

        }
        
        {
            System.out.println("Enter your income in Lakhs : ");
            float income = input.nextFloat();
            incomeTax(income);
        }

        input.close();
    }
}