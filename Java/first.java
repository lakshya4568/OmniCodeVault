import java.util.*;

public class first {

    public static int linearSearch(int array[], int size, int key) {
        for (int i = 0; i < size; i++) {
            if (array[i] == key) {
                return i;
            }
        }
            return -1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
        int size;
        System.out.print("Enter the size of the array : ");
        size = input.nextInt();

        int search[] = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.printf("Enter %d element(index) : ", i);
            search[i] = input.nextInt();
        }

        System.out.print("Enter the element to found (key) : ");
        int key = input.nextInt();

        int result = linearSearch(search, size, key);
        
        if (result == -1) {
            System.out.println("The element is not present in the array");
        } else {
            System.out.println("Element is present at index : " + result);
        }

        input.close();
    }
}