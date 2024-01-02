import java.util.*;

public class assignment {

    public static boolean checkDuplicate(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }

        return false;
    }
    
    public static int rotatedArraySearch(int arr[], int key) {
        // this question can be solved by using binary serach with little modification
        // binary search always applies on sorted array
        // in this case we can divide that left and right sorted half and apply the algorithm
        int start = 0;
        int end = arr.length - 1;
        
        while (start <= end) {
            int mid = start + (end - start) / 2;

            // comparision 
            // if mid element is the key then,
            if (arr[mid] == key) {
                return mid;
            }

            // check if the left half is sorted
            if (arr[start] <= arr[mid]) {
                // check if the target is in the left half
                if (arr[start] <= key && key < arr[mid]) {
                    end = mid - 1; // left 
                } else {
                    start = mid + 1; // right  
                }
            } else {
                // The right sorted half
                if (arr[mid] < key && key <= arr[end]) {
                    // check if the key is in right sorted half
                    start = mid + 1; // right
                } else {
                    end = mid - 1;
                }
            }

        }
        
        return -1; // if the target not found;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int arr[] = {5, 1, 4}; 

        // if (checkDuplicate(arr)) {
        //     System.out.println("Duplicate is present");
        // } else {
        //     System.out.println("Duplicate is not present ");
        // }
        
        int key = 4;
        
        if (rotatedArraySearch(arr, key) == -1) {
            System.out.println("The key is not found in the array");
        } else {
            System.out.println("The key is found at the index " + rotatedArraySearch(arr, key));
        }
        
        
        input.close();
    }
}
