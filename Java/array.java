import java.util.*;

public class array {
    public static int getLargest(int numbers[]) {
        int largest = numbers[0];
        //  Integer.MIN_VALUE = -infinity
        //  Integer.MAX_VALUE = infinity
        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
        }
        return largest;
    }

/*  In this binary code, we will declare an array which should be in a sorted form, ascending or descing, 
     * this we will start array and end array, and start form middle, when key = mid, return mid
     * if mid < key then start = mid + 1; 
     * if mid > key then end = mid -1; 
*/
public static int binarySearch(int arr[], int key) {
    int start = 0, end = arr.length - 1;
    while (start <= end) {
        int mid = (start + end) / 2;
        if (arr[mid] == key) {
            return mid; // element found (index)
        } else if (arr[mid] < key) {
            start = mid + 1; // right half              
        } else {
            end = mid - 1; // left half
        }
    }

    return -1;
}


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the array : ");
        int size = input.nextInt();

        int arr[] = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Enter %dth element (index) : ", i);
            arr[i] = input.nextInt();
        }

        System.out.print("Enter the key to be found : ");
        int key = input.nextInt();

        int largest = getLargest(arr);
        int BinSearch = binarySearch(arr, key);

        System.out.println("This element is present at index : " + BinSearch);
        System.out.println("This is the largest element in the array : " + largest);
        input.close();
    }
}

