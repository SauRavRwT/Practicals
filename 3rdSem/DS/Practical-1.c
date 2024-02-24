// sparse matrix
#include <stdio.h>
#include <conio.h>

int main()
{
    int i, j, SM[10][10], CM[10][10], k = 0, size, a, b;
    size = 0;

    for (i = 0; i < 4; i++)
    {
        for (j = 0; j < 4; j++)
        {
            printf("\nSparse Matrix:[%d][%d]", i, j);
            scanf("%d", &SM[i][j]);
        }
    }

    for (i = 0; i < 4; i++)
        for (j = 0; j < 4; j++)
        {
            if (SM[i][j] != 0)
            {
                size++;
            }
        }
    for (i = 0; i < 4; i++)
        for (j = 0; j < 4; j++)
        {
            if (SM[i][j] != 0)
            {
                CM[0][k] = i;
                CM[1][k] = j;
                CM[2][k] = SM[i][j];
                k++;
            }
        }
    for (a = 0; a < 4; a++)
    {
        for (b = 0; b < 4; b++)
        {
            printf("%d", CM[a][b]);
            printf("\t");
        }
        printf("\n");
    }
    getch();
    return 0;
}