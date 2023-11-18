#include <stdio.h>

void inverted_Halfpyramid(int rows) {
    for (int i = 1; i <= rows; i++) {
        for (int j = 1; j <= (rows-i)+1; j++) {
            printf("* ");
        }
        printf("\n");
    }
}

int main() {
    
    inverted_Halfpyramid(5);

    return 0;
}