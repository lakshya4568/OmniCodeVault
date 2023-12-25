import java.util.*;

public class decBin {
    
    public static void bin_To_Dec(int binNum) {
        int my_num = binNum;
        int pow = 0;
        int decNum = 0;

        while (binNum != 0) {
            int lastDigit = binNum % 10;
            decNum += lastDigit * (int) Math.pow(2, pow);
            pow++;
            binNum = binNum / 10;
        }

        System.out.println("Decimal of " + my_num + " = " + decNum);

    }

    public static void dec_To_Bin(int DecNum) {
        int my_num = DecNum;
        int pow = 0;
        int bin_Num = 0;

        while (DecNum != 0) {
            int remainder = DecNum % 2;
            bin_Num += remainder * (int) Math.pow(10, pow);
            pow++;
            DecNum /= 2;
        }

        System.out.println("Binary of " + my_num + " = " + bin_Num);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a no. in binary form (base 2) : ");
        int binary = input.nextInt();

        System.out.print("Enter a no. in Decimal form (base 10) : ");
        int decimal = input.nextInt();
        
        
        bin_To_Dec(binary);
        dec_To_Bin(decimal);
        
        input.close();
    }
}
