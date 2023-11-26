//simpsons 3/8
#include <stdio.h>
#include <math.h>
#define e 0.001
#define f(x) 1 / (1 + x * x)
int main()
{
    int i, n;
    float a, b, l, h, k, m, p = 0.0, q = 0.0;
    printf("Enter value of lower limit: ");
    scanf("%f", &a);
    printf("Enter value of upper limit: ");
    scanf("%f", &b);
    printf("Enter the number of sub-interval: ");
    scanf("%d", &n);
    h = (b - a) / n;
    l = f(a) + f(b);
    for (i = 1; i <= n - 1; i++)
    {
        k = a + (i * h);
        if (i % 3 == 0)
        {
            p = p + 2 * f(k);
        }
        else
        {
            q = q + 3 * f(k);
        }
        m = (3 * h / 8) * (l + p + q);
    }
    printf("\nRequired value of integration is %f\n", m);
    return 0;
}