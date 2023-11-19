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

        input.close();
    }
    
    
}
