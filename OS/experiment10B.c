// Write C programs to implement the various File Organization Techniques.
// Indexed File Organization

#include <stdio.h>

struct Student
{
    int roll;
    char name[50];
    float marks;
};

struct Index
{
    int roll;
    long offset;
};

int main()
{
    FILE *dataFile, *indexFile;
    struct Student student;
    struct Index index;

    // Writing to data file and creating index
    dataFile = fopen("students.dat", "wb");
    if (dataFile == NULL)
    {
        perror("Error opening data file");
        return 1;
    }

    indexFile = fopen("index.txt", "w");
    if (indexFile == NULL)
    {
        perror("Error opening index file");
        fclose(dataFile);
        return 1;
    }

    printf("Enter student details (Roll, Name, Marks):\n");
    while (scanf("%d %s %f", &student.roll, student.name, &student.marks) != EOF)
    {
        long offset = ftell(dataFile);
        fwrite(&student, sizeof(struct Student), 1, dataFile);
        fprintf(indexFile, "%d %ld\n", student.roll, offset);
    }

    fclose(dataFile);
    fclose(indexFile);

    // Reading from data file using index
    indexFile = fopen("index.txt", "r");
    if (indexFile == NULL)
    {
        perror("Error opening index file");
        return 1;
    }

    dataFile = fopen("students.dat", "rb");
    if (dataFile == NULL)
    {
        perror("Error opening data file");
        fclose(indexFile);
        return 1;
    }

    printf("\nStudent details:\n");
    while (fscanf(indexFile, "%d %ld", &index.roll, &index.offset) != EOF)
    {
        fseek(dataFile, index.offset, SEEK_SET);
        fread(&student, sizeof(struct Student), 1, dataFile);
        printf("Roll: %d, Name: %s, Marks: %.2f\n", student.roll, student.name, student.marks);
    }

    fclose(dataFile);
    fclose(indexFile);

    return 0;
}
