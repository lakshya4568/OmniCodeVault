import java.util.*;

public class array {

    public static int linearSearch(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }

        return -1;
    }
    
    public static void arrayInput(int arr[]) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = input.nextInt();
        }
        input.close();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int size = input.nextInt();

        int arr[] = new int[size];
        arrayInput(arr);
        
        System.out.print("Enter the element to be searched: ");
        int key = input.nextInt();

        int index = linearSearch(arr, key);
        if (index == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index " + index);
        }


        input.close();

    }
}