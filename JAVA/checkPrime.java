import java.util.*;

public class checkPrime {

    public static boolean isPrime(int num) {
        boolean checkPrime = true;
        for (int div = 2; div <= num - 1; div++) {
            if (num % div == 0) { // // num is a multiple of div, (div is not equal to 1 or num)
                checkPrime = false;
                break;
            }
        }

        if (checkPrime) {
            return true;
        } else {
            return false;
        }

        /*
         * We can more optimised the given code while minimizing the time complexity
         * of it using Square root of num like which decreases the no.of steps to the
         * maximum value
         * of the num multiples by using this statement :
         * for (int div = 2; div <= Math.sqrt(num);
         */
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = input.nextInt();

        if (isPrime(num)) {
            System.out.println("prime");
        } else {
            System.out.println("non prime");
        }

        input.close();

    }
}
