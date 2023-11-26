#include <stdio.h>
#include <math.h>
#include <stdlib.h>
#define f(x) x - cos(x)
#define g(x) 1 + sin(x)
#define e 0.0001

int main()
{
    float x0, x1, x2, x3, f0, f1, f2, g0;
    int i = 1, N;
    printf("\nEnter initial guess: ");
    scanf("%f%f", &x1,&x2);
    printf("\nEnter Maximum Iterations: ");
    scanf("%d", &N);
    f1 = f(x1);
    f2 = f(x2);
    if (f1 * f2 > 0.0)
    {
        printf("\nWrong initial guess, Try other values\n");
        exit(0);
    }
    else
    {
        if (fabs(f1) < fabs(f2))
            x0 = x1;
        else
            x0 = x2;
        do
        {
            f0 = f(x0);
            g0 = g(x0);
            x1 = x0 - (f0 / g0);
            printf("\nIterations Number: %d\t\t", i);
            printf("\nApproximate Root: %f\t\t", x1);
            x0 = x1;
            i++;
            if (i > N)
            {
                printf("\nNOT CONVERGENT, Change maximum Iterations\n");
                exit(0);
            }
            printf("\nValue of function: %f\n", f(x1));
            f1=f(x1);
        }
        while (fabs(f0/g0)>e);
        printf("\nHence Root is: %6.4f\n",x1);
    }
}
