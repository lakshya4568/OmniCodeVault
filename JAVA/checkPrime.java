import java.util.*;

public class primefunc {

    public static boolean isPrime(int num) {
        int div = 2;
        boolean primeCheck = true;

        while (div < num) {
            if (num % div == 0) {
                primeCheck = false;
                break;
            } else {
                div++;
            }
        }

        if (primeCheck) {
            return true;
        } else {
            return false;
        }
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
