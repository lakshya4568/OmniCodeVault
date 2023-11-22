#include <stdio.h>

void sum_Of_Digits(int num) {
    int sum = 0;

    while (num != 0) {
        sum += num % 10;
        num /= 10;
    }

    printf("Sum of digits: %d\n", sum);
}

void fibonacci(int n, int first, int second) {
    
    printf("Fibonacci Series: ");
    printf("%d, %d, ", first, second);

    for (int i = 2; i < n; i++) {
        int next = first + second;
        printf("%d, ", next);
        first = second;
        second = next;
    }

    printf("\n");
}



int main() {
    
    sum_Of_Digits(3443);
    fibonacci(10, 3, 5);


    return 0;
}
