import java.util.*;

public class pattern {

    public static void SolidSquare(int lines) {
        for (int i = 1; i <= lines; i++) {
            System.out.println("****");
        }
        System.out.println();
    }

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
        System.out.println();
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

    public static void half_pyramid(int lines) {
        for (int i = 1; i <= lines; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
        System.out.println();
    }
    
    public static void numeric_half_pyramid(int lines) {
        for (int i = 1; i <= lines; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
    public static void inverted_HalfPyramid(int lines) {
        for (int i = 1; i <= lines; i++) {
            for (int j = 1; j <= lines - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    public static void character_HalfPyramid(int lines) {
        char ch = 'A'; 
        for (int i = 1; i <= lines; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
            /* If we want this type of pattern like :
                A
                AB                  We can change the inner loop by this algorithm
                ABC                 for (char j = 1; j <= 'A' + i -1; j++) {
                ABCD                    System.out.print(j); }
                
                when i = 2, the loop condition is j <= 'A' + i - 1. 
                Here, i is 2, so the condition becomes j <= 'B'.
            
                In Java, characters are represented as integers based 
                on their Unicode values. 'A' has a smaller Unicode value than 'B', 
                so the condition 'A' <= 'B' is true.            
            */
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

        hollow_rectangle(rows, columns);
        diamond(rows);
        half_pyramid(rows);
        SolidSquare(rows); 
        inverted_HalfPyramid(rows);
        numeric_half_pyramid(rows);

        System.out.println();
        character_HalfPyramid(rows);

        input.close();
    }
}
