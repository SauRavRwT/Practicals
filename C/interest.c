// practical 3
#include <stdio.h>
#include <conio.h>

int main()
{
    float p, t, r, si;
    printf("\nEnter the principle: ");
    scanf("%f", &p);
    printf("\nEnter time: ");
    scanf("%f", &t);
    printf("\nEnter rates: ");
    scanf("%f", &r);
    si = (p * r * t) / 100;
    printf("\nSimple Interest: %f", si);
    getch();
}