#include <stdio.h>

int main() {

    int num, sum;

    printf("Enter the 3 digit number : ");
    scanf("%d", &num);

    sum = 0;

    for (int i = 1; i <= num; i++) {
        int last_digit = num % 10;
        num = num / 10;
        sum = sum + last_digit;
    }

    printf("The sum of these three digit is %d \n", sum);

    return 0;
}