#include <stdio.h>

void SwapPairs(int arr[], int size) {
    for (int i = 0; i < size - 1; i += 2) {
        int temp = arr[i];
        arr[i] = arr[i + 1];
        arr[i + 1] = temp;
    }
}

void printArray(int arr[], int size) {
    for (int i = 0; i < size; i++) {
        printf("%d ", arr[i]);
    }
}

int main() {
    int size;
    printf("Enter size of the array : ");
    scanf("%d", &size);

    int arr[size];
    for (int i = 0; i < size; i++) {
        printf("Enter %d element (index) : ", i);
        scanf("%d", &arr[i]);
    }

    printf("Original Array : ");
    printArray(arr, size);

    SwapPairs(arr, size);

    printf("\nArray after swapping consecutive pairs: ");
    printArray(arr, size);

    printf("\n");
    
    return 0;
}