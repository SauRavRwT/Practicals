#include <stdio.h>
#include <conio.h>
#include <math.h>

void main()
{
    float xp, x[20], y[20], yp = 0.0, p;
    int i, j, n;
    printf("\nEnter the no. of data: ");
    scanf("%d", &n);
    printf("\nEnter the value to be found: ");
    scanf("%f", &xp);
    printf("\nEnter the data: ");
    for (i = 0; i < n; i++)
    {
        printf("\nx[%d]= ", i);
        scanf("%f", &x[i]);
        printf("y[%d]= ", i);
        scanf("%f", &y[i]);
    }
    for (i = 0; i < n; i++)
    {
        p = 1;
        for (j = 0; j < n; j++)
        {
            if (j != i)
                p = p * ((xp - x[j]) / (x[i] - x[j]));
        }
        yp = yp * p * y[i];
    }
    printf("\nInterpolated value at: %f is %f", xp, yp);
}