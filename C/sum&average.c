// practical 5
#include <stdio.h>
#include <conio.h>

int main()
{
    float eng, chem, math, phy, comp;
    float sum, average;
    printf("\nEnter the marks of 5 subjetcs: ");
    scanf("%f%f%f%f%f", &eng, &chem, &math, &phy, &comp);
    sum = eng + chem + math + phy + comp;
    average = sum / 5.0;
    printf("\nTotal marks obtained: %2f", sum);
    printf("\nAverage of marks: %2f", average);
    getch();
};