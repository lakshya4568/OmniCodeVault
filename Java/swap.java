import java.util.Scanner;

public class swap {
    public static void swapPairs(int arr[]) {
        for (int i = 0; i < arr.length - 1; i += 2) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
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

        input.close();
    }
    
    
}
