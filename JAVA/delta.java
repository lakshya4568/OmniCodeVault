import java.util.*;

public class delta {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = input.nextInt();

        int div = 2;
        boolean isPrime = true;

        while (div <= num-1) {
            if (num % div == 0) {
                isPrime = false;
                break;
            } else {
                div++;
            }
        }

        if (isPrime) {
            System.out.println("THIS IS FUCKING PRIME");
        } else {
            System.out.println("THIS IS NOT FUCKING PRIME");
        }
        
        input.close();
    }
}

class delta2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter 1st number :");
        int A = sc.nextInt();
        
        System.out.println("Enter 2nd number : ");
        int B = sc.nextInt();

        System.out.println("Enter 3rd number : ");
        int C = sc.nextInt();

        if ((A >= B) && (A >= C)) {
            System.out.println("Largest is " + A);
        } else if (B >= C) {
            System.out.println("Largest is " + B);
        } else {
            System.out.println("Largest is " + C);
        }

        sc.close();
    }
}