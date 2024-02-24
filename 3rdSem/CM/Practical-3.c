//Multiplication of 2 Matrix
#include <stdio.h>
#include <conio.h>

void main(){
    int r = 2, c = 2, a[2][2], b[2][2], mult[2][2], i, j, k;
    // clrscr();
    for (i = 0; i < r; i++){
        for (j = 0; j < c; j++){
            printf("Enter element A%d %d : ", i + 1, j + 1);
            scanf("%d", &a[i][j]);
        }
    }
    for (i = 0; i < r; i++){
        for (j = 0; j < c; j++){
            printf("Enter element B%d %d : ", i + 1, j + 1);
            scanf("%d", &b[i][j]);
        }
    }
    for (i = 0; i < r ; i++){
        for (j = 0; j < c; j++){
            mult[i][j] = 0;
        }
    }
    for (i = 0; i < r; i++){
        for (j = 0; j < c; j++){
            for (k = 0; k < 2; k++){
                mult[i][j] += a[i][k] * b[k][j];
            }
        }
    }
    printf("\nMatrix A:\n");
    for (i = 0; i < r; i++){
        for (j = 0; j < c; j++){
            printf("\t %d", a[i][j]);
        }
        printf("\n");
    }
    printf("\nMatrix B:\n");
    for (i = 0; i < r; i++){
        for (j = 0; j < c; j++){
            printf("\t %d", b[i][j]);
        }
        printf("\n");
    }
    printf("\nMultiplication of two Matrix:\n");
    for (i = 0; i < r; i++){
        for (j = 0; j < c; j++){
            printf("\t %d", mult[i][j]);
        }
        printf("\n");
    }
    printf("\nSaurav Rawat\n");
    getch();
    // return 0;
}