#include <stdio.h>
#include <math.h>

int main() {

    double num1, num2;
    char op;
    char choice;

    do
    {
        printf("Enter 1st number : ");
        scanf("%lf", &num1);

        printf("Enter 2nd operand : ");
        scanf("%lf", &num2);

        getchar();

        printf("Enter the operation That you want to perform : \n");
        printf("[+] [-] [*] [/] [Mod] \n");
        scanf("%c", &op);

        switch (op)
        {
        case'+':
            printf("The sum of these two numebers is : %lf\n", (num1 + num2));
            break;
        case '-' :
            printf("The differnece of these two numebers is : %lf \n", (num1 - num2));
            break;
        case '*' :
            printf("The product of these two numebers is : %lf \n", (num1 * num2));
            break;
        case '/' :
            printf("The quotient of the these two numebers is : %lf \n", (num1 / num2));
            break;
        case '%' :
            printf("The remainder of these two numebers is : %f \n", fmod(num1, num2));
            break;
        default:
            printf("Invalid choice\n");
            break;
        }
        getchar();
        
        printf("Do you want to continue : (Y/N) \n");
        scanf("%c", &choice);
    } while (choice == 'y' || choice == 'Y');
}