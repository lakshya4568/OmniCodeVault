#include <stdio.h>

int factorial(int num) {
    int fact;
    if (num == 1) {
        return 1;
    } else {
        fact = num * factorial(num-1);
    }
    return fact;
}

int main() {
    int num;
    printf("Enter a number : ");
    scanf("%d", &num);

    int fun = factorial(num);
    printf("factorial is this : %d\n", fun);

    return 0;
}
