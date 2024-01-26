import java.util.*;

public class sorts {
    public static void bubbleSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean swaps = false;
            for (int j = 0; j < (arr.length - 1) - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swaps = true;
                }
            }
            if (!swaps) {
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minPos] > arr[j]) {
                    minPos = j;
                }
            }
            // swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) { // can work with max sort with one unsort left
            int current = arr[i];
            int previous = i - 1; // findingg current position 
            while (previous >= 0 && arr[previous] > current) {
                // arr[previous] > (ascending) or arr[previous] < (descending)
                arr[previous + 1] = arr[previous];
                previous--;
            }
            // insertion sort 
            arr[previous+1] = current;
            
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 3, 2, 8, 3 };

        long startTime = System.currentTimeMillis();

        insertionSort(arr);
        System.out.println(Arrays.toString(arr));

        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("Elapsed time in millisecons : " + elapsedTime);
    }
}
