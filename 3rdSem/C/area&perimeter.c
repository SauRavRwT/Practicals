// practical 4
#include <stdio.h>
#include <conio.h>

int main()
{
    float length, breadth, area, perimeter;
    printf("\nEnter length of the Rectangle: ");
    scanf("%f", &length);
    printf("\nEnter breadth of the Rectangle: ");
    scanf("%f", &breadth);
    area = length * breadth;
    perimeter = 2 * (length * breadth);
    printf("\nArea of Rectangle: %f", area);
    printf("\nPerimeter of Rectangle: %f", perimeter);
    getch();
}