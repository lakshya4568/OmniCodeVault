#include <stdio.h>

int main() {
    float a, b;
    int choice;

    printf("Enter two numbers: ");
    scanf("%f %f", &a, &b);

    printf("Enter choice:\n");
    printf("1. Add\n");
    printf("2. Subtract\n");
    printf("3. Multiply\n");
    printf("4. Divide\n");
    printf("5. Modulus\n");
    scanf("%d", &choice);

    switch (choice) {
        case 1:
            printf("Sum: %f\n", a + b);
            break;
        case 2:
            printf("Difference: %f\n", a - b);
            break;
        case 3:
            printf("Product: %f\n", a * b);
            break;
        case 4:
            printf("Quotient: %f\n", a / b);
            break;
        case 5:
            printf("Remainder: %f\n", fmod(a, b));
            break;
        default:
            printf("Invalid choice\n");
    }

    return 0;
}