import java.util.Arrays;

public class leet1 {

    public static int[] twoSums(int arr[], int target) {
        int size = arr.length;

        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[] { i, j }; // return the index in case it matches;
                }
            }
        }
        // in case of no solutions
        return new int[] {};    
    }    

    public static void main(String[] args) {
        int arr[] = { 2, 7, 11, 15 };
        int target = 9;

        int result[] = twoSums(arr, target);

        System.out.println(Arrays.toString(result));
    }    
}