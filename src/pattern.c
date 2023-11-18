#include <stdio.h>

int mini(int arr[], int n ) {
    // minimum function of array
    int min = arr[0];
    for (int i = 0; i < n; i++) {
        if (arr[i] < min) {
            min = arr[i]; 
        }
    }
    return min;
}

void swapping(int x, int y) {
    int z;
    z = x;
    x = y;
    y = z;
}

int main() {

    int n1, n2;
    printf("Enter two numbers: ");
    scanf("%d %d", &n1, &n2);

    printf("Before swapping: %d %d\n", n1, n2);
    swapping(n1, n2);
    printf("After swapping: %d %d\n", n1, n2);

    return 0;
}


