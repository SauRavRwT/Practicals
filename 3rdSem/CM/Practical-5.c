// secant method
#include <stdio.h>
#include <math.h>
#include <stdlib.h>
#define f(x) 0.5 + sin(x) - (x)
#define e 0.001

int main()
{
    float x0, x1, x2, f0, f1, f2;
    int i = 0;
    printf("\nEnter the value of x0 and x1: ");
    scanf("%f%f", &x0, &x1);
    do
    {
        f0 = f(x0);
        f1 = f(x1);
        x2 = ((x0 * f1) - (x1 * f0)) / (f1 - f0);
        f2 = f(x2);
        f0 = f1;
        x0 = f2;
        x0 = x1;
        x1 = x2;
        i++;
        printf("\nNo. of Iterations: %d\t\t", i);
        printf("\nRoot is: %f\t\t", x2);
        printf("\nValue of function is: %f\n", f2);
    } while (fabs(f2) > e);
}