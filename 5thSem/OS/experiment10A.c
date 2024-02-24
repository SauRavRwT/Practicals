// Write C programs to implement the various File Organization Techniques.
// Sequential File Organization

#include <stdio.h>

struct Student
{
    int roll;
    char name[50];
    float marks;
};

int main()
{
    FILE *file;
    struct Student student;

    // Writing to file sequentially
    file = fopen("students.txt", "w");
    if (file == NULL)
    {
        perror("Error opening file");
        return 1;
    }

    printf("Enter student details (Roll, Name, Marks):\n");
    while (scanf("%d %s %f", &student.roll, student.name, &student.marks) != EOF)
    {
        fprintf(file, "%d %s %.2f\n", student.roll, student.name, student.marks);
    }

    fclose(file);

    // Reading from file sequentially
    file = fopen("students.txt", "r");
    if (file == NULL)
    {
        perror("Error opening file");
        return 1;
    }

    printf("\nStudent details:\n");
    while (fscanf(file, "%d %s %f", &student.roll, student.name, &student.marks) != EOF)
    {
        printf("Roll: %d, Name: %s, Marks: %.2f\n", student.roll, student.name, student.marks);
    }

    fclose(file);

    return 0;
}
