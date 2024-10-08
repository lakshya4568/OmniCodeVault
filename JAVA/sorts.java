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
            arr[previous + 1] = current;

        }
    }
    
    public static void countingSort(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) { // it give us the max element, i.e, range.
            largest = Math.max(largest, arr[i]);
        }
        
        int count[] = new int[largest + 1];
        // default element's value in count array is 0
        for (int i = 0; i < arr.length; i++) {
            // store the frequency or count of the element in array at its' index place
            count[arr[i]]++;
        }
        
        // sorting in original array
        int j = 0; // change the original value of elements, at indexes position
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }

    }
    public static void main(String[] args) {
        int arr[] = { 1, 4, 1, 3, 2, 4, 3, 7 };

        long startTime = System.currentTimeMillis();

        countingSort(arr);
        System.out.println(Arrays.toString(arr));
    
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("Elapsed time in millisecons : " + elapsedTime);
    }
}
