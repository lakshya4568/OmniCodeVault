#include <stdio.h>  
#include <iostream>
#include <stdlib.h>

using namespace std;


void hollow_rectangle(int rows, int columns) {
    for (int i = 1; i <= rows; i++)
    {
        for (int j = 1; j <= columns; j++)
        {
            if (i == 1 || i == rows || j == 1 || j == columns)
            {
                printf("*");
            } 
                else 
            {
                printf(" ");
            }
            
        }

        cout << "\n";
    }
    
}

int main() {

    int rows, columns;

    cout << "Enter no. of rows : ";
    cin >> rows;

    cout << " Enter no. of columns : ";
    cin >> columns;

    hollow_rectangle(rows, columns);

    return 0;
}