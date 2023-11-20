import java.util.*;

public class pattern {
    public static void diamond(int num) {
        for (int i = 1; i <= num; i++) {
            // space
            for (int j = 1; j <= (num - i); j++) {
                System.out.print(" ");
            }
            // star
            for (int j = 1; j <= ((2 * i) - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 2nd half
        for (int i = num - 1; i >= 1; i--) {
            // space
            for (int j = 1; j <= (num - i); j++) {
                System.out.print(" ");
            }
            // star
            for (int j = 1; j <= ((2 * i) - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void hollow_rectangle(int rows, int columns) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                if (i == 1 || i == rows || j == 1 || j == columns) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
    public static void inverted_rotated_HalfPyramid(int num) {
        for (int i = 1; i <= num; i++) {
            //space
            for (int j = 1; j <= (num - i); j++) {
                System.out.print(" ");
            }
            // star
            for (int j = 1; j <= i; j++) {
                System.out.print("*"+ " ");
            }

            System.out.println();
        }
    }
    
    public static void inverted_HalfPyramid_Numbers(int lines) {
        for (int i = 1; i <= lines; i++) {
            for (int j = 1; j <= ((lines - i) + 1); j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    
    public static void floyds_triangle(int lines) {
        int counter = 1;
        for (int i = 1; i <= lines; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }
    
    public static void zero_one_triangle(int lines) {
        for (int i = 1; i < +lines; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1" + " ");
                } else {
                    System.out.print("0" + " ");
                }
            }
            System.out.println();
        }
    }
    
    public static void butterfly_pattern(int num) {

        for (int i = 1; i <= num; i++) {
            // star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // space
            for (int j = 1; j <= 2 * (num - i); j++) {
                System.out.print(" ");
            }
            // star 
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = num; i >= 1; i--) {
            // star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // space
            for (int j = 1; j <= 2 * (num - i); j++) {
                System.out.print(" ");
            }
            // star 
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public static void solid_rhombus(int lines) {
        for (int i = 1; i <= lines; i++) {
            // space
            for (int j = 1; j <= (lines - i); j++) {
                System.out.print(" ");
            }
            // star
            for (int j = 1; j <= lines; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    public static void hollow_rhombus(int lines) {
        for (int i = 1; i <= lines; i++) {
            // space 
            for (int j = 1; j <= (lines - i); j++) {
                System.out.print(" ");
            }
            // star
            for (int j = 1; j <= lines; j++) {
                if (i == 1 || i == lines || j == 1 || j == lines) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
    
    public static void full_pyramid_without_space(int lines) {
        for (int i = 1; i <= lines; i++) {
            for (int j = 1; j <= (lines - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= ((2 * i) +1); j++) {
                System.out.print("*");
            }
            System.out.println();
            
        }
    }



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      
        //diamond(5);
        //hollow_rectangle(4, 5);
        //inverted_rotated_HalfPyramid(10);
        //inverted_HalfPyramid_Numbers(5);
        //floyds_triangle(5);
        //zero_one_triangle(5);
        //butterfly_pattern(5);
        //solid_rhombus(8);
        //hollow_rhombus(5);

        //full_pyramid_without_space(5);
      
        input.close();
    }
}
