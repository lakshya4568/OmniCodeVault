import java.util.*;

public class Array_Manipulation{

    public static int arrayLinearSearch(int array[], int size, int key) {
        for (int i = 0; i < size; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void swapPairs(int arr[]) {
        for (int i = 0; i < arr.length - 1; i += 2) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
    }

    public static void swapNumbers(int arr[]) {
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }

    public static int getLargest(int arr[]) {
        int largest = Integer.MIN_VALUE; // -infinity
        for (int i = 0; i <= arr.length - 1; i++) {
            if (largest < arr[i]) {
                largest = arr[i];
            }
        }

        return largest;
    }
    
    public static int getSmallest(int arr[]) {
        int smallest = Integer.MAX_VALUE; // infinity
        for (int i = 0; i <= arr.length - 1; i++) {
            if (smallest > arr[i]) {
                smallest = arr[i];
            }
        }

        return smallest;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int size;
        System.out.print("Enter the size of the array : ");
        size = input.nextInt();

        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.printf("Enter %d element(index) : ", i);
            arr[i] = input.nextInt();
        }

        System.out.println("Choose the method to run ");
        System.out.println("1. LinearSearch" + "\n2. Swap Pairs" + "\n3. Swap Numbers");
        System.out.println("4. Get Largest and smallest element from the array");
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter the element to found (key) : ");
                int key = input.nextInt();
                int result = arrayLinearSearch(arr, size, key);
                if (result == -1) {
                    System.out.println("The element is not present in the array");
                } else {
                    System.out.println("Element is present at index : " + result);
                }
                break;
            case 2:
                System.out.println("Before swapping: " + Arrays.toString(arr));
                swapPairs(arr);
                System.out.println("After swapping : " + Arrays.toString(arr));
                break;
            case 3:
                int numbers[] = new int[2];
                System.out.println("Enter the two numbers : ");
                numbers[0] = input.nextInt();
                numbers[1] = input.nextInt();
                System.out.println("Before swapping: " + numbers[0] + " " + numbers[1]);
                swapNumbers(numbers);
                System.out.println("After swapping : " + numbers[0] + " " + numbers[1]);
                break;
            case 4:
                int large = getLargest(arr);
                System.out.println("The largest no. from the array is : " + large);
                int small = getSmallest(arr);
                System.out.println("The smalles no. from the array is : " + small);
                break;
            default:
                System.out.println("Invalid choice");
        }

        input.close();
    }

}
