#include <stdio.h>

void hollow_rectangle(int rows, int cols) {
    for (int i = 1; i <= rows; i++) {
        for (int j = 1; j <= cols; j++) {

            if (i == 1 || i == rows || j == 1 || j == cols) {
                printf("*");
            } else {
                printf(" ");
            }
        }
        printf("\n");
    }
}

/* print the following pattern in this format
    A
   B C D
  E F G H I
 J K L M N O P 
    */

void alphabet_pyramid(int lines) {
    int alphabet = 65;
    int spaces = lines - 1;
    int chars = 1;

    for (int i = 1; i <= lines; i++) {
        for (int j = 1; j <= spaces; j++) {
            printf(" ");
        }

        for (int j = 1; j <= chars; j++) {
            printf("%c", alphabet);
            alphabet++;
        }

        printf("\n");
        spaces--;
        chars += 2;
    }
}

void inverted_half_pyramid(int lines) {
    for (int i = 1; i <= lines; i++) {
        for (int j = 1; j <= (lines - i); j++) {
            printf("*");
        }

        printf("\n");
    }
}

int main() {
   /* { 
        int rows, cols;
    
        printf("Enter the number of rows: ");
        scanf("%d", &rows);

        printf("Enter the number of columns: ");
        scanf("%d", &cols);

        hollow_rectangle(rows, cols);
    } 

    {
        int lines;
        printf("Enter the number of lines: ");
        scanf("%d", &lines);

        alphabet_pyramid(lines);
    } */

    {
        int lines;
        scanf("%d", &lines);
        inverted_half_pyramid(lines);
    }

}

