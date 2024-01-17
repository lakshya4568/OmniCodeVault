#include <stdio.h>



int fun(int x, int y) {
    if (x == 0) {
        return y;
    } else {
        return fun(x - 1, x + y);
    }
} 

int main() {
    int num;
    printf("Enter a number : ");
    scanf("%d", &num);

    int fuxn = fun(5, 4);
    printf("%d\n`", fuxn);

    return 0;
}
