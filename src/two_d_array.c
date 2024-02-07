#include <stdio.h>

// create a fucntion to display 2d matrix

void display(int arr[][3], int row, int col) { 
    for (int i = 0; i < row; i++) {
        for(int j = 0; j < col; j++) {
            printf("%d ", arr[i][j]);
        }
        printf("\n");
    }
}

void matrixMultiplcation(int mat1[][3], int mat2[][3], int result[][3], int row1, int col1, int row2, int col2) {
    if(col1 != row2) {
        printf("Matrix multiplication is not possible");
        return;
    }
    for (int i = 0; i < row1; i++) {
        for(int j = 0; j < col2; j++) {
            result[i][j] = 0;
            for(int k = 0; k < col1; k++) {
                result[i][j] += mat1[i][k] * mat2[k][j];
            }
        }
    }
}

void displayCompact(int compact[][3], int row, int col) {
    for (int i = 0; i < row; i++) {
        for(int j = 0; j < col; j++) {
            printf("%d ", compact[i][j]);
        }
        printf("\n");
    }
}

int main() {

    int sparse[4][4] = { {0,0,0,1}, 
                         {0,2,0,0},
                         {0,0,0,9},
                         {5,0,0,0} };

    // Check if the matrix is sparse or not
    int C1 = 0; 
    int C2 = 0;
    for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 4; j++) {
            if (sparse[i][j] != 0) {
                C1++;
            } else {
                C2++;
            }
        }
    }

    int compact[4][C1];
    int k = 0;
    for (int i = 0; i < 4; i++)
        for (int j = 0; j < 5; j++)
            if (sparse[i][j] != 0)
            {
                compact[0][k] = i;
                compact[1][k] = j;
                compact[2][k] = sparse[i][j];
                k++;
            }

    for (int i = 0; i < 4; i++)
    {
        for (int j = 0; j < C1; j++)
            printf("%d ", compact[i][j]);
 
        printf("\n");
    }

    printf("The value of c1 is %d and c2 is %d\n ", C1, C2);

    if (C1 > C2) {
        printf("Matrix is sparse.\n");
    } else {
        printf("Matrix is not sparse.\n");
    } 

    return 0;
}