#include <stdio.h>

int main() {

    int number;
    printf("Enter a number : ");
    scanf("%d", &number);

    if (2 % number == 0) {
        printf("This is odd ");
    } else {
        printf("ODD\n");
    }

    return 0;
}