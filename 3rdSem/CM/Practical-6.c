// trapezodial
#include <stdio.h>
#include <math.h>
#define f(x) x + (1 / x)
int main()
{
    float a, b, fa, fb, h, k, m, I = 0.0;
    int i, n;
    printf("Enter lower limit: ");
    scanf("%f", &a);
    printf("Enter upper limit: ");
    scanf("%f", &b);
    printf("Enter the no. of Sub-interval: ");
    scanf("%d", &n);
    h = (b - a) / n;
    fa = f(a);
    fb = f(b);
    m = fa - fb;
    for (i = 1; i <= n - 1; i++)
    {
        k = a + i * h;
        m = m + 2 * f(k);
    }
    I = m * (h / 2);
    printf("\nRequired value of Interation is : %f", I);
}