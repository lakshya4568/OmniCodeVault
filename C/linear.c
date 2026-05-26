#include <stdio.h>

int linearSearch(int arr[], int size, int key) {
    for (int i = 0; i < size; i++) {
        if (arr[i] == key) {
            return i;
        }
    }

    return -1;
}

int main()  {
    int size;
    printf("Enter the size of the array : ");
    scanf("%d", &size);

    int search[size];

    for (int i = 0; i < size; i++) {
        printf("Enter %d element (index) : ", i);
        scanf("%d", &search[i]);
    }

    int key;
    printf("Enter the key to found : ");
    scanf("%d", &key);

    int result = linearSearch(search, size,key);

    if(result == -1) {
        printf("This element is not found in the array\n");
    } else {
        printf("The element is at index %d\n", result);
    }



    return 0;
}