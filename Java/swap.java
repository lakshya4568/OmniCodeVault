import java.util.Scanner;

public class swap {
    public static void swapPairs(int arr[]) {
        for (int i = 0; i < arr.length - 1; i += 2) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
    }

    /* 
        In java, since we can't directly access pointers, 
        we can only call by values of swapping of two numbers there
        thus, we use array which uses call by refrence method to modify 
        the original values
    */

    public static void swapNumbers(int arr[]) {
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println();

        {
            System.out.print("Enter the size of the array : ");
            int size = input.nextInt();

            int arr[] = new int[size];
            for (int i = 0; i < size; i++) {
                System.out.printf("Enter %d element of the array : ", i);
                arr[i] = input.nextInt();
            }

            System.out.println("Before swapping: " + java.util.Arrays.toString(arr));
            swapPairs(arr);
            System.out.println("After swapping : " + java.util.Arrays.toString(arr));
        }
            System.out.println();
        {
            int numbers[] = new int[2];
            System.out.println("Enter the two numbers : ");
            numbers[0] = input.nextInt();
            numbers[1] = input.nextInt();

            System.out.println("Before swapping: " + numbers[0] + " " + numbers[1]);
            swapNumbers(numbers);
            System.out.println("After swapping : " + numbers[0] + " " + numbers[1]);

        }
        


        input.close();
    }
    
    
}
