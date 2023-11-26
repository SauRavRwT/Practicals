//fibonacci series
#include <stdio.h>
#include <conio.h>

int main()
{
    int i, n;
    int t1 = 0, t2 = 1;
    int next_term = t1 + t2;
    //clrscr();
    printf("Enter the number of term: ");
    scanf("%d", &n);
    printf("Fibonacci series: %d, %d\n ", t1, t2);

    for (i = 3; i <= n; i++)
    {
        printf("%d\n", next_term);
        t1 = t2;
        t1 = next_term;
        next_term = t1 + t2;
    }
    printf("\nSaurav Rawat\n");
    getch();
    return 0;
}