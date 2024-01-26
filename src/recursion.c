#include <stdio.h>

int factorial(int num)
{
    int fact;
    if (num == 1)
    {
        return 1;
    }
    else
    {
        fact = num * factorial(num - 1);
    }
    return fact;
}

void factorize(int num, int i) {
    if (i <= num) {
        if (num % i == 0) {
            printf("%d ", i);
            num = num / i;
        } else {
            i++;
        }

        factorize(num, i);
    }
}

int main()
{
   /* {
        int num;
        printf("Enter a number : ");
        scanf("%d", &num);

        int fun = factorial(num);
        printf("factorial is this : %d\n", fun);
    } */

    {
        int num;
        printf("Enter a number : ");
        scanf("%d", &num);

        factorize(num, 2);
    }

    return 0;
}
