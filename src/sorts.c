#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

void printArr(int *arr, int size);

void bubbleSort(int *arr, int size) {
    for (int i = 0; i < size - 1; i++) {
        bool swaps = false;
        for (int j = 0; j < (size-1)-i; j++) {
            if(*(arr+j) > *(arr+j+1)) {
                // swap
                int temp = *(arr + j);
                *(arr + j) = *(arr + j + 1);
                *(arr + j + 1) = temp;
                swaps = true;  
            }
        }
        if(!swaps) break;
    }
    printArr(arr, size);
    printf("\n");
}

void selectionSort(int *arr, int size) {
    for (int i = 0; i < size - 1; i++) {
        int minPos = i;
        for (int j = i + 1; j < size; j++) {
            if(arr[minPos] > arr[j]) {
                minPos = j;
            }
        }
        // swap
        int temp = arr[minPos];
        arr[minPos] = arr[i];
        arr[i] = temp;
    }
    printArr(arr, size);
    printf("\n");
}

void insertionSort(int *arr, int size) {
    
}

void printArr(int *arr, int size) {
    for (int i = 0; i < size; i++) {
        printf("%d ", *(arr + i));
    }
    printf("\n");
}

int main() {

    int size;
    printf("Enter the size of the array : ");
    scanf("%d", &size);

    int *arr = (int *) malloc(size * sizeof(int));

    for (int i = 0; i < size; i++) {
        printf("Enter the %d element : ", i);
        scanf("%d", arr + i);
    }

    printf("Array before sorts : ");
    printArr(arr, size);
    printf("Array after sort : ");
    selectionSort(arr, size);

    return 0;
}