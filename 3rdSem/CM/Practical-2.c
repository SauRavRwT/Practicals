//sum and average of 10 numbers.
#include <stdio.h>
#include <conio.h>

void main()
{
    int sum = 0, n, i = 1;
    float avg;
    // clrscr();
    while (i <= 10)
    {
        printf("Enter value : ", i);
        scanf("%d", &n);
        sum = sum + n;
        i++;
    }
    avg = sum / 10.0;
    printf("\nThe sum is: %d", sum);
    printf("\nThe average is : %f", avg);
    printf("\nSaurav Rawat");
    getch();
}