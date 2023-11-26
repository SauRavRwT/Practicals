// insert data in a array
#include <stdio.h>
#include <conio.h>

int insert_array(char *, int, int, char);
void input(char *, int);
void display(char *, int);
int insert_array(char array[], int number, int position, char element)
{
    int temp = number;
    while (temp >= position)
    {
        array[temp + 1] = array[temp];
        temp--;
    }
    array[position] = element;
    number = number + 1;
    return (number);
}

void input(char array[], int number)
{
    int i;
    for (i = 1; i <= number; i++)
    {
        fflush(stdin);
        printf("\nInput the value for:%d- ", i);
        scanf("%c", &array[i]);
    }
}
void display(char array[], int number)
{
    int i;
    for (i = 1; i <= number; i++)
    {
        printf("\nThe character at is: %d %c", i, array[i]);
    }
}
void main()
{
    int number, position;
    char element, array[10];
    // clrscr();
    fflush(stdin);
    printf("\nEnter the number of elements in List: ");
    scanf("%d", &number);
    fflush(stdin);
    input(array, number);
    printf("\nYour list as follows: ");
    fflush(stdin);
    display(array, number);
    fflush(stdin);
    printf("\nEnter the position where you want to add new data: ");
    scanf("%d", &position);
    fflush(stdin);
    printf("\nEnter the new data you want to add: ");
    scanf("%c", &element);
    number = insert_array(array, number, position, element);
    display(array, number);
}