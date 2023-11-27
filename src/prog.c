#include <stdio.h>
int main() {
    int a = 5, b = 6, c, d;
    c = --a * a++ * ++b - b++;
    d = c-- * a-- * b++ * ++c;
    printf("%d%d%d%d", a, b, c, d);
    printf("\n");
    return 0;
}