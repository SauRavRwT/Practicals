// transversing array
#include <stdio.h>
#include <conio.h>

void transversing_array(int *, int, int);
void input(int *, int, int);
// definition of the function
void transversing_array(int linear_array[], int lb, int ub)
{
    int counter;
    for (counter = lb; counter <= ub; counter++)
    {
        printf("\nElement at position: %d is %d", counter, linear_array[counter]);
    }
}

void input(int array[], int lb, int ub)
{
    int counter;
    for (counter = lb; counter <= ub; counter++)
    {
        printf("\nInput value for the: %d", counter);
        scanf("%d", &array[counter]);
    }
}

void main()
{
    int a[10];
    int lb, ub;
    printf("\nLower limit of the array: ");
    scanf("%d", &lb);

    printf("\nUpper limit of the array: ");
    scanf("%d", &lb);

    input(a, lb, ub);
    transversing_array(a, lb, ub);
    getch();
}