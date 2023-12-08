#include <stdio.h>


int linearSearch(int arr[], int size, int key) {
    for (int i = 0; i < size; i++) {
        if (arr[i] == key) {
            return i;
        }
    }

    return -1;
}

void printARR(int arr[], int size) {
    printf("The array data is : ");
    for (int i = 0; i < size; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n");
}

int main() {

    int size;
    printf("Enter size of the array : ");
    scanf("%d", &size);

    int arr[size];
    for (int i = 0; i < size; i++) {
        printf("Enter element %d: ", i+1);
        scanf("%d", &arr[i]); // Added this line to initialize array elements
    }

    printARR(arr, size);

    int key;
    printf("Enter key to search : ");
    scanf("%d", &key);

    int result = linearSearch(arr, size, key);

    if (result != -1) {
        printf("key found at index %d \n", result);
    }
    else {
        printf("key is not found in the array \n");
    }
}   

