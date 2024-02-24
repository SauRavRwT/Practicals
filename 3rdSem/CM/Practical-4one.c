#include <stdio.h>
#include <math.h>
#define f(x) x *x *x + x - 1
#define e 0.001

int main()
{
    float a, b, x1, fa, fb, fx1;
    int i = 0;
    printf("\nEnter 2 initial guess: ");
    scanf("%f\n%f", &a, &b);
    fa = f(a);
    fb = f(b);
    if (fa * fb > 0)
        printf("\nIncorrect initial guess: ");
    else
        do
        {
            x1 = (a + b) / 2;
            fx1 = f(x1);
            if (f(x1) < 0)
                a = x1;
            else
                b = x1;
            i++;
            printf("\nNO. of iterations: %d\t", i);
            printf("\nRoot is: %f", x1);
            printf("\nValue of function: %f\n", fx1);
        } while (fabs(b - a) >= e);
}
