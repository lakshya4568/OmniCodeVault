import java.util.*;

public class Array_Manipulation {

    public static void printArray(int arr[]) {
        System.out.println(Arrays.toString(arr));
    }

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

    public static int binarySearch(int arr[], int key) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2; // formula to get middle element index
            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] < key) { // right half
                start = mid + 1;
            } else { // left half
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void reverseArray(int numbers[]) {
        int firstIndex = 0, lastIndex = numbers.length - 1;
        while (firstIndex < lastIndex) {
            // swap
            int temp = numbers[firstIndex];
            numbers[firstIndex] = numbers[lastIndex];
            numbers[lastIndex] = temp;

            firstIndex++;
            lastIndex--;
        }
    }

    public static void printPairs(int array[]) {
        int total_pairs = 0;
        for (int i = 0; i < array.length; i++) {
            int current = array[i]; // 2, 4,6,8, 10
            for (int j = i + 1; j < array.length; j++) {
                System.out.print("(" + current + "," + array[j] + ") ");
                total_pairs++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs : " + total_pairs);
    }

    public static void printSub_Array(int numbers[]) {
        int total_SubArray = 0;

        int currSum = 0;
        int minSum = Integer.MAX_VALUE;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                currSum = 0;
                for (int k = start; k <= end; k++) {
                    // print subarray
                    // subarray sum
                    currSum += numbers[k];
                    System.out.print(numbers[k] + " ");
                    total_SubArray++;
                }
                System.out.print(" Sum : " + currSum);
                System.out.println();
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
                if (minSum > currSum) {
                    minSum = currSum;
                }
            }
            System.out.println();
        }

        System.out.println("Total subarrays : " + total_SubArray);
        System.out.println("MaxSum : " + maxSum);
        System.out.println("MinSum ; " + minSum);
    }

    public static int prefix_Max_Subarray_Sum(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        int prefixSum = 0;

        // create an prefix array
        int prefix[] = new int[arr.length];
        // calculate prefix subarray
        prefix[0] = arr[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = 1; j < arr.length; j++) {
                int end = j;
                // prefix sum formula and condition that if start = 0;
                // the condition that prefix[start-1] will become -1
                // which is false, so we say when start == 0;
                // calculate till prefix[end]
                prefixSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];

                if (maxSum < prefixSum) {
                    maxSum = prefixSum;
                }
            }
        }

        return maxSum;
    }

    public static int kadane_Max_SubarraySum(int numbers[]) {
        // case if the array given is empty then :
        if (numbers == null || numbers.length == 0) {
            return 0;
        }

        int currSum = numbers[0];
        int maxSum = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            currSum = currSum > 0 ? currSum + numbers[i] : numbers[i];
            maxSum = Math.max(currSum, maxSum);
        }

        return maxSum;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int size;
        System.out.print("Enter the size of the array : ");
        size = input.nextInt();

        int arr[] = new int[size];
        System.out.println("(Enter a sorted array (ascending) for binary search program)");

        for (int i = 0; i < size; i++) {
            System.out.printf("Enter %d element(index) : ", i);
            arr[i] = input.nextInt();
        }

        System.out.println("Choose the method to run ");
        System.out.println("1. LinearSearch" + "\n2. Swap Pairs" + "\n3. Swap Numbers");
        System.out.println("4. Get Largest and smallest element from the array");
        System.out.println("5. Binary Search");
        System.out.println("6. Reverse of the array");
        System.out.println("7. Print the pairs of element in array");
        System.out.println("8. Print Subarrays");
        System.out.println("9. Max Subarray Sum (prefix sum method)");
        System.out.println("10. Maximum Subarray Sum (Kadane Algorithm)");
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
            case 5:
                System.out.print("Enter key to found : ");
                int binKey = input.nextInt();
                int binSearch = binarySearch(arr, binKey);
                if (binSearch == -1) {
                    System.out.println("The element is not present in the array ");
                } else {
                    System.out.println("The key is present at the index : " + binSearch);
                }
                break;
            case 6:
                System.out.println("Your Entered array is : ");
                printArray(arr);
                System.out.println("Reverse of the array is : ");
                reverseArray(arr);
                printArray(arr);
                break;
            case 7:
                printPairs(arr);
                break;
            case 8:
                System.out.print("Given array : ");
                printArray(arr);
                printSub_Array(arr);
                break;
            case 9:
                System.out.println("Given array : ");
                printArray(arr);
                int prefixSum_Max = prefix_Max_Subarray_Sum(arr);
                System.out.println("The maximum sum of the subarray is : " + prefixSum_Max);
                break;
            case 10:
                System.out.println("Given array : ");
                printArray(arr);
                int kadane = kadane_Max_SubarraySum(arr);
                System.out.println("The maximum sum of the subarray is : " + kadane);
                break;
            default:
                System.out.println("Invalid choice");
        }

        input.close();
    }

}
