#include <stdio.h>

int main() {
    /* fibonnaci series*/
    // the sum of the first two term is the third term, thus the first two terms of the series is predefined

    int first_term = 0;
    int second_term = 1;
    int third_term = first_term + second_term;

    printf("%d %d ", first_term, second_term);

    for (int i = 1; i <= 10; i++) {
        printf("%d ", third_term);
        first_term = second_term;
        second_term = third_term;
        third_term = first_term + second_term;
    }

    // sum of first n terms of fibonnaci series

    int n;
    printf("\nEnter the number of terms: ");
    scanf("%d", &n);

    int sum = 0;
    first_term = 0;
    second_term = 1;
    third_term = first_term + second_term;
    
}