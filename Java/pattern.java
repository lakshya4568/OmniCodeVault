import java.util.*;

public class pattern {
    public static void hollow_rectangle(int rows, int cols) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                if (i == 1 || j == 1 || i == rows || j == cols) {
                    System.out.print("*" + " ");
                } else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }
    }

    public static void diamond(int lines) {
        // space 
        for (int i = 1; i <= lines; i++) {
            for (int j = 1; j <= lines - i; j++) {
                System.out.print(" ");
            }
            // star
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // space
        for (int i = lines - 1; i >= 1; i--) {
            for (int j = 1; j <= lines - i; j++) {
                System.out.print(" ");
            }
            // star
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println();
        
        System.out.print("Enter no. of rows : ");
        int rows = input.nextInt();

        System.out.print("Enter no. of columns : ");
        int columns = input.nextInt();

        System.out.println();

        //hollow_rectangle(rows, columns);
        diamond(rows);


        input.close();
    }
}
