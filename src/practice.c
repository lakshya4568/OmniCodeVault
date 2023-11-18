#include <stdio.h>

int factorial(int num) {
    int fact = 1;
    for (int i = 1; i <= num; i++)
    {
        fact = fact * i;
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
