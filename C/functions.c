#include <stdio.h>
#include <math.h>

void even_odd(int num) {
    if(num % 2 == 0) {
        printf("%d is even\n", num);
    } else {
        printf("%d is odd\n", num);
    }
}

void leap_year(int year) {
   if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0))) {
    printf("%d is a leap year\n", year);
    } else {
        printf("%d is not a leap year\n", year);
    }
}

void grading_system(int marks) {
    char grade;

    if(marks >= 90) {
        grade = 'A';
    } else if(marks >= 80) {
        grade = 'B';
    } else if(marks >= 70) {
        grade = 'C';
    } else if(marks >= 60) {
        grade = 'D';
    } else {
        grade = 'F';
    }
    printf("Grade: %c\n", grade);
}

void max_of_three(int a, int b, int c) {
    int max = a;
    if(b > max) {
        max = b;
    }
    if(c > max) {
        max = c;
    }
    printf("Max: %d\n", max);
}

/* function to find the area of triangle using heron's forumula*/
void area_of_triangle(float a, float b, float c) {
    float s = (a + b + c) / 2;
    float area = sqrt(s * (s - a) * (s - b) * (s - c));
    printf("Area: %f\n", area);
}

void temp_conversion(float temp, char specifier) {
    float converted_temp;
    if(specifier == 'C') {
        converted_temp = (temp * 9 / 5) + 32;
        printf("Converted temperature: %f F\n", converted_temp);
    } else if(specifier == 'F') {
        converted_temp = (temp - 32) * 5 / 9;
        printf("Converted temperature: %f C\n", converted_temp);
    } else {
        printf("Invalid specifier\n");
    }
}

/* To find the quadratic equation*/
void quadratic_equation(int a, int b, int c) {
    float discriminant = (b * b) - (4 * a * c);
    float root1, root2;
    if(discriminant > 0) {
        root1 = (-b + sqrt(discriminant)) / (2 * a);
        root2 = (-b - sqrt(discriminant)) / (2 * a);
        printf("Roots are: %f and %f\n", root1, root2);
    } else if(discriminant == 0) {
        root1 = root2 = -b / (2 * a);
        printf("Roots are: %f and %f\n", root1, root2);
    } else {
        printf("Roots are imaginary\n");
    }
}
 
void height_conversion(float height) {   // height in cm
    float feet = height / 30.48;
    float inches = height / 2.54;
    printf("Height in feet: %f\n", feet);
    printf("Height in inches: %f\n", inches);
}

int sum_of_digits(int num) {
    int sum = 0;
    while (num != 0) {
        int last_digit = num % 10;
        num = num / 10;
        sum += last_digit;
    }

    return sum;
}

int main() {

   /* int num;
    printf("Enter a number : ");
    scanf("%d", &num);
    even_odd(num);   */

   /* int year;
    printf("Enter a year : ");
    scanf("%d", &year);
    leap_year(year); */

   /* int marks = 85;
    grading_system(marks);

    int a = 10, b = 20, c = 30;
    max_of_three(a, b, c);

    float x = 3, y = 4, z = 5;
    area_of_triangle(x, y, z);

    float temp = 100;
    char specifier = 'C';
    temp_conversion(temp, specifier);

    int a1 = 1, b1 = 2, c1 = 1;
    quadratic_equation(a1, b1, c1);

    float height = 100;   // height in cm
    height_conversion(height);      
    
    */

   int num;
   printf("Enter the total no. of digits : ");
   scanf("%d", &num);
   int sumDigits = sum_of_digits(num);
   printf("The sum of these digits is %d \n", sumDigits);

   return 0;
}