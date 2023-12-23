// display all number entered by user expect multiple of 10 using continue;
import java.util.Scanner;
class test
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Enter the number");
        n = input.nextInt();
        for(int i=1;i<=n;i++)
        {
            if (i%10==0)
            {
                continue;
            }
            System.out.println(i);
        }
    }
}